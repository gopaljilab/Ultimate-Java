package src.advanced.executiveFramework.callableFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFuture<Q> {

    public static void show() {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        try {
            Future<Integer> future = executor.submit(() -> {
                LongTask.simulate();
                return 1;
            });

            System.out.println("Do More Work");
            try {
                var result = future.get();
                System.out.println(result);
            } catch (InterruptedException |ExecutionException e){
                e.printStackTrace();
            }
        } finally {
            executor.shutdown();
        }
    }
}
