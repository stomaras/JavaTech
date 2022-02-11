package com.example.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StockList {

    private Map<String, StockItem> marketList;
    private int TotalreservedQuantities;

    public StockList() {
        this.marketList = new HashMap<>();
        this.TotalreservedQuantities = 0;
    }

    public int getTotalreservedQuantities() {
        return TotalreservedQuantities;
    }

    public int addStock(StockItem item) {
        if (item != null){
            StockItem inStock = marketList.getOrDefault(item.getName(), item);
            if (inStock != item){
                item.adjustStock(inStock.availableStock());
            }
            marketList.put(item.getName(), item);
            return item.availableStock();
        }
        return -1;
    }

    public int reserveStock(String item, int quantity){
        StockItem item1 = marketList.get(item); // retrieve the stockItem from the marketList
        if (item1 != null){
            if (quantity > 0){
                item1.reserveStock(quantity); // then call the item's reserve stock
                return quantity;
            }
        }
        return -1;
    }

    public int unreserveStock(String item, int quantity){
        StockItem inStock = marketList.get(item);
        if (inStock != null && quantity >0){
            return inStock.unreserveStock(quantity);
        }
        return -1;
    }

    /*
    Instead of adjusting the item stock level directly, it just calls the finalized stock method.
     */
    public int sellStock(String item, int quantity){
        StockItem itemSell = marketList.get(item); // check if the item exists in the list
        if (itemSell != null){
            if (quantity > 0){
                return itemSell.finalise(quantity); // finalise method returns the quantity sold or zero if there weren't enough to be sold
            }
        }
        return -1;
    }

    public StockItem get(String key){
        return marketList.get(key);
    }

    public Map<String, StockItem> Items(){
        return Collections.unmodifiableMap(marketList);
    }

    @Override
    public String toString() {
        String s = "Super Market List: \n";
        double totalWealth = 0.0;
        for (Map.Entry<String, StockItem> itemEntry : marketList.entrySet()){
            StockItem item = itemEntry.getValue();
            String itemName = itemEntry.getKey();
            double itemValue = item.availableStock() * item.getPrice();
            s = s + "name of item: " + itemName + " and total value of " + itemName + " : " + String.format("%.2f", itemValue) + "$\n";
            totalWealth += itemValue;
        }
        s = s + "Total Wealth of Super Market : " + totalWealth + "$";
        return s;
    }

    public Map<String, Double> priceList(){
        Map<String, Double> priceList = new HashMap<>();
        for (Map.Entry<String, StockItem> entry : marketList.entrySet()){
            StockItem item = entry.getValue();
            priceList.put(item.getName(), item.getPrice());
        }
        return priceList;
    }

    public Map<String, Integer> quantitiesList(){
        Map<String, Integer> quantitiesList = new HashMap<>();
        for (Map.Entry<String, StockItem> entry : marketList.entrySet()){
            StockItem item = entry.getValue();
            quantitiesList.put(item.getName(), item.availableStock());
        }
        return quantitiesList;
    }
}
