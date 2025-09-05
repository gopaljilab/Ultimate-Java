package src.collection.conversion;

import java.util.*;

public class LinkedListIntoOthers {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>
                (Arrays.asList("Java", "Python", "C++" , "Java"));
        System.out.println("LinkedList : " + linkedList);
        System.out.println("-------------- Conversion ---------------");


        // LinkedList to ArrayList
        ArrayList<String> arrayList = new ArrayList<>(linkedList);
        System.out.println("Into ArrayList : " + arrayList);

        //LinkedList to Map
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < linkedList.size(); i++) {
            map.put(i , linkedList.get(i));
        }
        System.out.println("Into Map : " + map);

        //LinkedList Into Queue
        Queue<String> queue = new LinkedList<>(linkedList);
        System.out.println("Into Queue : " + queue);

        //LinkedList Into Stack
        Stack<String> stack = new Stack<>();
        stack.addAll(linkedList);
        System.out.println("Into Stack : " + stack);

        //LinkedList Into Set
        Set<String> set = new HashSet<>(linkedList);
        System.out.println("Into Set : " + set);

        //LinkedList into Vector
        Vector<String> vector = new Vector<>(linkedList);
        System.out.println("Into Vector : " + vector);

    }
}
