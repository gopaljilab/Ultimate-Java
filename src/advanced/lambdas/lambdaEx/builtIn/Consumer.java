package src.advanced.lambdas.lambdaEx.builtIn;

import java.util.function.Consumer;

class ConsumerDemo {
    public static void main(String[] args) {
        // Consumer Example
        Consumer<String> printer = s -> System.out.println("Hello " + s);

        printer.accept("Gopal"); // Output: Hello Gopal
    }
}
