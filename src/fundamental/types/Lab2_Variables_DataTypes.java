package src.fundamental.types;

public class Lab2_Variables_DataTypes {
    public static void main(String[] args) {
        int number1 = 20;                //initialization
        int number2 = number1;           //Assigning the value
        System.out.println(number2);
        System.out.println(number1 + " ");  // with the + operator we achieve the concatenation
                                            //where we can add numbers and strings together

        char single_character = 'S';      // we can store a single Character in char data type
                                         // and assign the value in '' single quotes
        System.out.println("Char : " + single_character);
        float float_Value = 0.77F;         // if we don't tell the datatype using casting as F
                                            //because Java take the 0.77 as int .
z
        System.out.println("float-Value : " + float_Value);
        double decimalValue = 8.9799994903;
        System.out.println("Double-Value : " + decimalValue);

        byte byte_value = 127;                  // ranges of num -127 to +127
        System.out.println("byte_value : " + byte_value);

        boolean isEligible = false;          // give us only the true or false like 0 and 1
        System.out.println("Boolean : " + isEligible);
    }
}
