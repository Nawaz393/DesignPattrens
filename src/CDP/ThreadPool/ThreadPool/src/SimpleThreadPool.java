import java.util.LinkedList;
import java.util.List;

public class SimpleThreadPool {
    private final List<WorkerThread> threads;
    private final LinkedList<Runnable> taskQueue;

    public SimpleThreadPool(int numberOfThreads) {
        taskQueue = new LinkedList<>();
        threads = new LinkedList<>();

        for (int i = 0; i < numberOfThreads; i++) {
            WorkerThread thread = new WorkerThread(taskQueue);
            thread.start();
            threads.add(thread);
        }
    }

    public void submitTask(Runnable task) {
        synchronized (taskQueue) {
            taskQueue.addLast(task);
            taskQueue.notify();
        }
    }

    public void shutdown() {
        for (WorkerThread thread : threads) {
            thread.interrupt();
        }
    }
}
