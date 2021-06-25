package com.example.test;

// As i mentioned that we need a map and the map is gonna store stock
// items and we are going to use a string as a primary key and that's
// ultimately going to be the stock item name.

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    // Next we want an add stock method and that's ultimately going to be used
    // to add items to our list of all stock items so
    // That will retrieved the stock item based on name but we are going to
    // change that we are going to use something called getOrDefault() and that
    // needs two parameters the first one is the item name to look up and the
    // second parameter is going to be item and that method does what you think
    // it would do its get or default so its going to get the item if it already exists
    // in the map and if it does not exist its going to use this item that we actually
    // pass to this method as the item is going to be in stock. So either way at the end
    // of this inStock is going to have an item

    public int addStock(StockItem item) {
        if (item != null) {
            // check if already have quantities of this item
            //StockItem inStock = list.getOrDefault(item.getName(), item);
            StockItem inStock = list.get(item.getName());
            // if there are already stocks on this item, adjust the quantity
            // we determine if the item is already existing in map
            if (inStock != null){
                item.adjustStock(inStock.getQuantityStock());
            }

            list.put(item.getName(), item);
            return item.getQuantityStock();
        }
        return 0;
    }

    public int sellStock(String item, int quantity) {
        StockItem inStock = list.getOrDefault(item, null);

        if ((inStock != null) && (inStock.getQuantityStock() >= quantity) && (quantity > 0)) {
            inStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }

    public StockItem get(String key) {
        return list.get(key);
    }

    public Map<String, StockItem> Items() {
        // Returns an unmodifiable view of the specified map. This method
        // allows modules to provide users with "read-only" access to internal maps.
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0.0;
        for (Map.Entry<String, StockItem> item : list.entrySet()) {
            StockItem stockItem = item.getValue();
            double itemValue = stockItem.getPrice() * stockItem.getQuantityStock();

            s = s + stockItem + ". There are " + stockItem.getQuantityStock() + " in stock. Value of items ";
            s = s + String.format("%.2f",itemValue) + "\n";
            totalCost += itemValue;
        }

        return s + "Total stock value " + totalCost;
    }

    public Map<String, Double> PriceList() {
        Map<String, Double> prices = new LinkedHashMap<>();
        for (Map.Entry<String, StockItem> item : list.entrySet()) {
            prices.put(item.getKey(), item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
    }
}

// We are going to set up a shopping basket because of course the real aim of this
// example which i mentioned a few videos ago is to provide a shopping basket now
// i've used a map for the stock list as you saw in the previous video and he reason
// i did that was because this section is about the Java Collections Framework but the actual
// stock list could be sored in a number of different ways and with the database.
// propably been the most likely one you go for when customers come to buy the goods
// we need some way to store the items they are buying and of course the quantity of each
// one so we store the quantity in stock in a field of the stock item class
//
// In shopping basket though the program will have to keep track of the quantities
// for each customer and their could be thousands of customers so having a field for
// each one of the stock item classes is obviously not an option a map is designed to store
// key value pairs so it makes a good candidate for associating a quantity with a stock item
// and by creating a new shopping basket for each customer the program can track how many
// of each item that the customers are actually buying now the stock item is the key
// in the map in this situation and the quantity purchased is stored as the value
// for the relevant key now i could have just used the items name as the key but then
// the basket class will have to look up the items in the stock list to update
// the stock count or get the price so by storing the actual items the basket
// class can retrieve any information that it needs directly from the item which
// obviously is pretty convenient.

// Before we actually collect some stock
