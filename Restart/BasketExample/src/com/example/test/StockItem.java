package com.example.test;

import java.util.Objects;

public class StockItem implements Comparable<StockItem> {

    private final String name;
    private double price;
    private int quantityInStock;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityInStock = 0;
    }

    public StockItem(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
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

    public void setPrice(double price) {
        if (price > 0.0) {
            this.price = price;
        }
    }

    public void adjustStock(int quantity) {
        int newQuantity = this.quantityInStock + quantity;
        if (newQuantity > 0) {
            this.quantityInStock = newQuantity;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o ) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        StockItem stockItem = (StockItem) o;
        return this.name.equals(stockItem.getName());
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 51;
    }

    @Override
    public int compareTo(StockItem o) {
        if (this == o) {
            return 0;
        }

        if (o == null || getClass() != o.getClass()){
            return 0;
        }

        StockItem stockItem = (StockItem) o;
        String stockItemName = stockItem.getName();
        if (stockItemName.compareTo(this.name) == 0){
            return 0;
        } else if (stockItemName.compareTo(this.name) > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return " name: " + name + ", price: " + price + ", quantity: " + quantityInStock;
    }
}
