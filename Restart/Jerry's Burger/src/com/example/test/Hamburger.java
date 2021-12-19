package com.example.test;

public class Hamburger {

    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public double getPrice() {
        return price;
    }

    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        price += addition1Price;
        System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        price += addition2Price;
        System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        price += addition3Price;
        System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
    }

    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        price += addition4Price;
        System.out.println("Added " + addition4Name + " for an extra " + addition4Price);
    }

    public double itemizehamburger(){
        double totalPrice = price;

        if (addition1Name != null){
            totalPrice += addition1Price;
        }
        if (addition2Name != null){
            totalPrice += addition2Price;
        }
        if (addition3Name != null){
            totalPrice += addition3Price;
        }
        if (addition4Name != null){
            totalPrice += addition4Price;
        }
        return totalPrice;
    }


}
