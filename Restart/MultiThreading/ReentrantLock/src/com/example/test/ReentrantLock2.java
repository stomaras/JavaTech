package com.example.test;
import java.util.concurrent.locks.*;


public class ReentrantLock2 {

    public static void main(String[] args) {
        // just we create one ReentrantLock
        ReentrantLock l = new ReentrantLock();

        // By main Thread 2 holds are there
        l.lock();
        l.lock();

        System.out.println(l.isLocked());//true
        System.out.println(l.isHeldByCurrentThread());//true
        System.out.println(l.getQueueLength());//0
        l.unlock();
        System.out.println(l.getHoldCount());//1
        System.out.println(l.isLocked());//true

        l.unlock();
        System.out.println(l.isLocked());//false
        System.out.println(l.isFair());//false
    }
}
