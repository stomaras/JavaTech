package com.example.test;

import java.util.Objects;

public class Human {

    public int adharNumber; // unique by person in india
    public String name;

    public Human(int adharNumber, String name) {
        this.adharNumber = adharNumber;
        this.name = name;
    }



//    @Override
//    public int hashCode() {
//        return super.hashCode(); // returning the Object class hashCode method
//    }

    @Override
    public int hashCode() {
        return adharNumber;
    }

    @Override
    public boolean equals(Object obj) {
        /*
        If we compre the same object with itself
         */
        if (obj == this)
        {
            return true;
        }
        /*
        If obj is null
         */
        if (obj == null)
        {
            return false;
        }
        /*
        If we try to compare objects from # classes
         */
        if (obj.getClass() != this.getClass())
        {
            return false;
        }
        Human anotherHuman = (Human)obj;
        if (this.adharNumber != anotherHuman.adharNumber)
        {
           return false;
        }
        if (this.name == null)
        {
            if (anotherHuman.name != null)
            {
                return false;
            }

        }
        if (!this.name.equals(anotherHuman.name))
        {
            return false;
        }
        return true;
    }
}
