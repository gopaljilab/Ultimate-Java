package src.fundamental.project.mortgage_calc;

import java.text.NumberFormat;

import static src.fundamental.project.mortgage_calc.MortgageCalc.MONTHS_IN_YEAR;
import static src.fundamental.project.mortgage_calc.MortgageCalc.readNumber;
import static src.fundamental.project.mortgage_calc.MortgageCalc.calculateBalance;

public class Test {
    public static void main(String[] args) {

        int principal = (int)readNumber("Principal : ",1000,10_000_000);
        float annualInterestRate = (float)readNumber("Annual Interest Rate : ",1,20);
        byte years = (byte)readNumber("Period (Years) : ", 1,30);

        printMortgage(principal, annualInterestRate, years);
        printPaymentSchedule(years, principal, annualInterestRate);
    }

    private static void printMortgage(int principal, float annualInterestRate, byte years) {
        double mortgage = MortgageCalc.calculateMortgage(principal, annualInterestRate, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    private static void printPaymentSchedule(byte years, int principal, float annualInterestRate) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        MortgageCalc mc = new MortgageCalc();
        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++){
            double balance = calculateBalance(principal, annualInterestRate, years,month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
