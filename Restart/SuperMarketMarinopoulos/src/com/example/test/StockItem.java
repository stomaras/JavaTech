package com.example.test;

import java.util.Objects;

public class StockItem implements Comparable<StockItem>{

    private final String name;
    private double price;
    private int quantityInStock;
    private int reservedQuantity;

    public StockItem(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.reservedQuantity = 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public int getReservedQuantity() {
        return reservedQuantity;
    }

    public void setPrice(double price) {
        if (price > 0.0){
            this.price = price;
        }
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }


    public int availableQuantity() {
        return quantityInStock - reservedQuantity;
    }

    public void adjustStock(int quantity) {
        int newQuantity = this.quantityInStock + quantity;
        if (newQuantity >= 0){
            this.quantityInStock = newQuantity;
        }
    }

    public int reservedQuantity(int quantity){
        if (quantity > 0 && (availableQuantity() >= quantity)){
            this.reservedQuantity += quantity;
            return quantity;
        }
        return -1;
    }

    public int unreservedQuantity(int quantity){
        if (quantity > 0){
            if (reservedQuantity >= quantity){
                reservedQuantity -= quantity;
                return quantity;
            }
        }
        return -1;
    }

    public int finalise(int quantity){
        if (quantity <= reservedQuantity){
            reservedQuantity -= quantity;
            quantityInStock -= quantity;
            return quantity;
        }
        return -1;
    }



    @Override
    public int compareTo(StockItem o) {
        StockItem item = (StockItem) o;
        if (item.getName().equals(this.getName())){
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StockItem item = (StockItem) o;
        if (item.getName().equals(this.getName())){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name) + 57;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", price=" + price + ", quantityInStock=" + quantityInStock + ", reservedQuantity=" + reservedQuantity;
    }
}
