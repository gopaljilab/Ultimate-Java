package src.fundamental.project.mortgage_calc;

public class Main {
    public static void main(String[] args) {

        int principal = (int) Console.readNumber("Principal : ",1000,10_000_000);
        float annualInterestRate = (float) Console.readNumber("Annual Interest Rate : ",1,20);
        byte years = (byte) Console.readNumber("Period (Years) : ", 1,30);

        MortgageCalc calculator = new MortgageCalc(principal,annualInterestRate,years);
        MortgageReport report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();
    }
}
