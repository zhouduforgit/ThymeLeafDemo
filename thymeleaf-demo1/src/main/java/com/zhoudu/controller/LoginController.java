package com.zhoudu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    //跳转登录页面
    @GetMapping("/toLogin")
    public String toLoginPage(){
        return "login";
    }
    //接收到form表单的数据，登录操作重定向欢迎页
    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password){
        System.out.println(username+"---"+password);
        return "redirect:/wel";

    }
}
