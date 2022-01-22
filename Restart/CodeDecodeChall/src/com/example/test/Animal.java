package com.example.test;

public interface Animal {

    public void specialCapabilities();

    /**
     * Note : with the default keyword all issues gets vanished
     */
    default public void legs() {
        System.out.println("animal have 4 legs");
    }


}
