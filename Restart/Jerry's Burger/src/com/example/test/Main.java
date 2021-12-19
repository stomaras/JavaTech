package com.example.test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger hamburger = new Hamburger("Basic","Sausage","White",3.56);
        System.out.println(
                hamburger.getName() + " hamburger on a "
                        + hamburger.getBreadRollType() + " with "
                        + hamburger.getMeat() + ", price is "
                        + hamburger.getPrice());
        hamburger.addHamburgerAddition1("tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total burger price is " + hamburger.itemizehamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.67);
        System.out.println(
                healthyBurger.getName() + " burger on a "
                + healthyBurger.getBreadRollType() + " with "
                + healthyBurger.getMeat() + ", price is "
                + healthyBurger.getPrice()
        );
        healthyBurger.addHealthyAddition1("Eggs", 5.41);
        healthyBurger.addHealthyAddition2("Lentils",3.42);
        healthyBurger.itemizehamburger();

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition1("egg",3);
        db.itemizehamburger();


    }
}
