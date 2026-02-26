package threadpool.scheduledexecutorservice.methods.scheduleatfixedrate.threads;

public class WorkerThread extends Thread {
    private final int firstDelay;
    private final int waitingInterval;

    public WorkerThread(int firstDelay, int waitingInterval) {
        this.firstDelay = firstDelay;
        this.waitingInterval = waitingInterval;
    }

    @Override
    public void run() {
        this.setName("Worker-thread with delay:" + firstDelay + " | " + "interval:" + waitingInterval);
        System.out.println(".. " +this.firstDelay+ "-seconds-delay...thread is digging a hole");
        System.out.println("Waiting " + this.waitingInterval + " seconds as interval timing!");
        System.out.println(System.currentTimeMillis()/1000);
        System.out.println();
    }
}
