package com.xunfeng.test;

import com.xunfeng.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RefletionTest1 {

    //1.创建入口函数main()--不用

    /**
     * 单元测试方法:是java测试的最小单位,使用灵活,推荐使用
     * 语法要求: @Test + void + 没有参数 + public
     * 注意使用时需要导包:Add JUnit 4 library to the build path:import org.junit.Test;
     * 单元测试方法执行方式:选中方法名-->右键运行(Run As-->JUnit Test)-->出现小绿条说明执行成功
     */
    //2.通过单元测试来测试如何获取类对象
    @Test
    public void getClazz() throws Exception {
        /**右键要获取字节码对象的类名,选择Copy Quailfied Name复制类的全路径名*/
        Class<?> student1 = Class.forName("cn.tedu.reflection.Student");//此处的参数是类的全路径名[包名+类名]
        Class<?> student2 = Student.class;
        Class<?> student3 = new Student().getClass();//先创建匿名对象,匿名对象没有名字,然后对象的字节码对象
        System.out.println(student1);//反射得到的字节码Class对象
        System.out.println(student2.getName());//获取类的全路径名[包名+类名]
        System.out.println(student3.getSimpleName());//只获取类名
        System.out.println(student3.getPackage().getName());//获取包名
    }

    //3.通过单元测试来测试如何获取构造方法
    @Test
    public void getConstruct() {
        //1.获取字节码Class对象
        Class<?> clazz = Student.class;
        //2.获取构造方法们,并放入cs数组中
        Constructor<?>[] cs = clazz.getConstructors();
        //3.获取每个构造
        //使用增强for循环完成
        //for(1 2 : 3){循环体}其中3是要遍历的数据,1是遍历后每个元素的数据类型 2是遍历后每个数据的变量名
        for (Constructor c : cs) {
            //拿到每个构造方法以后可以获取构造方法的相关信息
            System.out.println(c.getName());//获取构造方法的名称
            Class[] cp = c.getParameterTypes();//获取构造方法的参数类型,可能有多个
            System.out.println(Arrays.toString(cp));
        }
    }

    //4.通过单元测试来测试获取成员方法
    @Test
    public void getFunction() throws Exception {
        //1.获取Class字节码对象
        Class<?> clazz = Class.forName("com.xunfeng.entity.Student");

        //2.获取所有成员方法
        Method[] ms = clazz.getMethods();

        //3.遍历数组,获取每个方法的信息
        for (Method m : ms) {
            System.out.println(m.getName());//获取方法名
            Class<?>[] pt = m.getParameterTypes();//获取方法参数类型
            System.out.println(Arrays.toString(pt));
        }
    }

    //5.通过单元测试来测试获取成员变量
    @Test
    public void getFields() {
        //1.获取Class字节码对象
        /** Class<?>中的"?"是泛型约束的通配符,类似于"*" */
        Class<?> clazz = Student.class;

        //2.获取所有的成员变量,公共的!!!
        /**!!!注意目前成员变量的修饰符必须是public才能获取到,采用默认修饰符就反射不到*/
        Field[] fs = clazz.getFields();

        //3.遍历数组,获取每个成员变量的信息
        for (Field f : fs) {
            System.out.println(f.getName());//获取变量名
            System.out.println(f.getType().getName());//获取变量类型
        }
    }

    //6.通过单元测试来测试反射创建对象

    /**
     * 方式一:通过字节码对象直接调用newInstance(),触发无参构造来创建对象
     * 方式二:先获取指定的构造函数,再通过构造函数对象调用newInstance(),触发对应的构造函数来创建对象
     */
    @Test
    public void getObject() throws Exception {
        //1.获取Class字节码对象
        Class<?> clazz = Student.class;

        //2.创建对象
        Object obj = clazz.newInstance();//触发无参构造
        System.out.println(obj);//Student [name=null,age=0]

        //3.可以指定去调用哪个构造方法,注意根据参数来指定,而且传入的是参数的字节码对象
        Constructor<?> c = clazz.getConstructor(String.class, int.class);

        //4.触发指定的构造方法
        Object obj2 = c.newInstance("海绵宝宝", 3);
        System.out.println(obj2);//Student [name=海绵宝宝,age=3]

        //5.查看对象具体的属性值,或者调用方法,需要把Object强转成指定的子类类型
        /**为什么要把Object强转成子类类型?因为想要使用子类的特有功能,父类无法使用子类的特有功能
         * obj是Object类型,Object中没有Student的属性与功能
         * 这个操作叫做向下转型--想使用子类特有功能时需要做此操作
         * */
        Student s = (Student) obj2;
        System.out.println(s.name);
        System.out.println(s.age);
        s.eat(666);
    }


}




