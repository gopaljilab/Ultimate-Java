package src.advanced.lambdas;

interface Greeting {
    void sayHello();
}

public class Demo {
    public static void main(String[] args) {
        // Anonymous Inner Class
        Greeting g = new Greeting() {
            public void sayHello() {
                System.out.println("Hello from Anonymous Inner Class!");
            }
        };
        g.sayHello();
    }
}


