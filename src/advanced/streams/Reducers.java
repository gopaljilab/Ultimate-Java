package src.advanced.streams;

import java.util.Arrays;
import java.util.List;

public class Reducers {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(10, 20, 5, 40, 15);

            int max = numbers.stream()
                    .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);

            System.out.println("Max = " + max);
        }
}
