package threadpool.scheduledexecutorservice.methods.schedulewithfixeddelay;

import threadpool.scheduledexecutorservice.methods.schedulewithfixeddelay.threads.WorkerThread;

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Application {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter initial delay:");
        int delay = scanner.nextInt();
        System.out.print("enter waiting-interval from previous thread END:");
        int waitingInterval = scanner.nextInt();

        WorkerThread workerThread = new WorkerThread(delay,waitingInterval);
        executor.scheduleWithFixedDelay(workerThread,delay,waitingInterval, TimeUnit.SECONDS);
    }

}
