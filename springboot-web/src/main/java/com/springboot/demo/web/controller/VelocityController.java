package com.springboot.demo.web.controller;

import com.springboot.demo.web.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Liang on 2017/11/16.

 springboot1.5和以上版本 已经完全抛弃了velocity视图模板，如果要使用velocity视图这需要如下配置
 1、引入jar 带版本号的

 2、使用xml文件 自定义 velocity解析器

 3、将xml 引入到项目中

 */
@Controller
@RequestMapping("/velocity")
public class VelocityController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/hello")
    public String index(ModelMap map) {
        System.out.println("VelocityController");
        map.addAttribute("name", "liangcheng");
        return "velocity/index";
    }

}
