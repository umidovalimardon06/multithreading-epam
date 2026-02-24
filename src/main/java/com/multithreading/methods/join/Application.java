package com.multithreading.methods.join;

import com.multithreading.methods.join.threads.JoinThread;
import lombok.SneakyThrows;

public class Application {
    @SneakyThrows
    public static void main(String[] args) {
        JoinThread joinThread = new JoinThread("Thread-1");
        joinThread.start();

        System.out.println("START "+Thread.currentThread().getName());
        for (int i=0; i < 5; i++) {
            System.out.println(i);
            if (i == 2) joinThread.join();
        }
        System.out.println("END "+Thread.currentThread().getName());
    }

}
