package com.lys.controller;

import com.lys.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService service;

    @GetMapping
    public String selectList(Model model){
        model.addAttribute("personList",service.selectList());
        return "index";
    }
}
