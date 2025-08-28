package src.advanced.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedMethod {
    public static void main(String[] args) {
        var numbers = Arrays.asList(1,3,6,5,8,2);

        /*var sortedNumbers = numbers.stream()
                .sorted()
                .toList();
        System.out.println(sortedNumbers);*/

        var sortedNumbers = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(sortedNumbers);
    }
}
