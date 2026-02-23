package com.multithreading.firstmethod.threads;

public class TalkThread extends Thread {
    @Override
    public void run() {
        this.setName("Talk thread");
        for (int i = 0; i < 5; i++) {
            System.out.print(this.getName() + ": ");
            System.out.println("Talking " + (i + 1));
        }
    }
}
