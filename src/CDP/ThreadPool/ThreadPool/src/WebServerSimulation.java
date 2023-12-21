public class WebServerSimulation {
    public static void main(String[] args) {
        SimpleThreadPool pool = new SimpleThreadPool(10); // 10 threads

        for (int i = 0; i < 100; i++) {
            int requestId = i;
            pool.submitTask(() -> {
                System.out.println("Processing request #" + requestId);
                try {
                    Thread.sleep(100); // Simulate request processing time
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Request processing interrupted.");
                }
            });
        }

        pool.shutdown();

    }
}
