package com.lys.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("food")
public class FoodConfig {
    private String rice;
    private String dishes;

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }

    public String getDishes() {
        return dishes;
    }

    public void setDishes(String dishes) {
        this.dishes = dishes;
    }
}
