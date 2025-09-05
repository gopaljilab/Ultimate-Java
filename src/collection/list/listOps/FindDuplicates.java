package src.collection.list.listOps;

import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,2,3,4,2));
        List<Integer> result = FindDuplicates.listDuplicateUsingSet(list);
        System.out.println(result);
    }

    public static List<Integer> listDuplicateUsingSet(List<Integer> list){
        List<Integer> duplicates = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (Integer i : list) {
            if (set.contains(i)){
                duplicates.add(i);
            }else {
                set.add(i);
            }
        }
        return duplicates;
    }
}
