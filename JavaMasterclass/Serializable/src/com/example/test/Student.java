package com.example.test;

import java.io.Serializable;

public class Student implements Serializable {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

// In the above example, Student class implements Serializable interface. Now its object
// can be converted into stream.
