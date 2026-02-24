package com.multithreading.methods.sleep;

import com.multithreading.methods.sleep.threads.MyThread;

public class Application {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");

        thread2.start();
        thread1.start();
    }
}
