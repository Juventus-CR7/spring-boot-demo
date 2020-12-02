package com.lys.controller;

import com.lys.domain.Food;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Value("${food.rice}")
    private String rice;
    @RequestMapping("/test")
    public Food test(){
        Food food = new Food();
        food.setRice(rice);
        return food;
    }
}
