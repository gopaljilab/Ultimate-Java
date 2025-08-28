package src.advanced.streams;


import java.util.Arrays;

public class FilterMethod {
    public static void main(String[] args) {
        var names = Arrays.asList("gopal","arun","arif", "loki");

        var aNames = names.stream()
                .filter(name -> name.startsWith("a"))
                .toList();
        System.out.println(aNames);

        var numbers = Arrays.asList(1,2,3,4,5,7,6);
        var result = numbers.stream()
                .takeWhile(n -> n < 4)
                .toList();
        System.out.println(result);
    }
}
