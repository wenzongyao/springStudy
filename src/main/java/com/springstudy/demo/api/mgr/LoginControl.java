package com.springstudy.demo.api.mgr;

import com.alibaba.fastjson.JSON;
import com.springstudy.demo.module.login.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/login")
public class LoginControl {

    @RequestMapping(value = "/login")
    public String login(String account, String password) {
        UserEntity userEntity = new UserEntity();
        userEntity.setAccount(account);
        userEntity.setPassword(password);
        return JSON.toJSONString(userEntity);
    }
}
