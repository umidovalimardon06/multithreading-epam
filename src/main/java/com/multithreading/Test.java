package com.multithreading;

import lombok.SneakyThrows;

public class Test extends Thread{

    @Override
    public void run() {
        for (int i=0; i<=100; i++) {
            System.out.println(i);
        }
    }

    @SneakyThrows
    public static void main(String[] args) {
        new Thread(new Test()).start();
    }
}
