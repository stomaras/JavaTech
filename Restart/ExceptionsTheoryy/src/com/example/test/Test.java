package com.example.test;

public class Test extends  RuntimeException{

    public static void main(String[] args) {
        throw new Test();
    }
}
