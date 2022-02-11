package com.example.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Basket {

    private final String name;
    private Map<StockItem, Integer> basketList;

    public Basket(String name) {
        this.name = name;
        this.basketList = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int addToBasket(StockItem item, int quantity){
        if (item != null){
            int inBasket = basketList.getOrDefault(item, 0);
            if (quantity > 0 && (item.availableStock() > quantity)){
                int newQuantity = inBasket + quantity;
                basketList.put(item, newQuantity);
                return quantity;
            }
        }
        return -1;
    }

    public Integer getKey(StockItem item) {
        return basketList.get(item);
    }

    public Map<StockItem, Integer> Items(){
        return Collections.unmodifiableMap(basketList);
    }

    @Override
    public String toString() {
        String s = "Basket of : " + this.name + "\n";
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> entry : basketList.entrySet()) {
            StockItem item = entry.getKey();
            int itemQuantity = entry.getValue();
            double itemValue = item.getPrice() * itemQuantity;
            totalCost += itemValue;
            s = s + "product name : " + item.getName() + " and quantity : " + itemQuantity + " with total item cost : " + String.format("%.2f", itemValue) + "$";
            s = s + "\n";
        }
        s = s + "Total cost of basket " + this.name + " : " + totalCost + "$";
        return s;
    }
}
