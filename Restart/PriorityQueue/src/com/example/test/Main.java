package com.example.test;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
	// write your code here

        PriorityQueue<Integer> pr = new PriorityQueue<Integer>();
        pr.add(750);
        pr.add(900);
        pr.add(500);
        pr.add(100);

        // size of priorityQueue
        System.out.println(pr.size());

        // fetch a value from priorityQueue
        // least the front of the priorityQueue will be removed
        System.out.println(pr.poll());
    }
}
