package src.advanced.executiveFramework.manyTaskToComplete;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ManyTask {
    public static void show(){
        var first = CompletableFuture.supplyAsync(() -> 1);
        var second = CompletableFuture.supplyAsync(() -> 2);
        var third = CompletableFuture.supplyAsync(() -> 3);

        var all = CompletableFuture.allOf(first, second, third);
        all.thenRun(() -> {
            try {
                var firstResult = first.get();
                System.out.println(firstResult);
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }

            System.out.println("All Task Completed Successfully");
        });

    }

    public static void main(String[] args) {
        show();
    }
}
