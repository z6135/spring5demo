package com.spring.dao;

/**
 * @ProjectName: Spring5study
 * @Package: com.spring.dao
 * @ClassName: UserDaoOracleImpl
 * @Author: 张晟睿
 * @Date: 2022/1/20 17:21
 * @Version: 1.0
 */
public class UserDaoOracleImpl implements UserDao{
    @Override
    public void getuser() {
        System.out.println("获取该用户连接Oracle的信息");
    }
}
