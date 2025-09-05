package src.collection.map;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        Hashtable<Integer, String> hashtable1 = new Hashtable<>();
        hashtable.put(1,"Hello");
        hashtable1.put(1,"Hello");
        System.out.println(hashtable.hashCode());
        System.out.println(hashtable1.hashCode());
    }
}
