package com.example.test;

import java.util.HashMap;
import java.util.Map;

public class Basket {

    private final String basketName;
    private final Map<StockItem, Integer> basketList;

    public Basket(String basketName) {
        this.basketName = basketName;
        this.basketList = new HashMap<>();
    }


}
