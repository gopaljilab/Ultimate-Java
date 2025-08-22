package src.fundamental.project.mortgage_calc;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalc {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;
    public static double readNumber(String prompt, int min, int max){
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value > min && value <= max)
                break;
            System.out.println("Enter a value of interest rate between "+ min + " - " + max);
        }
        return value;
    }

    public static double calculateBalance(int principal,
                                          float annualInterestRate,
                                          byte years,
                                          short noOfPaymentsMade){
        float monthlyInterest = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);

        double balance = principal
                *(Math.pow(1+monthlyInterest,numberOfPayments) - Math.pow(1+monthlyInterest,noOfPaymentsMade))
                /(Math.pow(1+monthlyInterest,numberOfPayments)-1);
        return balance;
    }

    public static double calculateMortgage(int principal,
                                           float annualInterestRate,
                                           byte years){

        float monthlyInterest = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);
        double mortgage = principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) /
                (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return mortgage;
    }
}
