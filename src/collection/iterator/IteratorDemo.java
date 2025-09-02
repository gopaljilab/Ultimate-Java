package src.collection.iterator;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> items = Arrays.asList(1,2,3,4,5);
        Iterator<Integer> iterator = items.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.hashCode());

        Iterator<Integer> iterator1 = Arrays.asList(1, 2, 3).iterator();
        List<Integer> actualList = new ArrayList<>();
        while (iterator1.hasNext()) {
            actualList.add(iterator1.next());
        }
        System.out.println("Collected List: " + actualList); // [1,2,3]
        IteratorDemo.givenList_shouldReturnARandomElement();

    }
    public static void givenList_shouldReturnARandomElement() {
        List<Integer> givenList = Arrays.asList(1, 2, 3);
        Random rand = new Random();
        int randomElement = givenList.get(rand.nextInt(givenList.size()));
        int randomElement2 = givenList.get(
                ThreadLocalRandom.current().nextInt(givenList.size())
        );

        int threadRandom = ThreadLocalRandom.current().nextInt(givenList.size());
        System.out.println(givenList.get(threadRandom));
    }
}
