package com.example.test;

public class HealthyBurger extends Hamburger {

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

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, "Brown rye roll", price);
        this.meat = meat;
        this.price = price;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getMeat() {
        return super.getMeat();
    }

    @Override
    public String getBreadRollType() {
        return super.getBreadRollType();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        super.addHamburgerAddition1(addition1Name, addition1Price);
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        super.addHamburgerAddition2(addition2Name, addition2Price);
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        super.addHamburgerAddition3(addition3Name, addition3Price);
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        super.addHamburgerAddition4(addition4Name, addition4Price);
    }

    @Override
    public double itemizehamburger() {
        double finalPrice = super.itemizehamburger();
        System.out.println("Healthy Burger on a Brown Roll Type with " + meat + ", price is " + price);
        if (healthyExtra1Name != null){
            finalPrice += healthyExtra1Price;
            System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
        }
        if (healthyExtra2Name != null) {
            finalPrice += healthyExtra2Price;
            System.out.println("Added " + healthyExtra2Name + " for an extra " + healthyExtra2Price);
        }
        return finalPrice;
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price) {
        price += healthyExtra1Price;
        System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price) {
        price += healthyExtra2Price;
        System.out.println("Added " + healthyExtra2Name + " for an extra " + healthyExtra2Price);
    }
}
