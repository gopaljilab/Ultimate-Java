package src.advanced.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

public class Collectors{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("gopal", "amit", "ravi", "amit");

        // Collect to List
        List<String> list = names.stream()
                .toList();
        System.out.println("List: " + list);

        // Collect to Set (removes duplicates)
        Set<String> result = list.stream()
                .collect(toSet());
        System.out.println("Set: " + result);
    }
}
