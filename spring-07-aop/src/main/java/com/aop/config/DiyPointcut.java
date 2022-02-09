package com.aop.config;

/**
 * @ProjectName: Spring5study
 * @Package: com.aop.utils
 * @ClassName: DiyPointcut
 * @Author: 张晟睿
 * @Date: 2022/2/9 21:27
 * @Version: 1.0
 */
public class DiyPointcut {
    public void before(){
        System.out.println("---------方法执行前	");
    }
    public void after(){
        System.out.println("---------方法执行后	");
    }
}
