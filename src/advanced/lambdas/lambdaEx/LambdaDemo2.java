package src.advanced.lambdas.lambdaEx;

public class LambdaDemo2 {
    interface MyInter{
        void add (int a, int b);
    }

    public static void main(String[] args) {
        MyInter myInter = (int a, int b) -> {
            System.out.println("Sum = " + (a+b));
        };
        myInter.add(10,20);
    }
}
