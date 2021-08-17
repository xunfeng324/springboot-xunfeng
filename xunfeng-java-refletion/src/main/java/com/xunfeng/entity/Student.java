package com.xunfeng.entity;

/**
 * 本类用于测试反射,先准备的物料类
 */
public class Student {
    //1.定义成员变量
    public String name;
    public int age;

    //2.定义构造方法
    //快捷方式:右键-->Source-->倒数第三个-->OK
    public Student() {
    }//注意要先手动添加无参构造,防止被覆盖

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    //3.定义成员方法
    public void eat(int n) {
        System.out.println("饿了吃点火锅吧" + n);
    }

    //4.提供重写的toString()
    //目的:为了方便查看对象的属性值
    @Override
    public String toString() {
        return "Student [name=" + name + ",age=" + age + "]";
    }
}

