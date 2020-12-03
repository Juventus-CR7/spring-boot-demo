package com.lys.controller;

import com.lys.config.FoodConfig;
import com.lys.domain.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private FoodConfig foodConfig;

    @RequestMapping("/test")
    public Food test(){
        Food food = new Food();
        food.setRice(foodConfig.getRice());
        food.setDishes(foodConfig.getDishes());
        return food;
    }
}
