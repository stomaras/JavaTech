package com.example.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Main {

    private static StockList marketList = new StockList();
    private static Basket tomsBasket = new Basket("Tom");

    public static void main(String[] args) {
	// write your code here
        StockItem item = new StockItem("cups", 3.43, 200);
        marketList.addStock(item);

        item = new StockItem("tea", 2.00, 300);
        marketList.addStock(item);

        item = new StockItem("apple", 0.40, 1000);
        marketList.addStock(item);

        item = new StockItem("apple", 0.40, 1000);
        marketList.addStock(item);

        item = new StockItem("banana", 0.60, 1000);
        marketList.addStock(item);
        tomsBasket.addToBasket(item, 20);

        item = new StockItem("chocolates", 1.20, 1000);
        marketList.addStock(item);
        tomsBasket.addToBasket(item, 10);
        System.out.println(item.reserveStock(900));
        System.out.println(item.unreserveStock(899));



//        System.out.println(tomsBasket);
//        System.out.println(marketList);
//        System.out.println(sellStock(tomsBasket, "chocolates", 10));
//        System.out.println(tomsBasket);
//        System.out.println(marketList);
//
//
//        ItemsPrices();
//        QuantitiesList();

    }

    public static int sellStock(Basket basket, String item, int quantity){
        StockItem sellItem = marketList.get(item);
        if (sellItem != null){
            if (marketList.sellStock(sellItem.getName(), quantity) > 0){
                basket.addToBasket(sellItem, quantity);
            }
            return quantity;
        }
        return -1;
    }

    public static void ItemsPrices(){
        System.out.println("\n");
        System.out.println("Super Market (Item -> Value) : ");
        Map<String, Double> priceList = marketList.priceList();
        for (Map.Entry<String, Double> itemm : priceList.entrySet()){
            System.out.println(itemm.getKey() + " -> " + itemm.getValue() + "$");
        }
    }

    public static void QuantitiesList(){
        System.out.println("\n");
        System.out.println("Super Market (Item -> Quantity) : ");
        Map<String, Integer> quantitiesList = marketList.quantitiesList();
        for (Map.Entry<String, Integer> item : quantitiesList.entrySet()){
            System.out.println(item.getKey() + " -> " + item.getValue() + " in stock");
        }
    }
}
