package src.collection.set;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("James");
        treeSet.add("Emelia");
        treeSet.add("Leo");
        treeSet.add("Cairo");
        System.out.println(treeSet);
        System.out.println(treeSet.size());
        System.out.println(treeSet.stream().findFirst());

        System.out.println(treeSet.contains("James"));
        treeSet.remove("Emelia");
        System.out.println(treeSet);

        treeSet.clear();
        System.out.println(treeSet.isEmpty());
    }
}


/**
 *  -- > TreeSet is a Sorted Collection that extends the AbstractSet Class And
 *       implements the NavigableSet interface.
 *  its store unique Elements.
 *  it doesn't preserve the insertion order of the elements.
 *  it's sorts the elements in ascending order.
 *  it's not thread-safe.
 *  Natural ordering
 *
 * -- > primary choice if we want to keep our entries sorted
 * as a TreeSet may be accessed and traversed in either
 * ascending or descending order.
 *
 * ~~~~ We should give preference to a TreeSet if we’re short on memory and if we want to
 * access an elements that are relatively close to each other according to their
 * natural ordering.
 *
 *
 *
 *
 */