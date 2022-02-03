package com.example.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Basket {

    private final String name;
    private Map<StockItem, Integer> basketList;

    public Basket(String name) {
        this.name = name;
        this.basketList = new LinkedHashMap<>();
    }

    public String getName() {
        return name;
    }

    public int addToBasket(StockItem item, int quantity){
        if (item != null) {
            int inBasket = basketList.getOrDefault(item, 0);
            basketList.put(item, inBasket + quantity);
            return inBasket;
        }
        return -1;
    }

    public int get(StockItem key) {
        return basketList.get(key);
    }

    public Map<StockItem, Integer> Items(){
        return Collections.unmodifiableMap(basketList);
    }

    @Override
    public String toString() {
        double totalCost = 0.0;
        String s = "Basket List:" + this.name + "\n";
        for (Map.Entry<StockItem, Integer> item : basketList.entrySet()){
            StockItem basketItem = item.getKey();
            int quantity = item.getValue();
            s = s + basketItem.getName() + ", price: "
                    + basketItem.getPrice() + "$" + " with quantity: "
                    + quantity + "\n";
            totalCost += basketItem.getPrice() * quantity;
        }
        System.out.println("\n");
        s = s + "With total cost of " + this.name + " basket : " + totalCost + "$";
        return s;
    }
}
