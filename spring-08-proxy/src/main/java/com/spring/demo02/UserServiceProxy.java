package com.spring.demo02;

/**
 * @ProjectName: Spring5study
 * @Package: com.spring.demo02
 * @ClassName: UserServiceProxy
 * @Author: 张晟睿
 * @Date: 2022/2/12 14:43
 * @Version: 1.0
 */
public class UserServiceProxy implements UserService{
    private UserServiceImpl userService;
    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }
    public void add() {
        log("add");
        userService.add();
    }
    public void delete() {
        log("delete");
        userService.delete();
    }
    public void update() {
        log("update");
        userService.update();
    }
    public void query() {
        log("query");
        userService.query();
    }
    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}