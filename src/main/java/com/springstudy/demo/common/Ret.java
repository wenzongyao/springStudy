package com.springstudy.demo.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.springstudy.demo.enums.FailCode;
import lombok.Getter;

@Getter
public class Ret<T> {

    public static final String FAIL    = "FAIL";
    public static final String SUCCESS = "SUCCESS";

    protected String code;
    protected String msg;
    protected T      data;

    @JSONField(serialize = false)
    protected boolean isFail = false;


    protected Ret(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.isFail = FAIL.equals(code);
    }

    //解析为json字符串
    @Override
    public String toString() {
        return JSON.toJSONString(this, SerializerFeature.PrettyFormat);
    }

    //返回成功数据
    public static <T> Ret<T> success() {
        return new Ret<>(SUCCESS, null, null);
    }

    public static <T> Ret<T> success(T data) {
        return new Ret<>(SUCCESS, null, data);
    }

    //返回失败数据
    public static <T> Ret<T> fail(String msg) {
        return new Ret<>(FAIL, msg, null);
    }

    //返回需要特殊处理的失败数据
    public static <T> Ret<T> fail(FailCode type, T data) {
        return new Ret<>(type.name(), type.msg, data);
    }



}
