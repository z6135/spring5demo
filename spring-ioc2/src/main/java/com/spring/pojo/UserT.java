package com.spring.pojo;

/**
 * @ProjectName: Spring5study
 * @Package: com.spring.pojo
 * @ClassName: UserT
 * @Author: 张晟睿
 * @Date: 2022/1/23 22:06
 * @Version: 1.0
 */
public class UserT {
    private String name;

    public UserT(String name) { this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name="+ name );
    }

    }
