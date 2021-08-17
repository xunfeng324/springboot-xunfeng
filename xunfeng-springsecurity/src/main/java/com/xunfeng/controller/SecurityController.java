package com.xunfeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {
    @RequestMapping(value = "/hello")
    public String hello(){
        System.out.println("hello");
        return "Index";
    }
}


