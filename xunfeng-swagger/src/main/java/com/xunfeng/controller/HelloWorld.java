package com.xunfeng.controller;

import com.xunfeng.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Api(tags = "Hello控制类")
public class HelloWorld {
    @Autowired
    private User user;

    @PostMapping(value = "hello")
    @ResponseBody
    @ApiOperation(value = "方法1")
    public User hello() {
        return user;
    }

    @GetMapping(value = "hello2")
    @ResponseBody
    public String hello2() {

       /* user.setUname("huangc");
        user.setAge(18);
        user.setAddr("成都");*/
        return user.toString();
    }

    @GetMapping(value = "index")
    @ResponseBody
    public String index() {
        System.out.println("index::");
        return user.toString();
    }

    @GetMapping(value = "login")
    @ResponseBody
    public String login() {
        System.out.println("login::");
        return "这是后台的登录接口";
    }


}
