package src.collection.conversion;

import java.util.*;

public class ArrayListIntoOthers {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Banana", "Apple", "Mango"));
        System.out.println("ArrayList : " + arrayList);

        /* ArrayList into LinkedList
        using constructor*/
        LinkedList<String> linkedList = new LinkedList<>(arrayList);

        System.out.println("Into LinkedList : "+linkedList);

        /** using add all
        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.addAll(arrayList);
        System.out.println("ArrayList : " + arrayList);
        System.out.println("LinkedList : " + linkedList1);
        */

        // ArrayList Into Map
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < arrayList.size(); i++) {
            map.put(i,arrayList.get(i));
        }

        System.out.println("Into Map : " + map);

        //ArrayList Into Queue
        Queue<String> queue = new LinkedList<>(arrayList);
        System.out.println("Into Queue : " + queue);
        /*queue.offer("Litchi");
        System.out.println("" + queue);
        queue.poll();
        System.out.println(queue);*/

        //ArrayList Into Stack
        Stack<String> stack = new Stack<>();
        stack.addAll(arrayList);
        System.out.println("Into Stack : " + stack);
        /*stack.push("litchi");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);*/

        //ArrayList Into Set
        Set<String> set = new HashSet<>(arrayList);
        System.out.println("Into Set : " + set);


    }
}
