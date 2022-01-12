package com.example.test;

public class StackImpl {
    /*
        Time Complexity for all the operations is o(1)
     */
    int size;
    int arr[];
    int top;

    public StackImpl(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public int pop() {
        if (!isEmpty()) {
            int returnedTop = top;
            top--;
            System.out.println("poped element : " + arr[returnedTop]);
            return arr[returnedTop];
        } else {
            System.out.println("stack is empty");
            return -1;
        }
    }

    public void push(int element) {

        if (!isFull()) {
            top++;
            arr[top] = element;
            System.out.println("pushed element : " + element);
        } else {
            System.out.println("Stack is full now");
        }
    }

    public int peek() {

        if (!this.isEmpty()) {
            return arr[top];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public boolean isEmpty() {
        return (top==-1);
    }

    public boolean isFull(){
        return (size-1 == top);
    }

    public static void main(String[] args) {
        StackImpl stackImpl = new StackImpl(10);
        stackImpl.pop();
        System.out.println("==========================");

        stackImpl.push(100);
        stackImpl.push(200);
        stackImpl.push(300);
        stackImpl.push(400);

        System.out.println("==========================");
        System.out.println(stackImpl.peek());

        stackImpl.pop();
        stackImpl.pop();
        System.out.println(stackImpl.peek());

    }
}
