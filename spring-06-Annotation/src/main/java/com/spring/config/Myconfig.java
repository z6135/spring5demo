package com.spring.config;

import com.spring.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ProjectName: Spring5study
 * @Package: com.spring.config
 * @ClassName: Myconfig
 * @Author: 张晟睿
 * @Date: 2022/2/7 13:05
 * @Version: 1.0
 */
@Configuration //代表这是一个配置类
@Import(Myconfig2.class) //导入合并其他配置类，类似于配置文件中的 inculde 标签
public class Myconfig {
    @Bean
    //通过方法注册一个bean，这里的返回值就Bean的类型，方法名就是bean的id！
    public Person person(){
        return new Person();
    }
}
