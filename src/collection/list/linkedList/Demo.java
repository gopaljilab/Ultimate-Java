package src.collection.list.linkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**Introduction :
 LinkedList is a double-LinkedList implementation of List and Deque.
 It's not Synchronized.
 it's store -> ordered, duplicate and null elements.
 Nodes is a reference of next and the previous one.

 Comparison With ArrayList :

 Structure :
 ArrayList (Index based):
 it's provide random access to its element. O(1)
 LinkedList (data as list of elements) :
 every element is linked to its previous and nex element. O(n).

 so here ArrayList is best in terms of Access.

 Operations :
 insertion, addition, and removal is faster in LinkedList because there is no
 need to resize an array or update an index when the element is added to some
 arbitrary position inside collection.

 Memory Usage :
 Every nodes in LinedList store two references.
 So LinkedList Consumes More Memory then Array List.

 Different Methods to Initialize a LinkedList:
 We can initialize a LinkedList using one of two constructor.
 Further, we use constructors to initialize new instances of a class.

 Initializing an empty LinkedList.
 Initialize the empty linkedlist using LinkedList() Constructor.*/

public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.linkedListDemo();
    }



    public void linkedListDemo() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(3);

        arrayList.add(Integer.valueOf(1));
        arrayList.add(Integer.valueOf(2));
        arrayList.add(Integer.valueOf(3));

        LinkedList<Integer> stringLinkedList = new LinkedList<Integer>(arrayList);
        System.out.println(stringLinkedList);
        /*stringLinkedList.addFirst(1);
        stringLinkedList.add(2);
        stringLinkedList.add(3);
        System.out.println(stringLinkedList);*/


        stringLinkedList.addFirst(9);
        stringLinkedList.addLast(10);
        System.out.println(stringLinkedList);

        //Converting Array into LinkedList
        String[] fruits = {"Apple", "Cherry", "Orange", "Papaya"};

        List<String> list = Arrays.asList(fruits);

        LinkedList<String> strings = new LinkedList<>(list);
        System.out.println(strings);


    }
}
