package com.lys.bean;

public class Food {
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

    public Food() {
    }

    public Food(String rice, String dishes) {
        this.rice = rice;
        this.dishes = dishes;
    }
}
