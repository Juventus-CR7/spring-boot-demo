package com.lys;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class TestController {
    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("now",new Date().toString());
        return "index";
    }
}
