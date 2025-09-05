package src.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Mango");
        map.put(2, "Litchi");
        map.put(3, "Papaya");
        map.put(4, "Papaya");
        map.put(5,null);

        System.out.println("Before Remove : "+map);
        map.remove(5);
        System.out.println("After Remove : " + map);

        System.out.println("Exist 3 : " + map.containsKey(3));
        System.out.println(map.size());

        System.out.println("Print All Element : ");
        for (int fruit : map.keySet()){
            System.out.println(map.get(fruit));
        }

        String[] newFruit = {"Orange", "Coconut"};
        for (int i = 0; i < newFruit.length; i++) {
            map.put(i,newFruit[i]);
        }
        System.out.println(map);

        /*map.clear();
        System.out.println(map);*/

        System.out.println(map.get(1));
    }
}

/**
 * -------------------------> MAP <--------------------------------------
 * Map is a key-value Mapping. which means that every key is mapped to exactly one value
 * and that we can use the key to retrieve the corresponding value in the map.
 *
 * ops ---->
 * - retrieve the value from the map by its key.
 * - allows us to have the null value as a key.
 * - insert the same object twice with different keys.
 * -iterate the elements by for-each loop.
 *
 *
 */
