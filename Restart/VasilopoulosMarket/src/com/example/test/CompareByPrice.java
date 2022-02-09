package com.example.test;

import java.util.Comparator;

public class CompareByPrice implements Comparator<StockItem> {

    @Override
    public int compare(StockItem stockItem1, StockItem stockItem2) {
        return Double.compare(stockItem1.getPrice(), stockItem2.getPrice());
    }
}
