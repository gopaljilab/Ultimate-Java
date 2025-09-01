package src.advanced.threads.raceCondition;

public class DownloadFileTask implements Runnable{
    private final DownloadStatus status;

    public DownloadFileTask(){
        this.status = new DownloadStatus();
    }

    @Override
    public void run() {
        System.out.println("Downloading a file : " + Thread.currentThread().getName());
        for (int i = 0; i < 10_000; i++) {
            if (Thread.currentThread().isInterrupted()) return;
            status.incrementTotalBytes();
        }

        System.out.println("Downloading Complete..." + Thread.currentThread().getName());
    }
    public DownloadStatus getStatus() {
        return status;
    }
}
