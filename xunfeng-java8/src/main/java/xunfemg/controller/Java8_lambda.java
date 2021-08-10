package xunfemg.controller;
import xunfemg.initerfaces.*;


public class Java8_lambda {

    public static void main(String[] args) {
        /*
         *  Java 8 (又称为 jdk 1.8) 是 Java 语言开发的一个主要版本。
         *  Oracle 公司于 2014 年 3 月 18 日发布 Java 8 ，
         * 它支持函数式编程，新的 JavaScript 引擎，新的日期 API，新的Stream API 等。
         *
         * Lambda 表达式 − Lambda 允许把函数作为一个方法的参数（函数作为参数传递到方法中）。
         * 方法引用 − 方法引用提供了非常有用的语法，可以直接引用已有Java类或对象（实例）的方法或构造器。与lambda联合使用，方法引用可以使语言的构造更紧凑简洁，减少冗余代码。
         * 默认方法 − 默认方法就是一个在接口里面有了一个实现的方法。
         * 新工具 − 新的编译工具，如：Nashorn引擎 jjs、 类依赖分析器jdeps。
         * Stream API −新添加的Stream API（java.util.stream） 把真正的函数式编程风格引入到Java中。
         * Date Time API − 加强对日期与时间的处理。
         * Optional 类 − Optional 类已经成为 Java 8 类库的一部分，用来解决空指针异常。
         * Nashorn, JavaScript 引擎 − Java 8提供了一个新的Nashorn javascript引擎，它允许我们在JVM上运行特定的javascript应用。
         */
        //Java Lambda 表达式
        lambda();

    }
    private static  void lambda() {
        /*Java Lambda 表达式
         *Lambda 表达式，也可称为闭包，它是推动 Java 8 发布的最重要新特性。
         * Lambda 允许把函数作为一个方法的参数（函数作为参数传递进方法中）。
         * 使用 Lambda 表达式可以使代码变的更加简洁紧凑。
         * */
        // 不用括号
        TestLambda1 testLambda1 = () ->
                System.out.println("Hello1");

        // 用括号
        TestLambda1 testLambda11 = () ->
                System.out.println("Hello2");

        testLambda1.test1();
        testLambda11.test1();

        TestLambda2 testLambda2 = (a)->{
            System.out.println("带参数的值为："+a);
        };
        testLambda2.test2(5);
        TestLambda3 testLambda3 = (a,b)->{
            System.out.println("带参数a,b的和为："+(a+b));
        };
        testLambda3.test3(5,6);

        TestLambda4 testLambda4 = (a,b)->{
            System.out.println(a+b);
        };
        testLambda4.test4("传递的参数为：",5);

    }


}
