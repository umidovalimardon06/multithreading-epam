package com.multithreading.methods.priority;

import com.multithreading.methods.priority.threads.PriorityThread;

public class Application {
    public static void main(String[] args) {
        PriorityThread minPriorityThread =
                new PriorityThread("Min-priority thread");
        PriorityThread normalPriorityThread =
                new PriorityThread("Normal-priority thread");
        PriorityThread maxPriorityThread =
                new PriorityThread("Max-priority thread");

        minPriorityThread.setPriority(Thread.MIN_PRIORITY);
        normalPriorityThread.setPriority(Thread.NORM_PRIORITY);
        maxPriorityThread.setPriority(Thread.MAX_PRIORITY);

        minPriorityThread.start();
        normalPriorityThread.start();
        maxPriorityThread.start();
    }
}
