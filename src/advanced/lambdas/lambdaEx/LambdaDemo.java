package src.advanced.lambdas.lambdaEx;

public class LambdaDemo {
    interface MyInter{
        double squareRoot(double num);
    }

    public static void main(String[] args) {
        MyInter myInter = (double num) -> {
            return Math.sqrt(num);
        };

        System.out.println("Square Root of " + myInter.squareRoot(256));
    }
}
