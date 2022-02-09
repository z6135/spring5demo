package com.spring.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: Spring5study
 * @Package: com.spring.pojo
 * @ClassName: User
 * @Author: 张晟睿
 * @Date: 2022/2/7 11:53
 * @Version: 1.0
 */
@Component("user")
// 相当于配置文件中 <bean id="user" class="当前注解的类"/>
@Scope("prototype")
public class User {
    //@Value("厂长")
    // 相当于配置文件中 <property name="name" value="厂长"/>
    public String name;

    @Value("厂长")
    public void setName(String name) {
        this.name = name;
    }
}
