package com.aop.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @ProjectName: Spring5study
 * @Package: com.aop.log
 * @ClassName: BeforeLog
 * @Author: 张晟睿
 * @Date: 2022/2/9 21:04
 * @Version: 1.0
 */
public class BeforeLog implements AfterReturningAdvice {

    //returnValue 返回值
    //method被调用的方法
    //args 被调用的方法的对象的参数
    //target 被调用的目标对象
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了" + target.getClass().getName()
                +"的"+method.getName()+"方法,"
                +"返回值："+returnValue);
    }

}
