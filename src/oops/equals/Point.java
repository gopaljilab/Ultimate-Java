package src.oops.equals;

import java.util.Objects;

public class Point {
    private String x;

    public Point(String x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x);
    }
}
