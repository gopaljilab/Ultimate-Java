package src.advanced.streams;

import java.util.Arrays;
import java.util.List;

public class PeekMethod {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("gopal", "amit", "ravi");

        List<String> result = names.stream()
                .peek(n -> System.out.println("Before map: " + n)) // peek
                .map(String::toUpperCase)
                .peek(n -> System.out.println("After map: " + n)) // peek
                .toList();

        System.out.println("Final List: " + result);
    }
}
