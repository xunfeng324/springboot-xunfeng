package com.xunfeng.test;

import com.xunfeng.entity.Person;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class RefletionTest2 {

    /*本类用于测试暴力反射*/
    /*单元测试方法的格式：@Test + public + void + 无参 */
    /*1.单元测试1：暴力反射获取和设置私有属性*/
    @Test
    public void getFields() throws Exception {
        //1.获取Class字节码对象
        Class<?> clazz = Person.class;
        //2.获取私有属性
        Field field = clazz.getDeclaredField("name");
        //3.根据获取到的属性对象获取属性的类型
        System.out.println(field.getType().getName());//java.lang.String
        System.out.println(field.getType());//class java.lang.String
        //4.设置属性的值
        //4.1 没有对象就通过反射的方式创建对象
        Object obj = clazz.newInstance();
        //4.2暴力反射！！！需要设置私有可见
        field.setAccessible(true);
        //4.3通过字段对象来给刚刚创建的对象obj设置name属性值为“派大星”
        //set(m,n)-- m:要给哪个对象设置属性值，n:是要设置的属性的具体值
        field.set(obj, "派大星");
        //4.4通过字段对象获取刚刚给obj对象设置的私有属性的值
        System.out.println(field.get(obj));
    }

    /*2.单元测试2：暴力反射获取和设置私有方法*/
    @Test
    public void getFunction() throws Exception {
        //1.获取Class字节码对象
        Class<?> clazz = Person.class;
        //2.通过暴力反射获取私有方法
        /*getDeclaredMethod(m,x,y,z...)
         * m:要获取的方法名
         * x,y,z...可变参数，是这个方法的参数类型，但注意要加“.class”
         * */
        Method method = clazz.getDeclaredMethod("save", int.class, String.class);
        //3.1没有对象就通过反射的方式创建对象
        Object obj = clazz.newInstance();
        //3.2 想要执行私有方法，也需要先设置私有可见
        method.setAccessible(true);
        /*invoke(o,x,y,z...),表示通过反射技术执行方法
         * o :要执行的是哪个对象的方法
         * x,y,z...:执行这个方法【method对象代表的之前获取到的save()】时需要传入的参数
         * */
        //3.3 通过反射技术invoke()，执行目标对象obj的目标方法method【save()】
        //save()被调用时传入的参数是100,"海绵宝宝"
        method.invoke(obj, 100, "海绵宝宝");
    }
}

