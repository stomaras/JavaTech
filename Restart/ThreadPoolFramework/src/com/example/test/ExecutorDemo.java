package com.example.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        PrintJob[] jobs = {
                new PrintJob("Tom"),
                new PrintJob("Chris"),
                new PrintJob("Zarma"),
                new PrintJob("Kanas"),
                new PrintJob("Bill")
        };
        ExecutorService service = Executors.newFixedThreadPool(5 );
        for (PrintJob job : jobs)
        {
            service.submit(job);
        }
        service.shutdown();
    }
}
