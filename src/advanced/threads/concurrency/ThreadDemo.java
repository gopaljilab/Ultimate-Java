package src.advanced.threads.concurrency;

public class ThreadDemo {
    public static void show(){
        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("file is ready to be scanned.");
    }
}
