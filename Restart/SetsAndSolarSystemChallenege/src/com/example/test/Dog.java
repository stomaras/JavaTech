package com.example.test;

import java.util.Objects;

public class Dog {

    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // mark this as final means that this method can not be overriden at that point.
    @Override
    public final boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (obj instanceof Dog) {
            String objName = ((Dog) obj).getName();
            return this.name.equals(objName);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
