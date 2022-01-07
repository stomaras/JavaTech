package com.example.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
            Map Interface

            1st way : HashMap()

            we need a key value pair here and to achieve key value pairing we use map so
            Both HashSet and HashMap both uses concept of HashCode and they don't give you the actual
            sequence in which you are adding the values.
            For every key which is not available will give you null.
            In Map we have a method called keySet(), which has all set of keys
            If i repeat the name of a key then the second key will replace the original one
            I can have two values with the same name, but not two keys with the same name
            We have a Set of keys and a List of values in list we can repeat the values.


         */

        Map<String, String> map = new HashMap();
        map.put("myName", "Tom");
        map.put("Actor", "John");
        map.put("CEO", "Someone");
        map.put("CEO", "tomy gun");

        Set<String> keys = map.keySet();

        for (String key : keys)
        {
            System.out.println(key + "  " + map.get(key));
        }
    }
}
