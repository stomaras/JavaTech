package com.example.test;

/**
 * Enum is used in all the languages right if we talk about c or c++
 * Let's say i want to represent some constants let's say we talked about
 * the range of integers from negative range to positive range
 * we have range in mobile phones or mobile phones company we have Apple
 * we have Samsung right we have all this range, so if you want to create your own range
 * we can use enum
 * We can define enum inside the class as well
 * We can use enum in switch
 * We can create variables and methods inside enums in Java class
 * Every enum in java extends Enum abstarct class in java
 */

enum Mobile
{
    APPLE(300),
    SAMSUNG(200),
    HTC(100);

    int price;

    Mobile(int price)
    {
        this.price = price;
    }

    public int getPrice()
    {
        return price;
    }

}

public class Main
{
    public static void main(String[] args)
    {
        Mobile m = Mobile.APPLE;

        switch (m)
        {
            case APPLE:
                System.out.println("Apple is best");
                break;
            case SAMSUNG:
                System.out.println("1st Copy of Apple");
                break;
            case HTC:
                System.out.println("HTC is the best");
                break;
        }

        System.out.println(Mobile.APPLE.getPrice());

        /*
        If we do not know how many constants we have
        we can use the values() method from the parent class of
        our enum . Parent class of every enum is an Enum abstract class
         */
        Mobile mobiles[] = Mobile.values();
        for (Mobile mobile : mobiles)
        {
            System.out.println(mobile);
        }

    }
}
