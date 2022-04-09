package com.example.test;
/*
In Customer Thread I create a ThreadLocal Object and overriding initial value method
when the first Thread came t1 -> t1.get() internally initialValue() method will be called
For every Thread a seperate cust id will be maintained
For every Thread if i want a seperate copy then i will go for ThreadLocal Object
 */
public class CustomerThread extends Thread {
    String name;
    static Integer custId = 0;
    private static ThreadLocal tl = new ThreadLocal()
    {
        protected Integer initialValue()
        {
            return ++custId;
        }
    };
    public CustomerThread(String name){
        super(name);
    }

    // job of CustomerThread
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " executing with Customer id: " + tl.get());
    }
}
