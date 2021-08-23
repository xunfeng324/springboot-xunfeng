package com.xunfeng.web;

import com.xunfeng.exception.BaseBusinessException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping(value = "/getUser")
    public String getUser(String name, Integer age, Integer code) {
        if (code == 404) {
            throw new BaseBusinessException(404, "用户不存在");
        }
        if (code == 409) {
            throw new BaseBusinessException(409, "两次新密码输入不一致");
        }
        return name + ":" + age;
    }
}
