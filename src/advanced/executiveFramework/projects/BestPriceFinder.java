package src.advanced.executiveFramework.projects;

import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class BestPriceFinder {
    public static void show(){
        var start = LocalTime.now();
        FlightService service = new FlightService();

        var futures = service.getQuotes()
                .map(future -> future
                        .thenAccept(System.out::println))
                .collect(Collectors.toList());

        CompletableFuture
                .allOf(futures.toArray(new CompletableFuture[0]))
                .thenRun(() -> {
                  var end = LocalTime.now();
                  var duration = Duration.between(start,end);
                  System.out.println("Retrieve All Quotes in " +
                          duration.toMillis() + "msec.");
                });

        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        show();
    }
}
