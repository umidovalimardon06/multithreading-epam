package com.multithreading.methods.exception;

import lombok.SneakyThrows;

public class MainThreadExceptionDemo {
    @SneakyThrows
    public static void main(String[] args) {

        new  Thread(() -> {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("End of the Thread");
        }).start();

        if (Boolean.TRUE) throw new RuntimeException();
        System.out.println("End of the Main");
    }
}
