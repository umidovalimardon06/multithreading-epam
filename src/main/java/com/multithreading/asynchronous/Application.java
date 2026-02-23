package com.multithreading.asynchronous;

import com.multithreading.asynchronous.tasks.SumTask;
import com.multithreading.asynchronous.threads.CounterOne;
import com.multithreading.asynchronous.threads.CounterTwo;
import lombok.SneakyThrows;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Application {
    @SneakyThrows
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> sumTaskResult = executor.submit(new SumTask());

        CounterOne thread1 = new CounterOne();
        CounterTwo thread2 = new CounterTwo();

        thread1.start();
        thread2.start();

        Integer result = sumTaskResult.get();
        System.out.println("Main.. sum is====================:"+result);

        executor.shutdown();
    }
}



