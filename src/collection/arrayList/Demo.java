package src.collection.arrayList;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toSet;

public class Demo {
    public static void main(String[] args) {
        Collection<Integer> numbers
                = IntStream.range(0, 10).boxed().collect(toSet());

        Collection<Integer> numbers1
                = IntStream.range(11,20).boxed().collect(toSet());

        List<Integer> list = new ArrayList<>(numbers);
        List<Integer> list2 = new ArrayList<>(numbers1);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.addAll(list2);
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>(
                IntStream.range(0,10)
                        .boxed()
                        .collect(toCollection(ArrayList :: new))
        );

        ListIterator<Integer> listIterator = list1.listIterator(list1.size());
        List<Integer> result = new ArrayList<>(list1.size());
        while (listIterator.hasPrevious()){
            result.add(listIterator.previous());
        }

        List<String> collect = LongStream.range(0, 16)
                .boxed()
                .map(Long::toHexString)
                .collect(toCollection(ArrayList::new));
        List<String> stringsToSearch = new ArrayList<>(collect);
        stringsToSearch.addAll(collect);
        System.out.println(stringsToSearch);

        List<Integer> integerList = new ArrayList<>(Arrays.asList(1,2,4,5,5,6,7,78,8));

        System.out.println(integerList.indexOf(4));
        integerList.removeFirst();
        integerList.removeLast();
        System.out.println(integerList);

        Iterator<Integer> iterator = integerList.iterator();
        /*while (iterator.hasNext()){
            iterator.remove();
        }*/

        //Shuffling a List

        List<String> stringList = Arrays.asList("hello","World", "I", "Am", "Here");
        Collections.shuffle(stringList);
        System.out.println(stringList);


        List<String> students_1 = Arrays.asList("Foo", "Bar", "Baz", "Qux");
        List<String> students_2 = Arrays.asList("Foo", "Bar", "Baz", "Qux");

        int seedValue = 10;

        Collections.shuffle(students_1, new Random(seedValue));
        Collections.shuffle(students_2, new Random(seedValue));

        System.out.println(students_1);
        System.out.println(students_2);

        System.out.println(students_1.equals(students_2));


    }
}
