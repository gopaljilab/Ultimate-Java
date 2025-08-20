package src.fundamental.types;

import java.text.NumberFormat;
import java.util.Scanner;

public class Lab9_Project_Mortgage_CalC {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);

        int principal;
        float annualInterestRate;
        byte years;

        // --- Principal Validation ---
        while (true) {
            System.out.print("Principal (₹1000 - ₹10,00,000) : ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 10_00_000)
                break;
            System.out.println("Enter a principal between ₹1000 - ₹10,00,000");
        }

        // --- Interest Rate Validation ---
        while (true) {
            System.out.print("Annual Interest Rate (0 - 20%) : ");
            annualInterestRate = scanner.nextFloat();
            if (annualInterestRate > 0 && annualInterestRate <= 20)
                break;
            System.out.println("Enter a valid interest rate (0 - 20%)");
        }

        // --- Years Validation ---
        while (true) {
            System.out.print("Period (in Years, 1 - 50): ");
            years = scanner.nextByte();
            if (years > 0 && years <= 50)
                break;
            System.out.println("Enter years between 1 - 50");
        }

        // --- Mortgage Calculation ---
        float monthlyInterest = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) /
                (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

        scanner.close();
    }
}
