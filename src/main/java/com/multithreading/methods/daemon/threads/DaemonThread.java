package com.multithreading.methods.daemon.threads;

import lombok.SneakyThrows;

public class DaemonThread extends Thread{
    private final String name;

    public DaemonThread(String name) {
        this.name = name;
    }

    @Override
    @SneakyThrows
    public void run() {
        System.out.println("START " + this.getName());
        for (int i = 0; i < 15; i++) {
            Thread.sleep(500);
            System.out.println(i);
        }
        System.out.println("END " + this.getName());
    }
}
