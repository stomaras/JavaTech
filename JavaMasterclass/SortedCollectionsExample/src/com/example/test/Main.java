package com.example.test;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
	// write your code here
        // In Oracle documentation the ordering of items in a HashMap or HashSet is described
        // as chaotic but the linked versions maintain insertion order so once you put
        // items in the collection you know the order that the results will come back when
        // you iterate over it now we will take advantage of this in next example shortly
        // by adding our items in alphabetical order the examples gonna allows users to
        // add purchases to a shopping basket after choosing them from the list of all
        // the items on sale.
        // We need to maintain two collections the first is the list of all the items
        // that are in stock and the second is the items that a customers added to the
        // basket so although it might seem a bit contrived to add the stock items
        // in alphabetical order in reality the items would come from a database
        // so they could be at any order we wanted by using an order clause and the query the SQL query.
        // Let's see how the LinkedHashMap is useful and see how we extend that to use
        // a TreeMap

        /*

        Modify the program so that adding items to the shopping basket doesn't
        actually reduce the stock count but, instead, reserves the requested number of items.

        You will need to add a "reserved" field to the StockItem class to store the
        number of items reserved.

        Items can continue to be added to the basket, but it should not be possible to
        reserve more than the available stock of any item. An item's available stock
        is the stock count less the reserved amount.

        The stock count for each item is reduced when a basket is checked out, at which
        point all reserved items in the basket have their actual stock count reduced.

        Once checkout is complete, the contents of the basket are cleared.

        It should be also be possible to "unreserve" items that were added to the basket
        by mistake.

        The program should prevent any attempt to unreserve more items than were
        reserved for a basket.

        Add code to Main that will unreserve items after they have been added to the basket,
        as well as unreserving items that have not been added to make sure that the code
        can copy with invalid requests like that.

        After checking out the baskets, display the full stock list and the contents of each
        basket that you created.
         */

        StockItem temp = new StockItem("cake", 2.00, 4);
        stockList.addStock(temp);

        temp = new StockItem("mik", 1.63, 10);
        stockList.addStock(temp);

        temp = new StockItem("bread", 2.21, 100);
        stockList.addStock(temp);

        temp = new StockItem("car", 2.000, 3);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        System.out.println(stockList);

        for (String s : stockList.Items().keySet()) {
            System.out.println(s);
        }

    }
}
