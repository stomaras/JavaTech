package com.example.test;

import myutility.MyUtils;

import java.util.ArrayList;
import java.util.Collections;

public class StringSortingDemo {

    public static void main(String[] args) {

        ArrayList<String> musicList = new ArrayList<>();
        musicList.add("In the End");
        musicList.add("Burning Heart");
        musicList.add("I want it all");
        musicList.add("Rock You Like A Hurricance");
        musicList.add("No one like you");


        MyUtils.iterateList(musicList);
        Collections.sort(musicList);
        System.out.println("=============================");
        System.out.println("after sorting the list: ");
        System.out.println("=============================");
        MyUtils.iterateList(musicList);

    }




}
