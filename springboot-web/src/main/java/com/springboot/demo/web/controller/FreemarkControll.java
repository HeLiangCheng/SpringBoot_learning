package com.springboot.demo.web.controller;

import com.springboot.demo.web.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

/**
 * Created by Liang on 2017/11/16.
 */
@Controller
public class FreemarkControll {

    @Autowired
    private IUserService userService;

    public String index(ModelMap map) {
        map.addAttribute("name", "liangcheng");
        return "/freemark/index";
    }


}
