package src.fundamental.types;

public class Lab9_2Operators {
    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 3;
        System.out.println("Number1 = " + number1);
        System.out.println("Number2 = " + number2);

        System.out.println("---------------------------------- Comparison Operator ----------------------------------");

        System.out.println("Number1 == Number2 : " + (number1 == number2));     // equals operator return true or false
        System.out.println("Number1 != Number2 : " + (number1 != number2));     // not equals operator return true or false
        System.out.println("Number1 < Number2 : " + (number1 < number2));       // less than operator return true or false
        System.out.println("Number1 > Number2 : " + (number1 > number2));       // greater than operator return true or false
        System.out.println("Number1 >= Number2 : " + (number1 >= number2));      // greater than equals to operator return true or false
        System.out.println("Number1 >= Number2 : " + (number1 <= number2));      // less than equals to operator return true or false

        System.out.println("");
    }
}
