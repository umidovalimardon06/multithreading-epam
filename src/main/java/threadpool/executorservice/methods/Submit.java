package threadpool.executorservice.methods;

import lombok.SneakyThrows;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Submit {
    @SneakyThrows
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Callable<Integer> task = () -> 5 + 10;
        Future<Integer> future = service.submit(task);
        System.out.println(future.get());

        service.shutdown();
    }
}
