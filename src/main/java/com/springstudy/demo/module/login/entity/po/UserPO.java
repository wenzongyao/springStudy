package com.springstudy.demo.module.login.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class UserPO {
    private String account;
    private String password;
    private Integer age;
    private Integer sex;
}
