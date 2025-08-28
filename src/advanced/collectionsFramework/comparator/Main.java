package src.advanced.collectionsFramework.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customers> customersList = new ArrayList<>();
        customersList.add(new Customers("Stephen", "stephen@gmail.com"));
        customersList.add(new Customers("Gopal", "Farzi@gmail.com"));
        customersList.add(new Customers("Joseph", "joseph@gmail.com"));
        Collections.sort(customersList, new EmailComparator() {
        });

        System.out.println(customersList);
    }
}
