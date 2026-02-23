package com.multithreading.asynchronous.tasks;

import java.util.concurrent.Callable;

public class SumTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int a = 5;
        int b = 10;
        Thread.sleep(1);
        return a+b;
    }
}
