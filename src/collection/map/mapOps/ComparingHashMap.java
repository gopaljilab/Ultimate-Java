package src.collection.map.mapOps;

import java.util.Map;

public class ComparingHashMap {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("a", 1, "b",2);
        Map<String, Integer> map2 = Map.of("a", 1, "b",2);

        boolean isEqual = map1.equals(map2);
        System.out.println("Maps are Equal : " + isEqual);

    }
}
