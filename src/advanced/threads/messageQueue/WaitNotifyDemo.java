package src.advanced.threads.messageQueue;

public class WaitNotifyDemo {
    public static void main(String[] args) {
       MessageQueue queue = new MessageQueue();

        Thread producer = new Thread(() -> {
            String[] messages = {"Msg1", "Msg2", "Msg3", "Msg"};
            for(String msg : messages){
                queue.write(msg);
                System.out.println("Produced : " + msg);
            }
        });

        Thread consumer = new Thread(() -> {
            String msg;
            do {
                msg = queue.read();
                System.out.println("Consumed : " + msg);
            }while (!msg.equals("Done"));
        });

        producer.start();
        consumer.start();
    }
}
