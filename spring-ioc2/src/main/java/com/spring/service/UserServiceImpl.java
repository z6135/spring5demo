package com.spring.service;

import com.spring.dao.UserDao;

/**
 * @ProjectName: Spring5study
 * @Package: com.spring.service
 * @ClassName: UserServiceImpl
 * @Author: 张晟睿
 * @Date: 2022/1/20 17:08
 * @Version: 1.0
 */
public class UserServiceImpl implements UserService{
    //我们发现这里的对象没有进行实例化创建
    private UserDao userDao;
    //利用set来实现
    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getuser() {
        userDao.getuser();
    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "userDao=" + userDao +
                '}';
    }
}
