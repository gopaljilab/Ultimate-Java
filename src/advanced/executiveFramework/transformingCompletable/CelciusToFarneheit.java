package src.advanced.executiveFramework.transformingCompletable;

import java.util.concurrent.CompletableFuture;

public class CelciusToFarneheit {
    public static int toFahrenheit(int celsius) {
        return (int) (celsius * 1.8) + 32;
    }

    public static void show() {
        var future = CompletableFuture.supplyAsync(() -> 20);
        future
                .thenApply(CelciusToFarneheit::toFahrenheit)
                .thenAccept(f -> System.out.println(f));


    }
}
