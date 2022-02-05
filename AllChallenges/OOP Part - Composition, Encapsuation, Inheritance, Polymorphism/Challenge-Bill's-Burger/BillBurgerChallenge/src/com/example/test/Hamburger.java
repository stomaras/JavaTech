package com.example.test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

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

    public String getAddition1Name() {
        return addition1Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        this.addition1Price = addition1Price;
        this.addition1Name = addition1Name;
        System.out.println("Add " + addition1Name + " ingredient with price: " + addition1Price);

    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        this.addition2Price = addition2Price;
        this.addition2Name = addition2Name;
        System.out.println("Add " + addition2Name + " ingredient with price: " + addition2Price);
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        this.addition3Price = addition3Price;
        this.addition3Name = addition3Name;
        System.out.println("Add " + addition3Name + " ingredient with price: " + addition3Price);
    }

    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        this.addition4Price = addition4Price;
        this.addition4Name = addition4Name;
        System.out.println("Add " + addition4Name + " ingredient with price: " + addition4Price);
    }

    public double itemizeHamburger(){
        double totalPrice = price;
        if (this.addition1Price != 0){
            totalPrice += addition1Price;
        }
        if (this.addition2Price != 0){
            totalPrice += addition2Price;
        }
        if (this.addition3Price != 0){
            totalPrice += addition3Price;
        }
        if (this.addition4Price != 0){
            totalPrice += addition4Price;
        }
        System.out.println("Total Price of Hamburger is : " + totalPrice);
        return totalPrice;
    }




}
