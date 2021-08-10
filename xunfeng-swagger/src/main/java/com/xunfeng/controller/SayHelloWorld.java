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
@Api(tags = "SayHello控制类")
public class SayHelloWorld {
    @Autowired
    private User user;

    @PostMapping(value = "sayHello1")
    @ResponseBody
    @ApiOperation(value = "方法2")
    public User hello() {
        return user;
    }

    @GetMapping(value = "sayHello2")
    @ResponseBody
    public String sayHello1() {

       /* user.setUname("huangc");
        user.setAge(18);
        user.setAddr("成都");*/
        return user.toString();
    }


}
