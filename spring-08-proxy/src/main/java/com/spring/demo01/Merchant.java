package com.spring.demo01;

/**
 * @ProjectName: Spring5study
 * @Package: com.spring.demo01
 * @ClassName: Merchant
 * @Author: 张晟睿
 * @Date: 2022/2/12 14:20
 * @Version: 1.0
 */
//商户 真实角色
public class Merchant implements ISubject{
    @Override
    public void shop() {
        System.out.println("商户将商品发出代理！！！");
    }
}
