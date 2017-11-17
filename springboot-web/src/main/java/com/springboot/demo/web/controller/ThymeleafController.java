package com.springboot.demo.web.controller;

import com.springboot.demo.web.model.User;
import com.springboot.demo.web.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Liang on 2017/11/16.
 */
@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/index")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("name", "liangcheng");
        // return模板文件的名称，对应src/main/resources/templates//thymeleaf/index.vm
        return "/thymeleaf/index";
    }

    @RequestMapping("/userlist")
    public String userlist(ModelMap map) {
        List<User> userList=userService.findUserList();
        map.addAttribute("userList", userList);
        return "/thymeleaf/userList";
    }

}
