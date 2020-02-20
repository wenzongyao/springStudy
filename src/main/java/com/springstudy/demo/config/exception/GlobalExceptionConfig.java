package com.springstudy.demo.config.exception;

import com.springstudy.demo.common.Ret;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionConfig {

    @ExceptionHandler(Exception.class)
    public Ret handleException(Exception e) {
        log.error(e.getMessage(), e);
        return Ret.fail("系统错误");
    }

    //todo:加redis,mysql,es,支付等特殊错误

}
