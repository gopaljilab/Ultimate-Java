package src.collection.map.mapOps;

import java.util.Map;

public class IterateOverMap {
    public static void main(String[] args) {
        Map<String, String> map = Map.of("x", "banana", "y","apple");

        //using entry set
        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        //using forEach
        map.forEach((key, value) ->
                System.out.println(key + " -> " + value)
        );
    }
}
