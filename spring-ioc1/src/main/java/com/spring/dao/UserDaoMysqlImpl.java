package com.spring.dao;

/**
 * @ProjectName: Spring5study
 * @Package: com.spring.dao
 * @ClassName: UserDaoMysqlImpl
 * @Author: 张晟睿
 * @Date: 2022/1/20 17:17
 * @Version: 1.0
 */
public class UserDaoMysqlImpl implements UserDao{
    @Override
    public void getuser() {
        System.out.println("获取该用户连接Mysql的信息");
    }
}
