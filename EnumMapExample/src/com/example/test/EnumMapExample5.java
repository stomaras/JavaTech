package com.example.test;

import java.util.Collection;
import java.util.EnumMap;

enum gfgg {
    India_today,
    United_States_today
}

public class EnumMapExample5 {
    public static void main(String[] args) {

        EnumMap<gfgg, Integer> mp = new EnumMap<>(gfgg.class);

        // Values are associated
        mp.put(gfgg.India_today, 69);
        mp.put(gfgg.United_States_today, 1073);

        // Prints the map
        System.out.println("The EnumMap: " + mp);

        // Retrieving the Collection View of the map
        Collection<Integer> view = mp.values();

        System.out.println("Collection view of map: " + view);



    }

}
