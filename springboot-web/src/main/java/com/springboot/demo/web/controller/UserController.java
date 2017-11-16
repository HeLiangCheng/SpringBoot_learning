package com.springboot.demo.web.controller;

import com.springboot.demo.web.model.User;
import com.springboot.demo.web.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Liang on 2017/11/16.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<User> getUserlist(){
        return userService.findUserList();
    }

    @RequestMapping(value = "/postUser", method = RequestMethod.POST)
    public String postUser(User user){
        userService.addUser(user);
        return "success";
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public  String updateUser(User user){
        userService.updateUser(user);
        return "success";
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return "success";
    }


}
