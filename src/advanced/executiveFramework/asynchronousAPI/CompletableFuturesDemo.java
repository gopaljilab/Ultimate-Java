package src.advanced.executiveFramework.asynchronousAPI;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {
    public static void show(){
        var future = CompletableFuture.supplyAsync(() -> 1);
        future.thenAcceptAsync(result -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(result);
        });
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
