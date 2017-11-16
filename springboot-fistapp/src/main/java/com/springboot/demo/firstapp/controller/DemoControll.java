package com.springboot.demo.firstapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Liang on 2017/11/15.
 */
@RestController
public class DemoControll {

    @RequestMapping("/hello")
    public String hello(){
        return "Spring Boot";
    }

    @RequestMapping("/exception")
    public  String exception(){
        Integer num=100/0;
        return num.toString();
    }
}
