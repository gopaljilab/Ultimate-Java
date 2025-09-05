package src.collection.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> hashset = new HashSet<>();
        hashset.add("Hello");
        hashset.add("Bro");
        hashset.add("Bro");
        hashset.add("Good");
        hashset.add(null);
        hashset.add("Morning");
        System.out.println(hashset);
        System.out.println(hashset.size());

        //contains elements
        System.out.println(hashset.contains("Good"));
        System.out.println(hashset.remove("Bro"));
        System.out.println(hashset);

    }
}


/**
 * it stores unique elements and permits null.
 * Backed By a HashMap.
 * it doesn't maintain insertion order.
 * it's not threadSafe.
 *
 *
 */
