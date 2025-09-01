package src.advanced.threads.bank;

public class RaceConditionEx {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();

        Runnable task = () -> {
            account1.withdraw(2000);
        };

        Thread t1 = new Thread(task, "Person-1");
        Thread t2 = new Thread(task, "Person-2");

        t1.start();
        t2.start();
    }
}
