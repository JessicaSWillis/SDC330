/**
 * Jessica Willis
 * 4/3/2026
 * 5.3
 */

import java.util.concurrent.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Willis 5.3");
        ExecutorService executorService = Executors.newCachedThreadPool();
        BlockingBuffer sharedLocation = new BlockingBuffer();
        executorService.execute(new Producer(sharedLocation));
        executorService.execute(new Consumer(sharedLocation));
        executorService.shutdown();
        executorService.awaitTermination(1,TimeUnit.MINUTES);
    }
}
