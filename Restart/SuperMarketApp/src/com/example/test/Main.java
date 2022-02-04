package com.example.test;

import java.util.Map;

public class Main {

    private static StockList marketList = new StockList();

    public static void main(String[] args) {

        StockItem fruit1 = new StockItem("apple", 2.00, 100);
        marketList.addStock(fruit1);

        StockItem fruit2 = new StockItem("orange", 2.20, 200);
        marketList.addStock(fruit2);

        StockItem fruit3 = new StockItem("lemon", 1.30, 200);
        marketList.addStock(fruit3);

        StockItem fruit4 = new StockItem("banana", 2.34, 500);
        marketList.addStock(fruit4);

        StockItem cups = new StockItem("cup", 3.00, 300);
        marketList.addStock(cups);

        StockItem pencils = new StockItem("pencil", 0.70, 200);
        marketList.addStock(pencils);

        StockItem chocholates = new StockItem("chocholate", 1.50, 200);
        marketList.addStock(chocholates);

        StockItem cigarettes = new StockItem("cigarettes", 2.50, 1000);
        marketList.addStock(cigarettes);

        marketList.Items().get("cigarettes").adjustStock(2000);
        marketList.get("cigarettes").adjustStock(-999);
        System.out.println(marketList);

        for (String s : marketList.Items().keySet()) {
            System.out.println(s);
        }

        System.out.println("Price of products: \n");
        for (Map.Entry<String, Double> price : marketList.priceList().entrySet()) {
            System.out.println(price.getKey() + " costs: " + price.getValue());
        }



        Basket tomsBasket = new Basket("Tom");
        sellItem(tomsBasket, "cigarettes", 5);
        System.out.println(tomsBasket);

        sellItem(tomsBasket, "pencil", 2);
        sellItem(tomsBasket, "cup", 5);
        System.out.println(tomsBasket);

        System.out.println(marketList);

    }

    public static int sellItem(Basket basket, String item, int quantity) {
        // retrieve the item from the super market list
        StockItem stockItem = marketList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (marketList.sellStock(item, quantity) != -1) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }
}
