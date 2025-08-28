package src.advanced.lambdas.lambdaEx.builtIn;

import java.util.function.Function;

public class ComposeFunction {
    public static void main(String[] args) {
        Function<Integer, Integer> square = n -> n * n;
        Function<Integer, Integer> doubleIt = n -> n * 2;

        // andThen → square then double
        System.out.println(square.andThen(doubleIt).apply(3)); // (3*3)=9 → (9*2)=18

        // compose → double then square
        System.out.println(square.compose(doubleIt).apply(3)); // (3*2)=6 → (6*6)=36
    }
}
