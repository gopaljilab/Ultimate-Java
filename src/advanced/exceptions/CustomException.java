package src.advanced.exceptions;

// Custom Exception
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        try {
            checkNumber(-5);   // Will throw exception
        } catch (MyException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    static void checkNumber(int num) throws MyException {
        if (num < 0) {
            throw new MyException("Number cannot be negative!");
        }
        System.out.println("Valid number: " + num);
    }
}

