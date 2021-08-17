package com.xunfeng.dynamic_porxy_cglib;

public class ProxyTest {
    public static void main(String[] args) {
        // cglib 动态代理调用
        PandaCglibProxy proxy = new PandaCglibProxy();
        Panda panda = (Panda)proxy.getInstance(new Panda());
        panda.eat();
    }

}
