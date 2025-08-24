package src.oops.texCalc;

public class TexCalculator {
    private double taxableIncome;

    public TexCalculator(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double calculateTax(){
        return taxableIncome*0.30;
    }
}
