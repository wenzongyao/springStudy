package com.springstudy.demo.module.login.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class UserEntity {
    private String account;
    private String password;
}
