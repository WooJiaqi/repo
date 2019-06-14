package com.gakee.xin.spring_demo1;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix = "person")
public class QuickController {

    private String name;
    private Integer age;

    @RequestMapping("/test")
    public String visit(){
        return "spring boot 访问了.";
    }

    @RequestMapping("/test1")
    public String visit1(){
        return "波斯猫来了";
    }

    // 通过@ConfigurationProperties(prefix = "person")
    // 获取配置文件中的属性值
    // 通过setter方法注入
    // 如果注释掉将返回springboot 访问成功! name=null,age=null
    @RequestMapping("/test2")
    public String setPropertiseValue(){
        return "springboot 访问成功! name="+name+",age="+age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
