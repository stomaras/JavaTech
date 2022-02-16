package com.example.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BasketList {

    private String name;
    private Map<StockItem, Integer> basketList;

    public BasketList(String name) {
        this.name = name;
        this.basketList = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int addToBasket(StockItem item, int quantity) {
        if (item != null && (quantity > 0)){
            int inBasket = basketList.getOrDefault(item, 0);
            int newQuantity = inBasket + quantity;
            basketList.put(item, newQuantity);
            return newQuantity;
        }
        return -1;
    }

    public int removeFromBasket(StockItem item, int quantity) {
        if (item != null && (quantity > 0)) {
            int inBasket = basketList.getOrDefault(item, 0);
            if (inBasket > 0 && (inBasket >= quantity)){
                int newQuantity = inBasket - quantity;
                basketList.put(item, newQuantity);
                return newQuantity;
            }
        }
        return -1;
    }

    // Remove all items from the current basket.
    public void clear(){
        basketList.clear();
    }

    public Integer key(StockItem item) {
        return basketList.get(item);
    }

    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(basketList);
    }

    @Override
    public String toString() {
        System.out.println("\n");
       String s = " Basket : " + name + "\n";
       double totalCost = 0.0;
       int totalBasketItems = 0;
       for (Map.Entry<StockItem, Integer> entry : basketList.entrySet()) {
           StockItem item = entry.getKey();
           int quantity = entry.getValue();
           totalBasketItems += quantity;
           totalCost += quantity * item.getPrice();
           s = s + " Item with name :" + item.getName();
           s = s + " ,with price :" + item.getPrice() + "$";
           s = s + " ,with quantity in basket :" + quantity;
           s = s + "\n";
       }
       s = s + " Total Cost : " + totalCost + "$" + " ,with total items in basket : " + totalBasketItems;
       return s;
    }
}
