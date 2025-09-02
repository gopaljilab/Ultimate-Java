package src.advanced.executiveFramework.firstTask;

import src.advanced.executiveFramework.callableFuture.LongTask;

import java.util.concurrent.CompletableFuture;

public class WaitingForFirstTask {
    public static void show(){
        var first = CompletableFuture.supplyAsync(() -> {
            LongTask.simulate();
            return 20;
        });

        var second = CompletableFuture.supplyAsync(() -> 20);

        CompletableFuture.anyOf(first, second)
                .thenAccept(temp -> System.out.println(temp));
    }

    public static void main(String[] args) {
        show();
    }
}
