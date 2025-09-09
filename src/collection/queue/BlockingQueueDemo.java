package src.collection.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> blockingQueue = new LinkedBlockingQueue<>(5);
        /*blockingQueue.add("1");
        blockingQueue.add("2");
        blockingQueue.add("3");
        blockingQueue.add("4");
        blockingQueue.add("5");
        *//*blockingQueue.add("1");*/

        blockingQueue.offer("1");
        blockingQueue.offer("1");
        blockingQueue.offer("1");
        blockingQueue.offer("1");
        blockingQueue.offer("1");
        blockingQueue.offer("1");
        blockingQueue.offer("1");
        blockingQueue.poll(20, TimeUnit.SECONDS);

        System.out.println(blockingQueue);
        System.out.println(blockingQueue.size());


    }
}
