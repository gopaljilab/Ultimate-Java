package src.oops.bank;

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        System.out.println("Welcome to State Bank Of India");
        System.out.println("--------------------------------");
        acc.setAccountHolder("Gopal");
        acc.setBalance(5000);

        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Balance: ₹" + acc.getBalance());

        acc.setBalance(-2000); // Invalid update → will be blocked
    }
}
