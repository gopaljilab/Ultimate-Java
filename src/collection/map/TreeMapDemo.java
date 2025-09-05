package src.collection.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "val");
        map.put(2, "val");
        map.put(1, "val");
        map.put(5, "val");
        map.put(9, "val");
        map.put(4, "val");

        System.out.println(map);
        Map<Integer, String> mapCopy = map.reversed();
        System.out.println(mapCopy);

        System.out.println(map.comparator());
    }
}

/**
 * - Having looked at HashMap and LinkedHashMap implementations previously and now TreeMap,
 * it is important to make a brief comparison between the three to guide us on which one fits
 * where.
 * <p>
 * We should use a TreeMap if we want to keep our entries sorted
 * We should use a HashMap if we prioritize performance over memory
 * consumption
 * Since a TreeMap has a more significant locality, we might consider it if we want to access
 * objects that are relatively close to each other according to their natural ordering
 * HashMap can be tuned using the initialCapacity and loadFactor, which isn’t possible for the
 * TreeMap
 * We can use the LinkedHashMap if we want to preserve insertion order while benefiting from
 * constant time access
 *
 */
