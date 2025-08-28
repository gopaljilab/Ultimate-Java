package src.advanced.lambdas.lambdaEx;

// Functional Interface
interface Greeting {
    void sayHello(String name);
}

public class Demo {
    public static void main(String[] args) {
        Greeting g = (name) -> System.out.println("Hello " + name);
        g.sayHello("Gopal");
    }
}

