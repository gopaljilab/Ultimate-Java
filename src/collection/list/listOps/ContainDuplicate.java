package src.collection.list.listOps;

import java.util.*;

public class ContainDuplicate {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Alex", "Alice", "Bob", "Charlie");

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String name : names){
            frequencyMap.put(name,frequencyMap.getOrDefault(name,0) + 1);
        }
        System.out.println("Frequencies: " + frequencyMap);

        System.out.println("Duplicates:");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
            }
        }
    }
}
