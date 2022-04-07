package com.example.test;

import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread
{
    // For this class i will create multiple thread objects so
    // lock should be unique
    static ReentrantLock l = new ReentrantLock();
    MyThread(String name)
    {
        super(name);
    }
    public void run()
    {
        if (l.tryLock())
        {
            System.out.println(Thread.currentThread().getName() + "...got lock and performing safe operations");
            try
            {
                Thread.sleep(2000);
            } catch (InterruptedException e)
            {

            }
            l.unlock();
        } else
        {
            System.out.println(Thread.currentThread().getName() + "...unable to get lock and hence performing alternative operations");
        }

    }

}
