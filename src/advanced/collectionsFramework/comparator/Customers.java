package src.advanced.collectionsFramework.comparator;

public class Customers implements Comparable<Customers> {
    private String name;
    private String email;

    public Customers(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public int compareTo(Customers other) {
        // Compare by name alphabetically
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', email='" + email + "'}";
    }
}
