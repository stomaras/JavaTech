package com.example.test;

public class MethodChaining {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("durga").append("solutions").reverse().insert(2, "xyz").delete(3,7);
        System.out.println(sb);
    }
}
