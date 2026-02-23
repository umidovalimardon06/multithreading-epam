package com.multithreading.asynchronous.threads;

public class CounterOne extends Thread{
    @Override
    public void run() {
        this.setName("Counter-one");
        for (int i = 0; i < 4000; i++) {
            System.out.println(this.getName() + ":...........");
        }
    }
}
