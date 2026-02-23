package com.multithreading.secondmethod;

import com.multithreading.secondmethod.threads.WalkThread;

public class Application {
    public static void main(String[] args) {
        System.out.println("main-thread start");
        Thread walkThread = new Thread(new WalkThread());
        walkThread.start();
        System.out.println("main-thread end");
    }
}
