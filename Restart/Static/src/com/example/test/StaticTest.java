package com.example.test;

public class StaticTest {

    // one version of this exist in memory any time
    /*
        Note!!! static methods and fields belong to the class and not to instances of the class
     */


    private static int numInstances = 0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
