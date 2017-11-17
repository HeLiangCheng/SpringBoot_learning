package com.springboot.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Liang on 2017/11/16.

 （1）新建maven java project；
 （2）在pom.xml加入相应依赖；
 （3）新建一个表单页面（这里使用thymleaf）;
 （4）编写controller;
 （5）测试；
 （6）对上传的文件做一些限制；
 （7）多文件上传实现

 */
@Controller
@RequestMapping("/file")
public class FileUploadController {

    @RequestMapping("/index")
    public String file(){
        return "/fileupload/fileupload";
    }

    @RequestMapping(value="/upload",method = RequestMethod.POST)
    public String fileupload(@RequestParam("file")MultipartFile file, ModelMap modelMap){
        System.out.println("----------开始上传-----------");
        if(!file.isEmpty()){
            /* 这段代码执行完毕之后，图片上传到了工程的跟路径；
            * 这里只是简单一个例子,请自行参考，融入到实际中可能需要大家自己做一些思考，比如：
            * 1、文件路径；
            * 2、文件名；
            * 3、文件格式;
            * 4、文件大小的限制;
            */
            BufferedOutputStream out =null;
            try {
                out = new BufferedOutputStream(new FileOutputStream("E:\\SpringBoot\\"+new File(file.getOriginalFilename())));
                out.write(file.getBytes());
            }catch (Exception ex){
                modelMap.addAttribute("msg","上传失败，保存异常");
                System.out.println(ex.getMessage());
            }finally {
                if (out != null) {
                    try {
                        out.flush();
                        out.close();
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
            modelMap.addAttribute("msg","上传成功");
            System.out.println("文件上传成功");
        }else{
            modelMap.addAttribute("msg","上传失败，文件为空");
            System.out.println("文件为空");
        }

        return "/fileupload/fileupload";
    }

}
