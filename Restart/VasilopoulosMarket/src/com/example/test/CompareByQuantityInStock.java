package com.example.test;

import java.util.Comparator;

public class CompareByQuantityInStock implements Comparator<StockItem> {

    @Override
    public int compare(StockItem stockItem1, StockItem stockItem2) {
       return Integer.compare(stockItem1.availableStock(), stockItem2.availableStock());
    }
}
