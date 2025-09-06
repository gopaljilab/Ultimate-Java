package src.collection.map.mapOps;

import java.util.*;

public class MapOPs {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key1", "value2");
        map.put("key1", "value2");
        System.out.println(map.get("key1"));
        System.out.println(map.get("key1"));
        System.out.println(map);

        Map<String, String> asiaCapital1 = new HashMap<String, String>();
        asiaCapital1.put("Japan", "Tokyo");
        asiaCapital1.put("South Korea", "Seoul");

        Map<String, String> asiaCapital2 = new HashMap<String, String>();
        asiaCapital2.put("South Korea", "Seoul");
        asiaCapital2.put("Japan", "Tokyo");

        Map<String, String> asiaCapital3 = new HashMap<String, String>();
        asiaCapital3.put("Japan", "Tokyo");
        asiaCapital3.put("China", "Beijing");
        System.out.println(asiaCapital1);
        System.out.println(asiaCapital2);

        System.out.println(asiaCapital1.hashCode());
        System.out.println(asiaCapital2.hashCode());

        System.out.println(asiaCapital1.keySet().equals(asiaCapital2.keySet()));
        System.out.println(articleMapOne);
        System.out.println(createSingletonMap());

        Map<String, String> emptyMap = Map.of();
        Map<String, String> singletonMap = Map.of("key1", "value");
        Map<String, String> stringMap = Map.of("key1","value1", "key2", "value2");
        System.out.println(stringMap);


        /// How to Store Duplicate Keys in a Map in Java?
        Map<String, List<String>> listMap = new HashMap<>();
        listMap.computeIfAbsent("Key1" , k -> new ArrayList<>()).add("value1");
        listMap.computeIfAbsent("Key2" , k -> new ArrayList<>()).add("value2");
        System.out.println(listMap);
    }
    public static Map<String, String> articleMapOne;
    static {
        articleMapOne = new HashMap<>();
        articleMapOne.put("ar01", "Intro to Map");
        articleMapOne.put("ar02", "Some article");

    }

    public static Map<String, String> createSingletonMap() {
        return Collections.singletonMap("username1", "password1");
    }
}
