package src.collection.map.mapOps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMap {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("a",3, "c", 1, "b",2);

        // Sort BY Key
        Map<String, Integer> sortedByKey = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry :: getKey,
                        Map.Entry :: getValue,
                        (e1,e2) -> e1,
                        LinkedHashMap::new
                ));
        System.out.println(sortedByKey);

        // Sort by value
        Map<String, Integer>  sortedByValue = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry :: getKey,
                        Map.Entry :: getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap :: new
                ));
        System.out.println(sortedByValue);

    }
}
