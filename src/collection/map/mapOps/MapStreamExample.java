package src.collection.map.mapOps;

import java.util.*;
import java.util.stream.Stream;

public class MapStreamExample {
    public static void main(String[] args) {
        Map<String, Integer> someMap = new HashMap<>();

        Set<Map.Entry<String, Integer>> entries = someMap.entrySet();
        Set<String> keySet = someMap.keySet();
        Collection<Integer> values = someMap.values();

        Stream<Map.Entry<String, Integer>> entriesStream = entries.stream();
        Stream<Integer> valuesStream = values.stream();
        Stream<String> keysStream = keySet.stream();

        Map<String, String> books = new HashMap<>();
        books.put(
                "978-0201633610", "Design patterns : elements of reusable object-oriented software");
        books.put(
                "978-1617291999", "Java 8 in Action: Lambdas, Streams, and functional-style programming");
        books.put("978-0134685991", "Effective Java");

        Optional<String> optionalIsbn = books.entrySet().stream()
                .filter(e -> "Effective Java".equals(e.getValue()))
                .map(Map.Entry::getKey)
                .findFirst();

        System.out.println(optionalIsbn);

        System.out.println(values);
    }
}
