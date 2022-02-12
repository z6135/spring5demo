package com.spring.demo01;

/**
 * @ProjectName: Spring5study
 * @Package: com.spring.demo01
 * @ClassName: Client
 * @Author: 张晟睿
 * @Date: 2022/2/12 14:24
 * @Version: 1.0
 */
//客户类，一般客户都会去找代理购买商品！
public class Client {
    public static void main(String[] args) {
        //客户买商品
        Merchant merchant = new Merchant();
        //商家找代理中介
        Proxy proxy = new Proxy(merchant);

        //客户直接找中介代理
        proxy.shop();
    }
}
