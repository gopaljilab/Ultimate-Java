package src.advanced.executiveFramework.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void show() {
        ExecutorService executor = null;
        try {
            executor = Executors.newFixedThreadPool(2);
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName());
            });
        } finally {
            executor.shutdown();
        }
    }
}
