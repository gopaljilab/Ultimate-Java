package src.advanced.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MapMethod {
    public static void main(String[] args) {
        var names = Arrays.asList("gopal gupta", "amit kumar", "ravi teja");
        var numbers = Arrays.asList(1,2,4,5,6,7,3);
//        List<String> upperCaseNames = names.stream()
//                .map(String::toUpperCase)  // transform
//                .toList();
//
//        System.out.println(upperCaseNames);


        IntStream lengths = names.stream()
                .mapToInt(String :: length);

        lengths.forEach(System.out :: println);

        /*var words = names.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")));

        words.forEach(System.out :: println);*/

        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("C", "D"),
                Arrays.asList("E", "F")
        );

        List<String> flatList = namesNested.stream()
                .flatMap(List::stream)  // flatten nested list
                .toList();

        System.out.println(flatList);


    }
}
