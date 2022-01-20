package com.spring.pojo;

/**
 * @ProjectName: Spring5study
 * @Package: com.spring.pojo
 * @ClassName: Hello
 * @Author: 张晟睿
 * @Date: 2022/1/20 17:52
 * @Version: 1.0
 */
public class Hello {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("Hello,"+ name );
    }
}

