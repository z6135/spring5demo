package com.spring.demo02;

/**
 * @ProjectName: Spring5study
 * @Package: com.spring.demo02
 * @ClassName: UserServiceImpl
 * @Author: 张晟睿
 * @Date: 2022/2/12 14:42
 * @Version: 1.0
 */
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("增加了一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void update() {
        System.out.println("更新了一个用户");
    }

    @Override
    public void query() {
        System.out.println("查询了一个用户");
    }
}
