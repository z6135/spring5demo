package com.spring.demo01;

/**
 * @ProjectName: Spring5study
 * @Package: com.spring.demo01
 * @ClassName: Proxy
 * @Author: 张晟睿
 * @Date: 2022/2/12 14:21
 * @Version: 1.0
 */
//淘宝代理  代理角色
public class Proxy implements ISubject{
    private Merchant merchant;

    public Proxy(Merchant merchant) {
        this.merchant = merchant;
    }

    //代理后的商品
    @Override
    public void shop() {
        merchant.shop();
        buy();
        Insurance_service();
    }

    //客户购买商品
    public void buy(){
        System.out.println("用户购买商品");
    }

    //中介商赚差价
    public void Insurance_service(){
        System.out.println("代理给商品添加保险等其他服务");
    }
}
