package src.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class MapPerformanceTest {
    public static void main(String[] args) {
        int n = 1_000_000;

        // Test HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            hashMap.put(i, "val" + i);
        }
        long end = System.currentTimeMillis();
        System.out.println("HashMap Insertion Time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            hashMap.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("HashMap Lookup Time: " + (end - start) + " ms");

        System.out.println("-------------------------------------");

        // Test LinkedHashMap
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            linkedHashMap.put(i, "val" + i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedHashMap Insertion Time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            linkedHashMap.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedHashMap Lookup Time: " + (end - start) + " ms");

        System.out.println("-------------------------------------");

        // Test TreeMap
        Map<Integer, String> treeMap = new TreeMap<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            treeMap.put(i, "val" + i);
        }
        end = System.currentTimeMillis();
        System.out.println("TreeMap Insertion Time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            treeMap.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("TreeMap Lookup Time: " + (end - start) + " ms");
    }
}

