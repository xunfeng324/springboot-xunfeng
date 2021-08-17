package com.xunfeng.web;

import com.xunfeng.entity.User;
import com.xunfeng.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/aop")
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;
    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    @ResponseBody
    public User userTest1(){
        return userServiceImpl.queryUser();
    }

    @GetMapping(value ="/getUser2")
    @ResponseBody
    public User userTest2(){
        return userServiceImpl.queryUser2();
    }

}
