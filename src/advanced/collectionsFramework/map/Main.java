package src.advanced.collectionsFramework.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> integerMap = new HashMap<>();
        integerMap.put(1,"Carlos");
        integerMap.put(3,"James");
        integerMap.put(2,"Rock");
        integerMap.put(0,"Patrick");
        integerMap.put(6,"Carlo");
        integerMap.put(2,"Travis");

        System.out.println(integerMap);
        integerMap.remove(2);
        System.out.println(integerMap);
        integerMap.replace(3,"James","Gopal");
        System.out.println(integerMap);
        System.out.println(integerMap.get(1));
        System.out.println(integerMap.containsKey(2));
        System.out.println(integerMap.keySet());
        System.out.println(integerMap.values());
        System.out.println(integerMap.size());
        integerMap.clear();
        System.out.println(integerMap);
    }
}
