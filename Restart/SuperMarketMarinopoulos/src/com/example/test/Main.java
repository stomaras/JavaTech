package com.example.test;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static StockList marketList = new StockList();
    public static void main(String[] args) {
	// write your code here
        StockItem item = new StockItem("banana", 1.23, 35);
        System.out.println(marketList.addStockItem(item));

        item = new StockItem("banana", 1.23, 40);
        System.out.println(marketList.addStockItem(item));

        item = new StockItem("apple", 1.00, 200);
        System.out.println(marketList.addStockItem(item));
        System.out.println(marketList.reserveStock("apple", 3));
        System.out.println(item.getReservedQuantity());
        System.out.println(marketList.unreserveStock("apple", 2));
        System.out.println(item.getReservedQuantity());
        System.out.println(marketList.sellStock("apple", 3));

        System.out.println(marketList);






    }
}
