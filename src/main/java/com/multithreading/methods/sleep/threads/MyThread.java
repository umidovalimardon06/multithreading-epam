package com.multithreading.methods.sleep.threads;

import lombok.SneakyThrows;

public class MyThread extends Thread {
    private final String threadName;

    public MyThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    @SneakyThrows
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread: " + this.threadName + " i=" + i);
            Thread.sleep(1000);
        }
    }
}




