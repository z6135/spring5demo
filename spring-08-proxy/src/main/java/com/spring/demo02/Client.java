package com.spring.demo02;

/**
 * @ProjectName: Spring5study
 * @Package: com.spring.demo02
 * @ClassName: Client
 * @Author: 张晟睿
 * @Date: 2022/2/12 14:44
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        //真实业务
        UserServiceImpl userService = new UserServiceImpl();
        //代理类
        UserServiceProxy proxy = new UserServiceProxy();
        //使用代理类实现日志功能！
        proxy.setUserService(userService);
        proxy.query();
    }
}