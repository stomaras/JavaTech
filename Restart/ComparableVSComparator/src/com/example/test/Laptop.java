package com.example.test;

// Every class need to have a Comparable interface if you want to sort them
public class Laptop implements Comparable<Laptop>{

    private String brand;
    private int ram;
    private int price;

    public Laptop(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }

    // To call compareTo method you need one object
    // First object which call this method and second object which we pass
    // In my case i want to sort Laptops based on the Ram, the last laptop
    // will have the highest RAM
    @Override
    public int compareTo(Laptop lap2) {
        // this > lap2 = +
        // this < lap2 = -
        // this == lap2 = 0
        if (this.getRam() > lap2.getRam()) {
            return 1;
        } else if (this.getRam() < lap2.getRam()){
            return -1;
        } else {
            return 0;
        }
    }

}
