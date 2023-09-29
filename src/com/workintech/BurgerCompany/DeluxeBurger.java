package com.workintech.BurgerCompany;

public class DeluxeBurger extends Hamburger{
  String cips = "cips";


    public DeluxeBurger(String name, double price, Bread bread) {
        super(name, price, bread);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {

    }

    @Override
    public void addHamburgerAddition2(String name, double price) {

    }

    @Override
    public void addHamburgerAddition3(String name, double price) {

    }

    @Override
    public void addHamburgerAddition4(String name, double price) {

    }

    @Override
    public double itemizeHamburger() {
        return 0;
    }
}
