package com.lys.controller;

import com.lys.config.FoodConfig;
import com.lys.config.VegetablesConfig;
import com.lys.domain.Food;
import com.lys.domain.Vegetables;
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
        food.setSauce(foodConfig.getSauce());
        return food;
    }

    @Autowired
    private VegetablesConfig vegetablesConfig;

    @RequestMapping("/vegetables")
    public Vegetables vegetables(){
        Vegetables vegetables = new Vegetables();
        vegetables.setPotato(vegetablesConfig.getPotato());
        vegetables.setTomato(vegetablesConfig.getTomato());
        return vegetables;
    }
}
