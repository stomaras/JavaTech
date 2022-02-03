package com.example.test;

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

        Basket tom = new Basket("Tom");
        tom.addToBasket(fruit1, 10);
        tom.addToBasket(fruit3, 4);
        tom.addToBasket(cups, 3);

        Basket chris = new Basket("Chris");
        chris.addToBasket(fruit2, 8);
        chris.addToBasket(pencils, 3);
        chris.addToBasket(chocholates, 5);
        chris.addToBasket(cigarettes, 2);

        Basket kostas = new Basket("Kostas");
        kostas.addToBasket(chocholates, 10);

        System.out.println(marketList.toString());
        System.out.println(tom.toString());
        System.out.println(chris.toString());
        System.out.println(kostas.toString());

    }
}
