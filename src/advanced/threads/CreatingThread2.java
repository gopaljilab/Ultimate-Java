package src.advanced.threads;

public class CreatingThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is Running......");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new CreatingThread2());
        thread.start();
    }
}
