package com.example.test;

import java.util.EnumMap;

enum gfg {
    Global_today,
    India_today,
    China
};

public class EnumExample4 {

    public static void main(String[] args) {
        EnumMap<gfg, Integer> mp = new EnumMap<>(gfg.class);

        // Values are associated
        mp.put(gfg.Global_today, 799);
        mp.put(gfg.India_today, 69);

        System.out.println("The map is: " + mp);

        // Stores the old value associated with the key
        int prev_value = mp.put(gfg.India_today, 74);

        // Prints the old value
        System.out.println("Previous Value: " + prev_value);

    }
}
