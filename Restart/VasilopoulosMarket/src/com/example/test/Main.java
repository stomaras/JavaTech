package com.example.test;

import java.util.*;

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
        item.reserveStock(10);
        System.out.println(item);
        item.unreserveStock(5);
        System.out.println(item);
        item.finalise(3);



        System.out.println(item);
        marketList.addStock(item);
        tomsBasket.addToBasket(item, 20);

        item = new StockItem("chocolates", 1.20, 1000);
        marketList.addStock(item);
        item.reserveStock(100);
        tomsBasket.addToBasket(item, 10);

        item = new StockItem("tomatoes", 0.65, 200);
        marketList.addStock(item);
        item.reserveStock(5);
        tomsBasket.addToBasket(item, 4);

        item = new StockItem("potatoes", 0.30, 400);
        marketList.addStock(item);
        item.reserveStock(3);

        item = new StockItem("lettuce", 0.44, 300);
        marketList.addStock(item);
        item.reserveStock(4);









        System.out.println(marketList);
        System.out.println("\n");
        System.out.println(tomsBasket);

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

    public static void reservedItems(Map<String, StockItem> items){
        for (Map.Entry<String, StockItem> itemEntry : items.entrySet()){
            StockItem itemm = itemEntry.getValue();
            if (itemm.getReserved() > 0){
                System.out.println("item with name : " + itemm.getName() +
                        " has reserved : " + itemm.getReserved() +
                        " stocks \n");
            }
        }
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
