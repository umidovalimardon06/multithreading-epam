package threadpool.scheduledexecutorservice.methods.schedule;

import threadpool.scheduledexecutorservice.methods.schedule.threads.WorkerThread;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Schedule {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(1);

        WorkerThread workerThread = new WorkerThread();
        scheduledExecutorService.schedule(workerThread,3, TimeUnit.SECONDS);

        for (int i=1; i<=100; i++)
            System.out.println(i);

        scheduledExecutorService.shutdown();
    }
}
