/**
 * Jessica Willis
 * 4/3/2026
 * 5.3
 */

import java.security.SecureRandom;

public class Producer implements Runnable {
    private static final SecureRandom generator = new SecureRandom();
    private final BlockingBuffer sharedLocation;

    public Producer(BlockingBuffer sharedLocation) {
        this.sharedLocation = sharedLocation;
    }

    public void run() {
        for (int count = 1; count <= 10; count++) {
            try {
                Thread.sleep(generator.nextInt(1000));
                sharedLocation.blockingPut(count);
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.printf("Producer done producing%nTerminating Producer%n");
    }

}
