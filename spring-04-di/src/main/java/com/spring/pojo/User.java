package com.spring.pojo;

/**
 * @ProjectName: Spring5study
 * @Package: com.spring.pojo
 * @ClassName: User
 * @Author: 张晟睿
 * @Date: 2022/2/2 14:04
 * @Version: 1.0
 */
public class User {
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
