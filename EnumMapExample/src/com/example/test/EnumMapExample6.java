package com.example.test;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

enum rank_countries {
    India,
    United_States,
    China,
    Japan,
    Canada,
    Russia
}


public class EnumMapExample6 {

    public static void main(String[] args) {
        EnumMap<rank_countries, Integer> mp = new EnumMap<>(rank_countries.class);

        mp.put(rank_countries.Canada, 67);
        mp.put(rank_countries.China, 32);
        mp.put(rank_countries.Japan, 76);
        mp.put(rank_countries.Russia, 89);

        // Map View
        System.out.println(mp);

        // Creating a new set of the mappings
        // contained in map
        Set<Map .Entry<rank_countries, Integer>> set_view = mp.entrySet();

        // Set view of the mappings
        System.out.println("Set view of the map: " + set_view);
    }
}
