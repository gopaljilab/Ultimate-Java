package src.collection.map.mapOps;

import java.util.*;

public class InitHashMap {
    public static void main(String[] args) {
        // Traditional
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);

        // Using initializer block
        Map<String, Integer> map2 = new HashMap<>() {{
            put("x", 10);
            put("y", 20);
        }};

        // Java 9+
        Map<String, Integer> map3 = Map.of("key1", 100,
                                            "key2", 200);

        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map3);
    }
}

