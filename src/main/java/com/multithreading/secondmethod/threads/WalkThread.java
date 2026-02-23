package com.multithreading.secondmethod.threads;

public class WalkThread implements Runnable {
    @Override
    public void run() {
        Thread.currentThread().setName("Walk thread");
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": Waling " + (i + 1));
        }
    }
}
