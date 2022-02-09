package com.spring.pojo;

import org.springframework.stereotype.Component;

/**
 * @ProjectName: Spring5study
 * @Package: com.spring.pojo
 * @ClassName: Person
 * @Author: 张晟睿
 * @Date: 2022/2/7 13:04
 * @Version: 1.0
 */
@Component //将这个类标注为Spring的一个组件，放到容器中！
public class Person {
    public String name = "张三";
}
