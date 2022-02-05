package com.autowired.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * @ProjectName: Spring5study
 * @Package: com.autowired.pojo
 * @ClassName: User
 * @Author: 张晟睿
 * @Date: 2022/2/5 20:34
 * @Version: 1.0
 */
public class User {
    @Resource
    //如果允许对象为null，设置required = false,默认为true
    private Benchi benchi;
    @Resource
    private Baoma baoma;
    private String desc;

    public Benchi getBenchi() {
        return benchi;
    }

    public Baoma getBaoma() {
        return baoma;
    }


    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
