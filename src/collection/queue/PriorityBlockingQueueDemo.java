package src.collection.queue;

import java.util.Arrays;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

public class PriorityBlockingQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        PriorityBlockingQueue queue = new PriorityBlockingQueue<>();
        new Thread(() ->{
            System.out.println("Polling...");

            try {
                Object poll = queue.take();
                System.out.println("Polled : " + poll);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        Thread.sleep(TimeUnit.SECONDS.toMillis(5));
        System.out.println("Adding to Queue");
        queue.add(1);
    }
}
