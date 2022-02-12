package com.spring.demo04;

import com.spring.demo02.UserService;
import com.spring.demo02.UserServiceImpl;

/**
 * @ProjectName: Spring5study
 * @Package: com.spring.demo04
 * @ClassName: Test
 * @Author: 张晟睿
 * @Date: 2022/2/12 16:25
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //真实对象
        UserServiceImpl userService = new UserServiceImpl();
        //代理对象的调用处理程序
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //设置要代理的对象
        pih.setTarget(userService);
        //动态生成代理类！
        UserService proxy = (UserService)pih.getProxy();
        proxy.delete();
    }
}
