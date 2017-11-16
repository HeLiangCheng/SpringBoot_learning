package com.springboot.demo.firstapp.controller;

import com.springboot.demo.firstapp.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * Created by Liang on 2017/11/15.
 */
@RestController
public class UserController {

    @RequestMapping("/getUser")
    public User getUser(){
        User  user =new User();
        user.setId(new Random().nextInt());
        user.setName("test34");
        user.setGander("男");
        user.setAddress("四川绵阳hh");
        user.setIdcard("581954545");
        System.out.println("调试热部署，演示！");
        return  user;
    }

}
