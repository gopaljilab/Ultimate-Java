package src.advanced.collectionsFramework.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show(){
        Queue<String> stringQueue = new ArrayDeque<String>();
        stringQueue.add("c");
        stringQueue.add("a");
        stringQueue.add("b");

        String front = stringQueue.remove();
        System.out.println(front);
        System.out.println(stringQueue);
    }
}
