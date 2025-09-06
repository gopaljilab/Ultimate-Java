package src.collection.map.employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static Map<String, Employee> map1 = new HashMap<>();
    private static Map<String, Employee> map2 = new HashMap<>();

    public static void main(String[] args) {
        Employee employee1 = new Employee(1L, "Henry");
        map1.put(employee1.getName(), employee1);
        Employee employee2 = new Employee(22L, "Annie");
        map1.put(employee2.getName(), employee2);
        Employee employee3 = new Employee(8L, "John");
        map1.put(employee3.getName(), employee3);

        Employee employee4 = new Employee(2L, "George");
        map2.put(employee4.getName(), employee4);
        Employee employee5 = new Employee(3L, "Henry");
        map2.put(employee5.getName(), employee5);

        // Create a copy of map1
        Map<String, Employee> map3 = new HashMap<>(map1);

        // Merge map2 into map3
        map2.forEach((key, value) ->
                map3.merge(key, value,
                        (v1, v2) -> new Employee(v1.getId(), v2.getName())
                )
        );

        // Print result
        map3.forEach((k, v) ->
                System.out.println(k + " -> " + v.getId() + ", " + v.getName())
        );

        System.out.println("---------------------------------------------------");

        Stream<Map.Entry<String, Employee>> combined =
                Stream.concat(map1.entrySet().stream(), map2.entrySet().stream());

        Map<String, Employee> result = combined.collect(
                Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> new Employee(v1.getId(), v2.getName())
                )
        );

        result.forEach((k, v) ->
                System.out.println(k + " -> " + v.getId() + ", " + v.getName())
        );

        System.out.println("-------------------------------------------------");
        SortedSet<Employee> values = new TreeSet<>(result.values());


    }
}
