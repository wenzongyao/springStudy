package com.springstudy.demo.module.login.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.springstudy.demo.module.login.entity.UserEntity;

public interface UserService extends IService<UserEntity> {
    UserEntity findByAccount(String account);
}
