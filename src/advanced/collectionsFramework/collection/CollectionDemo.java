package src.advanced.collectionsFramework.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
    public static void show(){
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a","b","c");

//        collection.clear();
//        System.out.println(collection.isEmpty());
//        System.out.println(collection.remove("a"));


        System.out.println(collection);

    }
}
