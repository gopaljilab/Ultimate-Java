package src.advanced.lambdas.lambdaEx;

public class AccessingVar {
    int x = 10;
    static int y = 22;
    void method(){
        int x = 20;
        Runnable runnable = () -> {
            System.out.println("Var of the class = " + this.x + ", Static = " + y);
        };

        Thread t = new Thread(runnable);
        t.start();
    }
    public static void main(String[] args) {
        AccessingVar obj = new AccessingVar();
        obj.method();
    }
}
