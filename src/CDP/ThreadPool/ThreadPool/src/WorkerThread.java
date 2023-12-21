import java.util.LinkedList;

public class WorkerThread extends Thread {
    private final LinkedList<Runnable> taskQueue;
    public WorkerThread(LinkedList<Runnable> taskQueue) {
        this.taskQueue = taskQueue;
    }
    public void run() {
        Runnable task;
        while (true) {
            synchronized (taskQueue) {
                while (taskQueue.isEmpty()) {
                    try {
                        taskQueue.wait();
                    } catch (InterruptedException e) {
                        return; // Thread interrupted, exit.
                    }
                }
                task = taskQueue.removeFirst();
            }
            try {
                task.run();
            } catch (RuntimeException e) {
                System.out.println("Thread pool task failed: " + e.getMessage());
            }
        }
    }
}

