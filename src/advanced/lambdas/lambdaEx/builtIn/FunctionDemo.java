package src.advanced.lambdas.lambdaEx.builtIn;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, Integer> map = str -> str.length();
        int length = map.apply("Sky");
        System.out.println(length);
    }
}
