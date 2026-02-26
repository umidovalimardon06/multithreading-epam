package threadpool.scheduledexecutorservice.methods.schedule.threads;

public class WorkerThread extends Thread {
    @Override
    public void run() {
        this.setName("Worker-thread");
        System.out.println(".. 3-seconds-later...thread is digging a hole");
    }
}
