package src.fundamental.types;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class Lab8_Formatting_Number {
    public static void main(String[] args) {
        double d = 123456.789;
        NumberFormat nf
                = NumberFormat.getInstance(Locale.TAIWAN);
        System.out.println("ITALY representation of " + d + " : "+ nf.getCurrency());

        double percentage = 0.75;
        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        String formattedPercent = percentFormat.format(percentage); // "75%"
        System.out.println(formattedPercent);

        double rawValue = 4.2352989244d;
        BigDecimal bd = new BigDecimal(rawValue);
        bd = bd.setScale(2, RoundingMode.HALF_UP); // Round to 2 decimal places, half up
        double roundedValue = bd.doubleValue(); // 4.24
        System.out.print(roundedValue);
    }
}
