package com.multithreading.methods.daemon;

import com.multithreading.methods.daemon.threads.DaemonThread;
import lombok.SneakyThrows;

public class Application {
    @SneakyThrows
    public static void main(String[] args) {
        DaemonThread daemonThread = new DaemonThread("Daemon");
        daemonThread.setDaemon(true);
        daemonThread.start();

        System.out.println(Thread.currentThread().getName() + " has been finished");
    }
}
