package com.xunfeng.static_porxy;

public class SaleImpl implements Sale {

    /**
     * 接口实现
     * 目标对象
     * 被代理对象
     */
    @Override
    public void sale() {
        System.out.println("我是真正卖酒的");
    }
}
