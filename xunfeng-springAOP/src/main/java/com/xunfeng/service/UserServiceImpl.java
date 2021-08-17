package com.xunfeng.service;

import com.xunfeng.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Override
    public User queryUser() {
        User user = new User();
        user.setName("王涵").setAge(20).setSex(1);
        return user;
    }

    @Override
    public User queryUser2() {
        User user = new User();
        user.setName("小涵涵").setAge(21).setSex(2);
        return user;
    }
}
