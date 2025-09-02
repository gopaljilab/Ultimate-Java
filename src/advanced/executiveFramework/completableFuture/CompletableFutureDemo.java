package src.advanced.executiveFramework.completableFuture;

import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
    public static void show() {
        Supplier<Integer> task = () -> 1;
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(task);
        try {
            int result = future.get();
            System.out.println(result);

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CompletableFutureDemo.show();
    }
}
