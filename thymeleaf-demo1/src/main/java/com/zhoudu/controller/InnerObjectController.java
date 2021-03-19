package com.zhoudu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class InnerObjectController {
    @GetMapping("/inner")
    public String handler(Model model){
        model.addAttribute("date",new Date());
        return "innerObject";


    }
}
