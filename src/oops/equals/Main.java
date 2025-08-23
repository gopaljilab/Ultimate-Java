package src.oops.equals;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point("Hello");
        Point point2 = new Point("Hello");

        System.out.println(point1 == point2);
        System.out.println(point1.equals(point2));
    }
}
