package com.spring.dao;

/**
 * @ProjectName: Spring5study
 * @Package: com.spring.dao
 * @ClassName: UserDaoImpl
 * @Author: 张晟睿
 * @Date: 2022/1/20 17:07
 * @Version: 1.0
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void getuser() {
        System.out.println("获取该用户的信息");
    }
}
