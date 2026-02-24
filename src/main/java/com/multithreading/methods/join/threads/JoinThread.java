package com.multithreading.methods.join.threads;

import lombok.SneakyThrows;

public class JoinThread extends Thread{
    private final String threadName;

    public JoinThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    @SneakyThrows
    public void run() {
        System.out.println("START " + this.threadName);
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("END " + this.threadName);
    }

}
