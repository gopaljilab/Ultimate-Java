package src.advanced.executiveFramework.asynchronousAPI;

import src.advanced.executiveFramework.callableFuture.LongTask;

import java.util.concurrent.CompletableFuture;

public class MailService {
    public void send(){
        LongTask.simulate();
        System.out.println("Mail was Sent....!");
    }

    public CompletableFuture<Void> sendAsync(){
        return CompletableFuture.runAsync(() -> send());
    }
}
