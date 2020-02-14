package com.springstudy.demo.control.mgr;

import com.alibaba.fastjson.JSON;
import com.springstudy.demo.module.login.entity.UserEntity;
import com.springstudy.demo.module.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/login")
public class LoginControl {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    public String login(String account, String password) {
        UserEntity userEntity = new UserEntity();
        userEntity.setAccount(account);
        userEntity.setPassword(password);
        return JSON.toJSONString(userEntity);
    }

    @RequestMapping(value = "/userInfo")
    public String userInfo(String account) {
        UserEntity user = userService.findByAccount(account);
        return JSON.toJSONString(user);
    }
}
