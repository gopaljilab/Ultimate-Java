package src.advanced.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(30);
        nums.add(10);
        nums.add(20);

        Collections.sort(nums); // uses Comparable internally
        System.out.println(nums); // [10, 20, 30]
    }
}
