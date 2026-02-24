package com.multithreading.methods.priority.threads;

public class PriorityThread extends Thread{
    private final String threadName;

    public PriorityThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Thread: "+this.threadName);
        }
    }
}
