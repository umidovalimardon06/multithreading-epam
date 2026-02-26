package threadpool.executorservice.methods;

import lombok.SneakyThrows;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAny {
    @SneakyThrows
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);

        List<Callable<String>> tasks = List.of(
                () -> "Task1",
                () -> "Task2"
        );

        String string = service.invokeAny(tasks);
        System.out.println(string);

        service.shutdown();
    }
}
