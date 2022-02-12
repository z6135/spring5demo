package com.spring.demo03;

/**
 * @ProjectName: Spring5study
 * @Package: com.spring.demo03
 * @ClassName: Client
 * @Author: 张晟睿
 * @Date: 2022/2/12 16:01
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) throws ClassCastException{
        //真实角色
        Merchant merchant = new Merchant();
        //代理实例的调用处理程序
        ProxyInvocationHandler invocationHandler = new ProxyInvocationHandler();
        //将真实角色放置进去！
        invocationHandler.setiSubject(merchant);
        //动态生成对应的代理类！
        ISubject proxy = (ISubject) invocationHandler.getProxy();
        proxy.shop();
    }
}
