package threadpool.executorservice.methods;

import lombok.SneakyThrows;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAll {
    @SneakyThrows
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);

        List<Callable<String>> tasks = List.of(
                () -> "Task1",
                () -> "Task2"
        );
        List<Future<String>> results = service.invokeAll(tasks);

        for (Future<String> result : results) {
            System.out.println(result.get());
        }
        service.shutdown();
    }
}
