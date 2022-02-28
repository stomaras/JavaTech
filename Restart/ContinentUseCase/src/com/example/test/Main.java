package com.example.test;

import com.example.test.peopleComparators.PeopleHeightComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    City city = new City("Agrinio", 70000);
	    People people = new People("Spyros", "Tomaras", 182, "Male", "White");
        System.out.println(city.addPeople(people));
        People people1 = new People("Chris", "Fragulis", 172, "Male", "White");
        People people2 = new People("Kostas", "Fragulis", 182, "Male", "White");
        System.out.println(city.addPeople(people2));
        System.out.println(city.addPeople(people1));

        People people3= new People("Chris", "Fragulis", 172, "Male", "White");
        System.out.println(city.removePeople(people3));

        System.out.println(city);


    }


}
