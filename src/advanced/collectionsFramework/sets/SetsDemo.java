package src.advanced.collectionsFramework.sets;

import java.util.HashSet;
import java.util.Set;

public class SetsDemo {
    public static void show(){
        Set<String> stringSet = new HashSet<>();
        stringSet.add("alex");
        stringSet.add("Stephen");
        stringSet.add("brewbakes");
        stringSet.add("carlos");
        stringSet.add("carlos");
        stringSet.add("emily");
        stringSet.add("peter");

        System.out.println(stringSet);
    }
}
