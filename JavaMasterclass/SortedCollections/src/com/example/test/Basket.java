package com.example.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


/*
    INTEGER in Map is the quantity which actually order.
    So again the items in the basket are stores as a map
    and the actual item is the key that we are using and the quantity
    purchased is the value in the map.
    addToBasket check the list of items to see if an item is already present
    in the shopping basket when a new one is being added and you saw me to do
    that on line 29 by using getOrDefault we eitheer get the quantity already present
    or 0.
    When the item is put in the map obviously it replaces any quantity that may
    already be present
 */

public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new HashMap<>();
    }

    public int addToBasket(StockItem item, int quantity) {
        if ((item != null) && (quantity > 0)) {
            int inBasket = list.getOrDefault(item,0);
            list.put(item, inBasket + quantity);
            return inBasket;
        }
        return 0;
    }

    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + list.size() + " items\n";
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            s = s + item.getKey() + ". " + item.getValue() + "purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost" + totalCost;
    }
}
