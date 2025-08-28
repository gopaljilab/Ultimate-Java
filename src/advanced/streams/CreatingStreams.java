package src.advanced.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);

        /// From Collection
        /*list.stream()
                .forEach(System.out::print);

        list.parallelStream()
                .forEach(System.out :: println);*/


        String[] arr = {"Java","Python","C++"};
        /// From Array
        /* Arrays.stream(arr)
                .forEach(System.out :: println);

        Stream.of(arr)
                .forEach(System.out :: println);*/

        /// From Value (Direct Stream)
        /*Stream.of("One","Two", "Three")
                .forEach(System.out :: println);*/

        /// Using Builder
        /*Stream<String> stream = Stream.<String>builder()
                .add("banana")
                .add("mango")
                .add("Apple")
                .build();
        stream.forEach(System.out :: println);*/

        /// Using Infinite Stream
        /*Stream.generate(() -> "Hello")
                .limit(4)
                .forEach(System.out :: println);*/
        //infinite Stram with pattern
        Stream.iterate(1,n -> n + 2)
                .limit(5)
                .forEach(System.out :: println);

    }
}
