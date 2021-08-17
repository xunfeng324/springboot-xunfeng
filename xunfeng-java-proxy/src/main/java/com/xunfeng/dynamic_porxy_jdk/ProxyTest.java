package com.xunfeng.dynamic_porxy_jdk;

public class ProxyTest {
    public static void main(String[] args) {
        // JDK 动态代理调用
        Animal_porxy animal_porxy = new Animal_porxy();
//        Animal dogProxy = (Animal) animal_porxy.getInstance(new Animal_cat());
        Animal dogProxy = (Animal) animal_porxy.getInstance(new Animal_dog());
        dogProxy.eat();
    }

}
