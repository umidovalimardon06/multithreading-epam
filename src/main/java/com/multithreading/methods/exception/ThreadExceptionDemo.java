package com.multithreading.methods.exception;

import lombok.SneakyThrows;

public class ThreadExceptionDemo {
    @SneakyThrows
    public static void main(String[] args) {

        new  Thread(() -> {
            if (Boolean.TRUE) {
                throw new RuntimeException();
            }
            System.out.println("End of the Thread");
        }).start();

        Thread.sleep(10);
        System.out.println("End of the Main");
    }
}
