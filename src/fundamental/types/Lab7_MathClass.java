package src.fundamental.types;

public class Lab7_MathClass {
    public static void main(String[] args) {
        int i = 7;
        int j = -9;
        double x = 72.3;
        double y = 0.34;

        System.out.println("i is " + i);
        System.out.println("j is " + j);
        System.out.println("x is " + x);
        System.out.println("y is " + y);

        System.out.println("Max(1,2) : " + Math.max(1,2)); // return max value
        System.out.println("Min(25,65) : " + Math.min(25,65));  // return min value

        System.out.println("|" + i + "| is : " + Math.abs(i));  //return the mod
        System.out.println("|" + j + "| is : " + Math.abs(j));  // return the mod

        System.out.println(x + " is approximately " + Math.round(x));
        System.out.println(y + " is approximately " + Math.round(y));

        System.out.println("The Ceil of "+ x + " is : " + Math.ceil(x));
        System.out.println("The Ceil of "+ y + " is : " + Math.ceil(y));

        System.out.println("The floor of "+ x + " is : " + Math.floor(x));
        System.out.println("The floor of "+ y + " is : " + Math.floor(y));

        System.out.println("PI is : " + Math.PI);
        System.out.println("e is : " + Math.ceil(x));

        double angle = 45.0 * 2.0 * Math.PI / 360.0;
        System.out.println("cos(" + angle + ") is " + Math.cos(angle));
        System.out.println("sin(" + angle + ") is " + Math.sin(angle));

        // logarithm (base e) of a.
        System.out.println("log(1.0) is " + Math.log(1.0));
        System.out.println("log(10.0) is " + Math.log(10.0));
        System.out.println("log(Math.E) is " + Math.log(Math.E));

        System.out.println("Here's one random number: " + Math.random()*100);
    }
}
