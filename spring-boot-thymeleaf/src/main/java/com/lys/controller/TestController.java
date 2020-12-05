package com.lys.controller;

import com.lys.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/test")
    public String test(Model model){
//        model.addAttribute("text","test");

        Person person = new Person();
        person.setName("刘易燊");
        person.setSex("男");
        model.addAttribute("person",person);

        return "index";
    }

}
