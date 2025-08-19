package src.fundamental.types;

public class Lab6_1Arithmetic_Exp {
    public static void main(String[] args) {
        int num1 = 3,num2 = 4;
        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);
        int sum = num1 + num2;      //simple math calculation
        System.out.println("Sum of num1 and num2 = " + sum);

        System.out.println("------------------------------------------------------------------------------------------");

        System.out.println("num1 Post Increment = " + num1++);     // increment after print it .... num1 = 3 in internally num1 = 4 after print
        System.out.println("num2 Post Decrement = " + num2--);     // decrement after print it .... num2 = 4 in internally num1 = 3 after print
        System.out.println("num1 Pre Increment = " + ++num1);     //first increment then print...  num1 = 5
        System.out.println("num2 Pre Decrement = " + --num2);     //first decrement then print.... num2 = 2;

        System.out.println("-----------------------------------------------------------------------------------------");

        int shortHand = (num1 += 1);        // nothing but num1 = num1 + 1
        System.out.println("num1 = " + num1);

        int div,mul,mod,sub;
        div = (num1 /= 2);  //num1 = num1 / 2 ---> 3
        System.out.println("num1 divide by 2 = " + div);

        mul = (num1 *= 3); // num1 = num * 3 --->
        System.out.println("num1 multiply by 3 = " + num1);  // as same as for modulo and subtract

        System.out.println("------------------------------------------------------------------------------------------");

        // Expression with precedence
        int result = num1 + num2 * 2; // result will be 10 + (3 * 2) = 16
        System.out.println("Result with precedence: " + result);

        // Expression with parentheses
        int controlledResult = (num1 + num2) * 2; // controlledResult will be (10 + 3) * 2 = 26
        System.out.println("Result with parentheses: " + controlledResult);

    }
}
