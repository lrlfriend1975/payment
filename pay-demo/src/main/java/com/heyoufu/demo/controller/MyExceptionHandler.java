package com.heyoufu.demo.controller;

import com.heyoufu.pay.common.api.CommonResult;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * xzm 2020-5-18
 * 全局异常处理
 */
@RestControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(Exception.class)
    public CommonResult error(Exception e) {
        e.printStackTrace();
        return CommonResult.failed(e.getMessage());
    }

//    @ExceptionHandler(AccessDeniedException.class)
//    public CommonResult accessDeniedException(Exception e) {
//        return CommonResult.failed("权限不足");
//    }


}
