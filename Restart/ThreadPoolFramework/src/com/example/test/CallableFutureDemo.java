package com.example.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureDemo
{
    // 6 jobs are there
    public static void main(String[] args) throws Exception {
        MyCallable[] jobs = {
                new MyCallable(10),
                new MyCallable(20),
                new MyCallable(30),
                new MyCallable(40),
                new MyCallable(50),
                new MyCallable(60)
        };
        // I am creating Executor Framework with 3 Threads
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (MyCallable job : jobs)
        {
            Future f = service.submit(job);
            System.out.println(f.get());
        }
        service.shutdown();
    }
}
