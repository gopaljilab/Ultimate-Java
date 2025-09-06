package src.collection.map.employee;

public class Employee {
    private long id ;
    private String name;

    public Employee(long id, String employee) {
        this.id = id;
        this.name = employee;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
