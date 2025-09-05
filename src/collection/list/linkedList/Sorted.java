package src.collection.list.linkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Sorted {
    public static boolean isSorted(List<String> listOfStrings) {
        if (listOfStrings == null || listOfStrings.isEmpty() || listOfStrings.size() == 1) {
            return true;
        }

        Iterator<String> iter = listOfStrings.iterator();
        String previous = iter.next();
        while (iter.hasNext()) {
            String current = iter.next();
            if (previous.compareTo(current) > 0) {
                return false;
            }
            previous = current;
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Ex1", "Ex5", "Ex4"));
        System.out.println(Sorted.isSorted(list));
    }
}
