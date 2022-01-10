package com.example.test;

public class MyLinkedList {

    Node head;

    class Node{

        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }

    }

    public void printMyLinkedList() {

        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }


    public static void main(String[] args) {

        MyLinkedList linkedlist = new MyLinkedList();

        Node first = linkedlist.new Node(10);
        linkedlist.head = first;

        Node second = linkedlist.new Node(20);
        first.next = second;

        Node third = linkedlist.new Node(30);
        second.next = third;

        linkedlist.printMyLinkedList();

    }
}
