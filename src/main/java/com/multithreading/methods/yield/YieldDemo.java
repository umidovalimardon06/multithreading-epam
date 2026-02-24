package com.multithreading.methods.yield;

public class YieldDemo {
    public static void main(String[] args) {

        new Thread(() -> {
            Thread.currentThread().setName("Thread-1");
            System.out.println("START " + Thread.currentThread().getName());
            Thread.yield();
            System.out.println("END " + Thread.currentThread().getName());
        }).start();

        new Thread(() -> {
            Thread.currentThread().setName("Thread-2");
            System.out.println("START " + Thread.currentThread().getName());
            Thread.yield();
            System.out.println("END " + Thread.currentThread().getName());
        }).start();

    }
}
