package com.springstudy.demo.enums;

//需要前端处理的枚举
public enum FailCode {
    Fail_000001("Token失效"),
    Fail_000002("其它地方登陆"),
    ;

    public final String msg;

    FailCode(String msg) {
        this.msg = msg;
    }
}