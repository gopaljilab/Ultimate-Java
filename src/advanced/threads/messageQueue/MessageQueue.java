package src.advanced.threads.messageQueue;

public class MessageQueue {
    private String message;
    private boolean empty = true;

    public synchronized void write(String msg) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        message = msg;
        empty = false;
        notify();
    }

    public synchronized String read() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        empty = true;
        notify();
        return message;
    }
}
