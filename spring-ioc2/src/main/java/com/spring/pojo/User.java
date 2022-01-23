package com.spring.pojo;

/**
 * @ProjectName: Spring5study
 * @Package: com.spring.pojo
 * @ClassName: User
 * @Author: 张晟睿
 * @Date: 2022/1/23 22:00
 * @Version: 1.0
 */
public class User {
    private String name;

    public User() {
        System.out.println("user实体类调用无参构造方法");
    }


    public void setName(String name) {
        this.name = name;
    }


    public void show() {
        System.out.println("name=" + name);
    }
}
