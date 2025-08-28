package src.advanced.lambdas.lambdaEx.builtIn;

import java.util.function.Consumer;

public class ConsumerChaining {
    public static void main(String[] args) {
        Consumer<String> c1 = s -> System.out.println("Hello " + s);
        Consumer<String> c2 = s -> System.out.println("Welcome " + s);

        // Chaining Consumers
//        Consumer<String> combined = c2.andThen(c1);
//        combined.accept("Gopal");

        c2.andThen(c1).accept("Gopal");
    }
}
