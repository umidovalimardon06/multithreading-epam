package com.multithreading.firstmethod;

import com.multithreading.firstmethod.threads.TalkThread;

public class Application {
    public static void main(String[] args) {
        System.out.println("main-thread start");
        TalkThread talkThread = new TalkThread();
        talkThread.start();
        System.out.println("main-thread end");
    }
}
