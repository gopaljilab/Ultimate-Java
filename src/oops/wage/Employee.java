package src.oops.wage;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary, int hourlyRate){          // Custom Constructor
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate can't be 0 or less 1");
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Base Salary can't be 0 or less 1");
    }

    public int calculateWages(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }
}
