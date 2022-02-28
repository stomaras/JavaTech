package com.example.test.peopleComparators;

import com.example.test.People;

import java.util.Comparator;

public class PeopleHeightComparator implements Comparator<People> {

    @Override
    public int compare(People firstPeople, People secondPeople) {
        if (firstPeople.getHeight() > secondPeople.getHeight()){
            return 1;
        } else if (firstPeople.getHeight() == secondPeople.getHeight()){
            return 0;
        } else {
            return -1;
        }
    }
}
