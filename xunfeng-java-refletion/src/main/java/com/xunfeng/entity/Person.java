package com.xunfeng.entity;

/**
 * 本类用来测试暴力反射
 */
public class Person {
    //1.提供私有属性
    private String name;
    private int age;

    //2.提供私有方法
    private void save(int m, String n) {
        System.out.println("save().." + m + n);
    }

    private void update() {
        System.out.println("update()..");
    }
}
