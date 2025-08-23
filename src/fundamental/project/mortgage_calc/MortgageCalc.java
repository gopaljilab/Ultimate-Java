package src.fundamental.project.mortgage_calc;

public class MortgageCalc {
    private final static byte MONTHS_IN_YEAR = 12;
    private static byte PERCENT = 100;

    private int principal;
    private float annualInterestRate;
    private byte years;


    public MortgageCalc(int principal, float annualInterestRate, byte years) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.years = years;
    }

    public double calculateBalance(short noOfPaymentsMade){
        float monthlyInterest = getMonthlyInterest();
        short numberOfPayments = getNumberOfPayments();

        double balance = principal
                *(Math.pow(1+monthlyInterest,numberOfPayments) - Math.pow(1+monthlyInterest,noOfPaymentsMade))
                /(Math.pow(1+monthlyInterest,numberOfPayments)-1);
        return balance;
    }


    public double calculateMortgage(){

        float monthlyInterest = getMonthlyInterest();
        short numberOfPayments = getNumberOfPayments();
        double mortgage = principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) /
                (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return mortgage;
    }

    public double[] getRemainingBalances(){
        double[] balances = new double[getNumberOfPayments()];
        for (short month = 1; month <= balances.length; month++)
            balances[month-1] = calculateBalance(month);

        return balances;
    }

    private float getMonthlyInterest() {
        return annualInterestRate / PERCENT / MONTHS_IN_YEAR;
    }

    private short getNumberOfPayments() {
        return (short) (years * MONTHS_IN_YEAR);
    }
}
