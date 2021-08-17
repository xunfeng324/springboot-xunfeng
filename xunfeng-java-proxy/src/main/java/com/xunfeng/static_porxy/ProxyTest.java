package com.xunfeng.static_porxy;

public class ProxyTest {
//    测试

    public static void main(String[] args) {
        SaleImpl man = new SaleImpl();
        SaleProxyImpl proxy = new SaleProxyImpl(man);
        proxy.sale();
    }
}
