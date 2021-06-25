package com.example.test;


// So in this class we are gonna store the name of the items for sale with a price
// and the quantity in stock also override equals and hash Code and in addition
// will also implement comparable so the stock items can be used in a sorted
// collection.

// Normally we can not initialized quantityStock iin both places but the reason
// i've done this is because which one to use often confuses students its really down
// to personal preference. Now name and price have to be initialized obviously in the
// constructor because we are using the constructors parameters to provide the
// values but if your not passing a fields value to the in the constructor then its
// does not really matter where you initialize it as far as Java is concern so
// Its also useful to have a constructor that does not include the stock levels with that
// said and see if it allows some of the spinner perhaps to set up the stock items
// before the list was passed to the warehouse


public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityStock = 0;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0; // or here (but you wouldn't normally do both).
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public void setPrice(double price) {
        if (price > 0.0) {
            this.price = price;
        }
    }

    // Allows stock levels to be increased or decreased
    // increase the stock that is added and sold and contains
    // a check to make sure the stock levels can't drop below zero so
    // obviously we are doing it this wayy so we can actually pass (-) quantities
    // so you literally adjust the stock and not just adding stock you can also
    // deduct from it as well.
    public void adjustStock(int quantity) {
        int newQuantity = this.quantityStock + quantity;
        if (newQuantity >= 0) {
            this.quantityStock = newQuantity;
        }
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering StockItem.equals");
        if (obj == this) {
            return true;
        }

        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        // So we are comparing the name of our current object we are running
        // in versus the object that's been passed this method and then we are going
        // to return a standard string equal
        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);

    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public int compareTo(StockItem o) {
        System.out.println("Entering StockItem.compareTo");
        if (this == o) {
            return 0;
        }

        // So basically we are using the in-built functionality for a string
        // in using that as a way to compare the stock item and the test on line
        // 69 to test its not null we need to make sure that we do check for null
        // because if we get a null stock item pass in this method the code on line
        // 65 will still execute because you can compare null variables.
        // Now we compare the stock item name which is in this current object
        // we are running compared to ther one that's been pass to this method
        // that will return the correct value -1, 0 or 1 depending on the value
        // whther it's sort of less than the same or greater than ok so that's
        // returning and then what we will do is we are going to throw and i know
        // we have not talk too much about  exceptions but we are going to do a throw
        //
        if (o != null) {
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + " : price " + this.price;
    }
}

// End we will actually implement a stock list class and this gonna hold
// a list of all the stock items in a map than we will need some methods
// to add stock and to remove it when it is sold .
//
// That is going to hold a list of all the stock items in a map and will need
// method in this class to add stock to the stocklist class also to remove it when the actual
// items the stock item product is actually sold.
//
// Because the StockItem class uses the name when ovwerriding equals and hashCode, we can safety use the name as the Key
// for the map which is going to make our life a lot easier.
