package com.example.test;

public class Main {
    private static StockList stockList = new StockList();
    public static void main(String[] args) {
	// write your code here
        StockItem item1 = new StockItem("orange", 12, 1000);
        stockList.addStock(item1);

        item1 = new StockItem("apple", 23, 900);
        stockList.addStock(item1);

        item1 = new StockItem("banana", 12, 10000);
        stockList.addStock(item1);



        System.out.println(stockList.toString());

    }
}
