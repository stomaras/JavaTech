package com.example.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StockList {

    private Map<String, StockItem> marketList;

    public StockList() {
        this.marketList = new HashMap<>();
    }

    public int addStockItem(StockItem item){
        if (item != null){
            StockItem inStock = marketList.getOrDefault(item.getName(), null);
            if (inStock != null){
                if(inStock.getPrice() == item.getPrice()) {
                    item.adjustStock(inStock.getQuantityInStock());
                }
            }
            marketList.put(item.getName(), item);
            return item.getQuantityInStock();
        }
        return -1;
    }

    public int reserveStock(String item, int quantity) {
        StockItem inStock = marketList.getOrDefault(item, null);
        if (inStock != null){
            inStock.reservedQuantity(quantity);
            marketList.put(inStock.getName(), inStock);
            return inStock.getReservedQuantity();
        }
        return -1;
    }

    public int unreserveStock(String item, int quantity) {
        StockItem inStock = marketList.getOrDefault(item, null);
        if (inStock != null && (inStock.getReservedQuantity() > 0)) {
            return inStock.unreservedQuantity(quantity);
        }
        return -1;
    }

    public int sellStock(String name, int quantity){
        StockItem item = marketList.getOrDefault(name, null);
        if ((item != null) && (quantity > 0)){
            return item.finalise(quantity);
        }
        return -1;
    }

    public StockItem key(String key){
        return marketList.get(key);
    }

    public Map<String, StockItem> Items(){
        return Collections.unmodifiableMap(marketList);
    }

    @Override
    public String toString() {
        String s = " Market List: \n";
        double totalWealth = 0.0;
        for (Map.Entry<String, StockItem> itemEntry : marketList.entrySet()){
            StockItem item = itemEntry.getValue();
            totalWealth += item.getPrice() * item.availableQuantity();
            s = s + " Item with name: " + item.getName() + " ,with price: " + item.getPrice() + "$";
            s = s + " ,with available quantity in stock: " + item.availableQuantity();
            s = s + " ,with reserved quantity: " + item.getReservedQuantity() + " items." + "\n";
            System.out.println("\n");
        }
        s = s + " Total Wealth: " + totalWealth + "$";
        return s;
    }
}
