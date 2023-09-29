package com.workintech.BurgerCompany;

public abstract class Hamburger {
    private String name, meat;
    private double price;
    private Bread bread;


    public Hamburger(String name, double price, Bread bread) {
        this.name = name;
        this.price = price;
        this.bread = bread;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public Bread getBread() {
        return bread;
    }

    public abstract void addHamburgerAddition1(String name, double price);

    public abstract void addHamburgerAddition2(String name, double price);

    public abstract void addHamburgerAddition3(String name, double price);

    public abstract void addHamburgerAddition4(String name, double price);

    public abstract double itemizeHamburger();

}
