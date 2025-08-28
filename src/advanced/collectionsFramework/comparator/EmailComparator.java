package src.advanced.collectionsFramework.comparator;

import java.util.Comparator;

public abstract class EmailComparator implements Comparator<Customers> {

    @Override
    public int compare(Customers o1, Customers o2) {
        return o1.getEmail().compareTo(o2.getEmail());
    }
}
