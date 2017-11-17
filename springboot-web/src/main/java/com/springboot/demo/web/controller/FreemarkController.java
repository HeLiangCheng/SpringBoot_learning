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
@RequestMapping("/freemark")
public class FreemarkController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("name", "liangcheng");
        return "/freemark/index";
    }

    @RequestMapping("/userList")
    public String getuserList(ModelMap map){
        List<User> userList=userService.findUserList();
        map.addAttribute("userList", userList);
        return "/freemark/userlist";
    }

}
