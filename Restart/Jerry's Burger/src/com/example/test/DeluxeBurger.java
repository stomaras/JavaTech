package com.example.test;

public class DeluxeBurger extends Hamburger {


    public DeluxeBurger() {
        super("Deluxe", "Bacon & Sausage", "White", 14.53);
        super.addHamburgerAddition1("Chips", 2.17);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public double itemizehamburger() {
        return super.itemizehamburger();
    }
}
