package com.spring.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ProjectName: Spring5study
 * @Package: com.spring.demo03
 * @ClassName: ProxyInvocationHandler
 * @Author: 张晟睿
 * @Date: 2022/2/12 15:57
 * @Version: 1.0
 */
public class ProxyInvocationHandler implements InvocationHandler {
    private ISubject iSubject;

    public void setiSubject(ISubject iSubject) {
        this.iSubject = iSubject;
    }

    //生成代理类，重点是第二个参数，获取要代理的抽象角色！之前都是一个角色，现在可以代理一类角色
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                iSubject.getClass().getInterfaces(),this);
    }

    // proxy : 代理类 method : 代理类的调用处理程序的方法对象.
    // 处理代理实例上的方法调用并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //核心：本质利用反射实现！
        Object result = method.invoke(iSubject, args);
        return result;
    }
}