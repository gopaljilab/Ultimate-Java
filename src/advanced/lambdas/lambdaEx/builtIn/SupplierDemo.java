package src.advanced.lambdas.lambdaEx.builtIn;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Double> getRandom = () -> Math.random();
        double random = getRandom.get();
        System.out.println(random);
    }
}
