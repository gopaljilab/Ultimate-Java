package src.advanced.collectionsFramework.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListsDemo {
    public static void show(){
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a","b","c");
        list.add("d");
        list.remove("a");
        list.set(2,"e");
        System.out.println(list.lastIndexOf("c"));
        System.out.println(list.subList(0,1));
        System.out.println(list);
    }
}
