package com.springboot.demo.web.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Liang on 2017/11/16.
 */
@ControllerAdvice
public class GlobalExceptionHandle  {

    @ExceptionHandler(value = Exception.class)
    public  void defaultExceptionHandler(HttpServletRequest request, Exception exception){
        //打印异常信息
        exception.printStackTrace();
        System.out.println("GlobalDefaultExceptionHandler 全局异常信息");
    }

}
