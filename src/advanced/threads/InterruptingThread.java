package src.advanced.threads;

public class InterruptingThread implements Runnable{
    @Override
    public void run() {

    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Working....");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("Thread was Interrupted !");
                }
            }
        });
        t1.start();


        // Let t1 work for 2.5 seconds
        Thread.sleep(2500);

        // Interrupt t1
        t1.interrupt();
    }
}
