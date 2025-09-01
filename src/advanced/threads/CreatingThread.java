package src.advanced.threads;

public class CreatingThread extends Thread{
    public void run(){
        System.out.println("Thread is running.......");
    }

    public static void main(String[] args) {
        CreatingThread thread = new CreatingThread();
        thread.start();

        System.out.println(Thread.currentThread());
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
