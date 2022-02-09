package com.aop.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @ProjectName: Spring5study
 * @Package: com.aop.config
 * @ClassName: AnnotationPointcut
 * @Author: 张晟睿
 * @Date: 2022/2/9 21:33
 * @Version: 1.0
 */
@Aspect
public class AnnotationPointcut {
    @Before("execution(* com.aop.service.impl.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("---------方法执行前	");
    }

    @After("execution(* com.aop.service.impl.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("---------方法执行后	");
    }

    @Around("execution(* com.aop.service.impl.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        System.out.println("签名:"+jp.getSignature());
        //执行目标方法proceed
        Object proceed = jp.proceed();
        System.out.println("环绕后");
        System.out.println(proceed);
    }

}
