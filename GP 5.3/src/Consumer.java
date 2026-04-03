/**
 * Jessica Willis
 * 4/3/2026
 * 5.3
 */

import java.security.SecureRandom;

public class Consumer implements Runnable {
    private static final SecureRandom generator = new SecureRandom();
    private final BlockingBuffer sharedLocation;

    public Consumer(BlockingBuffer sharedLocation) {
        this.sharedLocation = sharedLocation;
    }

    public void run() {
        int sum = 0;
        for (int count = 1; count <= 10; count++) {
            try {
                Thread.sleep(generator.nextInt(4000));
                sum += sharedLocation.blockingGet();
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.printf("%n%s %d%n%s%n", "COnsumer read values totaling", sum, "Terminating consumer");
    }

}
