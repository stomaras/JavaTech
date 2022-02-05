package com.example.test;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " + printer.getPagesPrinted());
    }
}
