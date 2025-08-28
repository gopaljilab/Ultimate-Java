package src.advanced.collectionsFramework.sets;

import java.util.HashSet;
import java.util.Iterator;

public class HS {
    public static void main(String[] args) {
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("india");
        stringHashSet.add("China");
        stringHashSet.add("korea");
        stringHashSet.add("Oman");
        stringHashSet.add("Russia");

        System.out.println(stringHashSet);
        Iterator iterator = stringHashSet.iterator();

        System.out.println("Elements using Iterator : ");
        while (iterator.hasNext()){
            String s = (String) iterator.next();
            System.out.println(s);
        }
    }
}
