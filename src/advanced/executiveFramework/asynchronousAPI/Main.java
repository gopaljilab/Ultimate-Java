package src.advanced.executiveFramework.asynchronousAPI;

import src.advanced.executiveFramework.completableFuture.CompletableFutureDemo;

public class Main {
    public static void main(String[] args) {
        MailService mailService = new MailService();
        mailService.sendAsync();
        System.out.println("Hello World !!!");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        CompletableFuturesDemo.show();
    }
}
