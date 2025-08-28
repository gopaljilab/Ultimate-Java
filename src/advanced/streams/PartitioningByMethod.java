package src.advanced.streams;

import java.util.*;
import java.util.stream.Collectors;


public class PartitioningByMethod {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

        Map<Boolean, List<Integer>> partitioned =
                numbers.stream()
                        .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(partitioned);
    }
}
