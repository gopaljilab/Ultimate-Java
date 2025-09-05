package src.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TreeVsHashVsLinkedHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        hashMap.put(3, "val3");
        hashMap.put(2, "val2");
        hashMap.put(1, "val1");
        hashMap.put(5, "val5");
        hashMap.put(9, "val9");
        hashMap.put(4, "val2");
        hashMap.put(4, "val2"); // same key
        hashMap.put(7, null); // null value
        hashMap.put(null, "hii"); // null key

        treeMap.put(3, "val3");
        treeMap.put(2, "val2");
        treeMap.put(1, "val1");
        treeMap.put(5, "val5");
        treeMap.put(9, "val9");
        treeMap.put(4, "val2");
        treeMap.put(4, "val2"); //Same key
        treeMap.put(7, null); // null value
        //treeMap.put(null, "hii"); // null key --> not allowed

        linkedHashMap.put(3, "val3");
        linkedHashMap.put(2, "val2");
        linkedHashMap.put(1, "val1");
        linkedHashMap.put(5, "val5");
        linkedHashMap.put(9, "val9");
        linkedHashMap.put(4, "val2");
        linkedHashMap.put(4, "val2"); // same key
        linkedHashMap.put(7, null); // null value
        linkedHashMap.put(null, "hii"); // null key

//        ConcurrentMap<Integer, String> concurrentMap = new ConcurrentHashMap<>();
//        concurrentMap.putAll(linkedHashMap);


        System.out.println("HashMap : " + hashMap);
        System.out.println("TreeMap : " + treeMap);
        System.out.println("LinkedHashMap : " + linkedHashMap);
//        System.out.println("ConcurrentMap : " + concurrentMap);


    }
}
