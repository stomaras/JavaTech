package com.example.test;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static StockList marketList = new StockList();
    private static BasketList basketList = new BasketList("Tom's Basket");

    public static void main(String[] args) {
	// write your code here
        StockItem item = new StockItem("banana", 1.23, 35);
        marketList.addStockItem(item);

        item = new StockItem("banana", 1.23, 40);
        marketList.addStockItem(item);

        item = new StockItem("apple", 1.00, 200);
        marketList.addStockItem(item);

        item = new StockItem("oranges", 2.00, 300);
        marketList.addStockItem(item);

        item = new StockItem("tomatoes", 1.90, 400);
        marketList.addStockItem(item);
        
        System.out.println(marketList);
        System.out.println(basketList);

    }




}