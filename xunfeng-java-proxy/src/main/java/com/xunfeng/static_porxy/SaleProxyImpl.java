package com.xunfeng.static_porxy;

public class SaleProxyImpl implements Sale{

    /**
     * 代理类的实现
     */
    private SaleImpl man;

    //构造函数
    public SaleProxyImpl(SaleImpl man) {
        this.man = man;
    }

    @Override
    public void sale() {
        System.out.println("first：我是代理卖酒的");
        System.out.println("then");
        man.sale();//调用被代理对象的方法
    }
}
