package com.example.test;

public class Main {

    private static StockList stockList = new StockList();

    public static void main(String[] args) {
	// write your code here
        // Now there are two other collection interfaces queue and dequeue
        // that i am gonna leave to later n the course so what we gonna do is finish up
        // this section by looking at his variant of the hash map and hash set classes which is called
        // is called the linkedHashMap and LinkedHashSet now there are also sorted versions
        // of the map and set interfaces sorted map and sorted set that are implemented in
        // tree map and tree set so well actually go through and have look at those as well
        // Because the operations on sets and maps are so similar the examples in here
        // will concentrate on the maps rather than sets. Now the link variants of hash map
        // and hash set are called linked hash map and linked hash set and any real differences
        // is that they got an ordering to them now in the Oracle Documentation the ordering
        // of items in a Hash Map or Hash Set is described as chaotic but the linked version
        // maintain insertion order so once you put items in the collection you know the order
        // that the results will come back when you iterate over it now we'll take advantage
        // of this in the next example by adding items in an alphabetical order. The examples
        // gonna allows users to add purchases to a shopping basket after choosing them from the list
        // of all the items on sale now to do this we need to maintain two collections.
        // the first is the list of all the items are in stock and the second is the items
        // that a customers added to the basket so although it might seem a bit contrived
        // to add the stock items in alphabetical order in reality the items would come
        // from a database o they could be at any order we wanted by using an order by clause
        // and the query the SQL query that retrieves them from the database so lets
        // get with the example to see how a linked hash map can be useful and then
        // extend that to use a tree map I'm gonna start by creating a basic stock item class
        // StockItem class.
        //
        // Let's add some items on the stock and start selling them
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("Cake", 1.00, 200);
        stockList.addStock(temp);

        temp = new StockItem("Car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("Phone", 96.99, 35);
        stockList.addStock(temp);

        // Random order even though we added them alphabetically the actual items are
        // still stored at the moment in a pretty random order and the reason is because
        // the stock list classes is using a HashMap to store the items.
        // So in order to add the items in alphabetical order we are gonna use the
        // LinkedHashMap instead

        System.out.println(stockList);



    }
}
