package com.aop.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @ProjectName: Spring5study
 * @Package: com.aop.log
 * @ClassName: AfterLog
 * @Author: 张晟睿
 * @Date: 2022/2/9 21:04
 * @Version: 1.0
 */
public class AfterLog implements MethodBeforeAdvice {

    //method : 要执行的目标对象的方法
    //objects : 被调用的方法的参数
    //Object : 目标对象
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println( o.getClass().getName() + "的" + method.getName()
                + "方法被执行了");

    }
}
