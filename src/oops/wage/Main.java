package src.oops.wage;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(50_000,200);
//        employee1.setBaseSalary(50_000);          Encapsulation
//        employee1.setHourlyRate(200);
        int wages = employee1.calculateWages(20);
        System.out.println("Total Salary : " + wages);
    }
}
