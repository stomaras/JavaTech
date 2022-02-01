package com.example.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StockList {

    private final Map<String, StockItem> stockList;

    public StockList() {
        this.stockList = new HashMap<>();
    }

    public int addStock(StockItem item) {
        if (item != null){
            StockItem inStock = stockList.get(item.getName());
            if (inStock != null){
                item.adjustStock(inStock.getQuantityInStock());
            }
            stockList.put(item.getName(), item);
            return item.getQuantityInStock();
        }
        return 0;
    }

    public int sellStock(String item, int quantity) {
        if (item != null){
            StockItem stockItem = stockList.getOrDefault(item, null);
            if ((stockItem != null) && (quantity > 0) && (stockItem.getQuantityInStock() >= quantity)){
                stockItem.adjustStock(-quantity);
                return quantity;
            }
        }
        return 0;
    }

    public StockItem get(String key){
        return stockList.get(key);
    }

    public Map<String, StockItem> map(){
        return Collections.unmodifiableMap(stockList);
    }

    @Override
    public String toString(){
        String s = "Market List: \n\n";
        double totalWealth = 0.0;
        for (Map.Entry<String, StockItem> entry : stockList.entrySet()){
            String itemName = entry.getKey();
            StockItem item = entry.getValue();
            double productValue = item.getQuantityInStock() * item.getPrice();
            s = s + " added " + item.toString() + "\n";
            s = s + " with total " + itemName + " value " + productValue + "\n\n";
            totalWealth += productValue;
        }
        s = s + "\n Total Wealth of the market : " + totalWealth;
        return s;
    }






}
