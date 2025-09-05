package src.collection.list.listOps;

import java.util.*;

public class Ops {
    public static void main(String[] args) {
        List<Integer> source = Arrays.asList(1,2,3,4);
        List<Integer> dest = new ArrayList<>(Arrays.asList(5,6,7,8));

        List<Integer> copy = List.copyOf(source) ;
        dest.remove(1);
        System.out.println(dest);

        List<String> countries = Arrays.asList("Germany", "Panama", "Australia");
        List<String> countries2 = Arrays.asList("India", "Nepal", "Japan" , "Germany", "Australia");
        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
        System.out.println("---------------------------------------------");
        for (String country : countries){
            System.out.println(country);
        }
        System.out.println("----------------------------------------------");
        Iterator<String> iterator = countries.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        List<String> intersection = new ArrayList<>(countries);
        intersection.retainAll(countries2);
        System.out.println(intersection);

        List<String> differences = new ArrayList<>(countries);
        boolean check = differences.removeAll(countries2);
        System.out.println(check);
    }
}
