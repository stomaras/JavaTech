package com.example.test;

public class HealthyBurger extends Hamburger{

    private String meat;
    private double price;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat, "healthy", price);
        this.meat = meat;
        this.price = price;
    }

    @Override
    public String getMeat() {
        return meat;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getAddition1Name() {
        return addition1Name;
    }

    @Override
    public double getAddition1Price() {
        return addition1Price;
    }

    @Override
    public String getAddition2Name() {
        return addition2Name;
    }

    @Override
    public double getAddition2Price() {
        return addition2Price;
    }

    public String getHealthyExtra1Name() {
        return healthyExtra1Name;
    }

    public double getHealthyExtra1Price() {
        return healthyExtra1Price;
    }

    public String getHealthyExtra2Name() {
        return healthyExtra2Name;
    }

    public double getHealthyExtra2Price() {
        return healthyExtra2Price;
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
        this.healthyExtra1Price = healthyExtra1Price;
        this.healthyExtra1Name = healthyExtra1Name;
        System.out.println("Added: " + healthyExtra1Name + " with price: " + healthyExtra1Price + " to healthy burger");
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price){
        this.healthyExtra2Price = healthyExtra2Price;
        this.healthyExtra2Name = healthyExtra2Name;
        System.out.println("Added: " + healthyExtra2Name + " with price: " + healthyExtra2Price + " to healthy burger");
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        this.addition1Price = addition1Price;
        this.addition1Name = addition1Name;
        System.out.println("Add " + addition1Name + " ingredient with price: " + addition1Price + " to healthy burger");

    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        this.addition2Price = addition2Price;
        this.addition2Name = addition2Name;
        System.out.println("Add " + addition2Name + " ingredient with price: " + addition2Price + " to healthy burger");
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = price;
        if (this.addition1Price != 0){
            totalPrice += addition1Price;
        }
        if (this.addition2Price != 0){
            totalPrice += addition2Price;
        }
        if (this.healthyExtra1Price != 0){
            totalPrice += healthyExtra1Price;
        }
        if (this.healthyExtra2Price != 0){
            totalPrice += healthyExtra2Price;
        }
        System.out.println("Total Price of Healthy Burger is : " + totalPrice);
        return totalPrice;
    }

}
