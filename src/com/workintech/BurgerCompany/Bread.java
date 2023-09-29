package com.workintech.BurgerCompany;

public enum Bread {
    WRAP ("Wrap"),
    SANDWICH ("Sandwich"),
    DOUBLESANDWICH ("Double Sandwich");

    private String name;

    Bread(String name){
       this.name = name;
    }

    public String getName() {
        return name;
    }
}
