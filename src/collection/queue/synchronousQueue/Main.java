package src.collection.queue.synchronousQueue;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        AtomicInteger sharedState = new AtomicInteger();
        CountDownLatch countDownLatch = new CountDownLatch(1);

        Runnable producer = () -> {
            Integer producedElement = ThreadLocalRandom
                    .current()
                    .nextInt();
            sharedState.set(producedElement);
            countDownLatch.countDown();
        };

        Runnable consumer = () -> {
            try {
                countDownLatch.await();
                Integer consumedElement = sharedState.get();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        };

        executor.execute(producer);
        executor.execute(consumer);

        executor.awaitTermination(500, TimeUnit.MILLISECONDS);
        executor.shutdown();
    }
}
