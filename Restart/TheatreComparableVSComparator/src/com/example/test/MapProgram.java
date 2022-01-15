package com.example.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
    For a particular key we can have only one value,
    if we put other value for that key then our value is overwritten.
    In hashMap keys have not appeared either in the order we added them
    nor in alphabetical order.
    Immutable objects are things like Strings and Integers
    whose value can not change
    Map keys is good to be immutable and don't behave unpredictably
    , so using classes as keys is in itself fairly advanced.
 */
public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object-oriented");
        languages.put("Python", "an interpreted, object-oriented, high-level programming language");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        languages.remove("Lisp");
        if (languages.remove("Algol", "a family of algorithmic languages")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        Set<Map.Entry<String,String>> AllLanguages = languages.entrySet();
        System.out.println("All key-value pairs in the Map: " + AllLanguages);


        Set<String> keysOfLanguages = languages.keySet();
        System.out.println("All Keys in tha Map: " + keysOfLanguages);
        System.out.println("================================");
        for (String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key)) ;
        }
        System.out.println("===============================");


        boolean k = languages.containsKey("Java");
        System.out.println("Contains key java in map table : " + k);

        if (languages.replace("Lisp", "This will not work", " a functional programming language")){
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }

    }


}
