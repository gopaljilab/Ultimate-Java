package src.oops.taxCalc;

public class Main {
    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator2018(100_000);
        TaxReport report = new TaxReport();
        report.show(calculator);
        report.show(new TaxCalculator2019());
    }
}