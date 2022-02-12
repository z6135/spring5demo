package com.spring.demo03;

/**
 * @ProjectName: Spring5study
 * @Package: com.spring.demo03
 * @ClassName: Merchant
 * @Author: 张晟睿
 * @Date: 2022/2/12 15:54
 * @Version: 1.0
 */
//商户 真实角色
public class Merchant implements ISubject {
    @Override
    public void shop() {
        System.out.println("商户将商品发出代理！！！");
    }
}
