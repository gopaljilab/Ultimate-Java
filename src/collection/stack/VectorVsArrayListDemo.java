package src.collection.stack;   // notice "statck"

import java.util.ArrayList;
import java.util.Vector;

public class VectorVsArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Vector<Integer> vector = new Vector<>();

        System.out.println("ArrayList growth demo:");
        checkCapacity(arrayList, 20);

        System.out.println("\nVector growth demo:");
        checkCapacity(vector, 20);
    }

    private static void checkCapacity(ArrayList<Integer> list, int limit) {
        int prevCapacity = 0;
        for (int i = 0; i < limit; i++) {
            list.add(i);
            int currentCapacity = list.size(); // can't see internal, so we use size
            if (currentCapacity != prevCapacity) {
                System.out.println("Size: " + list.size());
                prevCapacity = currentCapacity;
            }
        }
    }

    private static void checkCapacity(Vector<Integer> vector, int limit) {
        int prevCapacity = vector.capacity();
        for (int i = 0; i < limit; i++) {
            vector.add(i);
            if (vector.capacity() != prevCapacity) {
                System.out.println("Size: " + vector.size() + ", Capacity: " + vector.capacity());
                prevCapacity = vector.capacity();
            }
        }
    }
}
