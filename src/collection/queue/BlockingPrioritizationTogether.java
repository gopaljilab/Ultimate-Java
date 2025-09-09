package src.collection.queue;

import java.util.Arrays;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingPrioritizationTogether {
    public static void main(String[] args) {
        BlockingPrioritizationTogether.usingBlockingAndPartitionTogether();
    }

    public static void usingBlockingAndPartitionTogether(){
        PriorityBlockingQueue queue = new PriorityBlockingQueue<>();

        Thread thread = new Thread(() -> {
            System.out.println("Polling...");

            while (true) {
                try {
                    Object poll = queue.take();
                    System.out.println("Polled : " + poll);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();

        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(5));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Adding to queue");

        queue.addAll(Arrays.asList(1, 5, 6, 1, 2, 6, 7));
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
