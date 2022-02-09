package com.example.test;

public class StockItem implements Comparable<StockItem>{

    private final String name;
    private double price;
    private int quantityInStock;
    private int reserved = 0;

    public StockItem(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityInStock = 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int availableStock() {
        return quantityInStock - reserved;
    }

    public void setPrice(double price) {
        if (price > 0.0){
            this.price = price;
        }
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public int adjustStock(int quantity){
        int newQuantity = this.quantityInStock + quantity;
        if (newQuantity > 0){
            this.quantityInStock = newQuantity;
        }
        return this.quantityInStock;
    }

    public int reserveStock(int quantity){
        if (availableStock() >= quantity){
            reserved += quantity;
            return quantity;
        }
        return -1;
    }

    public int unreserveStock(int quantity){
        if (quantity <= reserved){
            reserved -= quantity;
            return quantity;
        }
        return -1;
    }

    public int finalise(int quantity){
        if ((quantity <= availableStock()) && (quantity <= reserved)){
            quantityInStock -= quantity;
            reserved -= quantity;
            return quantity;
        }
        return -1;
    }

    @Override
    public int compareTo(StockItem o) {
        return o.getName().compareTo(this.getName());
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
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 50;
    }

    @Override
    public String toString() {
        return name + ", price=" + price + ", quantityInStock=" + quantityInStock + "reserved" + reserved + "\n";
    }
}
