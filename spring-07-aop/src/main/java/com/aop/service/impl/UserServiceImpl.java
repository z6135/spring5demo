package com.aop.service.impl;

import com.aop.service.UserService;

/**
 * @ProjectName: Spring5study
 * @Package: com.aop.service.impl
 * @ClassName: UserServiceImpl
 * @Author: 张晟睿
 * @Date: 2022/2/9 21:01
 * @Version: 1.0
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("添加用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }

    @Override
    public void update() {
        System.out.println("更新用户");
    }

    @Override
    public void select() {
        System.out.println("查询用户");
    }
}
