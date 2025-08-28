package src.advanced.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByMethod {
        public static void main(String[] args) {
            List<String> names = Arrays.asList("Ram", "Shyam", "Mohan", "Ravi", "Sita");

            // Group by string length
            Map<Integer, List<String>> grouped =
                    names.stream()
                            .collect(Collectors.groupingBy(String::length));

            System.out.println(grouped);
        }
}
