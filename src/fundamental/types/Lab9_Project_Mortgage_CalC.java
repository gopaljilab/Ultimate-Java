package src.fundamental.types;

import java.text.NumberFormat;
import java.util.Scanner;

public class Lab9_Project_Mortgage_CalC {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal : ");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate : ");
        float annualInterest_rate = scanner.nextFloat();
        float monthlyInterest = annualInterest_rate / MONTHS_IN_YEAR / PERCENT;
        System.out.print("Periods(in Years) : ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage =  principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
