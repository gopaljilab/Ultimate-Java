package src.collection.stack;

import java.util.*;

public class StackVsArrayDequeBenchmark {
    public static void main(String[] args) {
        int n = 2_000_000; // number of operations

        // Benchmark Stack
        Stack<Integer> stack = new Stack<>();
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }
        for (int i = 0; i < n; i++) {
            stack.pop();
        }
        long end = System.nanoTime();
        System.out.println("Stack time: " + (end - start) / 1_000_000 + " ms");

        // Benchmark ArrayDeque
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            deque.push(i);
        }
        for (int i = 0; i < n; i++) {
            deque.pop();
        }
        end = System.nanoTime();
        System.out.println("ArrayDeque time: " + (end - start) / 1_000_000 + " ms");
    }
}




