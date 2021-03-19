package com.zhoudu.controller;

import com.zhoudu.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WelcomeController {
    @RequestMapping("/wel")
    public String toWelcomePage(Model model){
        Person person=new Person("zhoud","312");
        model.addAttribute("person",person);
        model.addAttribute("msg","yes");
        model.addAttribute("num","2");
        List<Person> list=new ArrayList<>();
        Person p1=new Person("AAA","111");
        Person p2=new Person("BBB","222");
        Person p3=new Person("CCC","333");
        list.add(p1);
        list.add(p2);
        list.add(p3);
        model.addAttribute("list",list);
        return "welcome";
    }
}
