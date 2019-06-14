package com.gakee.xin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/visit")
    public String visit(){
        return "springBoot...............";
    }

    @RequestMapping("/quick")
    public String Quick(){
        return "SpringBoot 访问成功了111111";
    }
}
