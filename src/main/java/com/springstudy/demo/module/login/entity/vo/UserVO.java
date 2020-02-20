package com.springstudy.demo.module.login.entity.vo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
public class UserVO {
    private String account;
    private Integer age;
    private Integer sex;
}
