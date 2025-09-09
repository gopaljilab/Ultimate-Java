package src.collection.queue.arrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("1");
        stack.push("2");
        stack.pop();
        System.out.println(stack);

        Deque<String> queue = new ArrayDeque<>();
        queue.offer("first");
        queue.offer("second");

        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
    }
}



/**
 * It’s not thread-safe
 * Null elements are not accepted
 * Works significantly faster than the synchronized Stack
 * It is a faster queue than LinkedList due to the better locality of reference
 * Most operations have amortized constant time complexity
 * An Iterator returned by an ArrayDeque is fail-fast
 * ArrayDeque automatically doubles the size of an array when the
 *       head and tail pointer meets each other while adding an element
 */
