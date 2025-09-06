package src.collection.map.mapOps;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class MergeTwoMaps {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);

        Map<String, Integer> map2 = new HashMap<>(){{
            put("a", 3);
            put("y", 4);
        }};

        map2.forEach((key, value) ->
                map1.merge(key, value, Integer :: sum)
        );

        System.out.println(map1);

    }
}
