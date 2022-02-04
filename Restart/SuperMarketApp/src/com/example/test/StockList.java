package com.example.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {

    private Map<String, StockItem> marketList;

    public StockList() {
        this.marketList = new LinkedHashMap<>();
    }

    public int addStock(StockItem item){
        if (item != null) {
            StockItem inStock = marketList.getOrDefault(item.getName(), item);
            if (inStock != item) {
                item.adjustStock(inStock.getQuantityInStock());
            }
            marketList.put(item.getName(), item);
            return item.getQuantityInStock();
        }
        return -1;
    }

    public int sellStock(String itemName, int quantity) {
        StockItem item = marketList.get(itemName);
        if (item != null){
            item.adjustStock(-quantity);
            return item.getQuantityInStock();
        }
        return -1;
    }

    public StockItem get(String key) {
        return marketList.get(key);
    }

    public Map<String, StockItem> Items(){
        return Collections.unmodifiableMap(marketList);
    }

    public Map<String, Double> priceList() {
        Map<String, Double> prices = new LinkedHashMap<>();
        for (Map.Entry<String, StockItem> item : marketList.entrySet()){
            prices.put(item.getKey(), item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
    }

    @Override
    public String toString() {
        String s = "SuperMarket List: \n\n";
        double totalWealth = 0.0;
        for (Map.Entry<String, StockItem> item : marketList.entrySet()){
            StockItem itemm = item.getValue();
            double itemValue = itemm.getQuantityInStock() * itemm.getPrice();
            totalWealth += itemValue;
            s = s + itemm.getName() + " with price: "
                    + itemm.getPrice() + "$" + " and quantity: "
                    + itemm.getQuantityInStock() + ", value of item: "
                    + String.format("%.2f",itemValue) + "$" + "\n";
        }
        System.out.println("\n\n");
        s = s + "With total wealth of SuperMarket : " + totalWealth + "$";
        return s;
    }
}
