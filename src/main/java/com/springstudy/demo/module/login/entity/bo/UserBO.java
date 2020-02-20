package com.springstudy.demo.module.login.entity.bo;

import lombok.Data;

@Data
public class UserBO {
    private String account;
    private String password;
    private Integer age;
    private Integer sex;
}
