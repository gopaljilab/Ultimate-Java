package src.fundamental.types;

import java.util.Arrays;

public class Lab4_Escape_Sequences {
    public static void main(String[] args) {
        String message = "Namaste bhailog !";
        System.out.print("\tEnter\n\n");
        System.out.println(message);
        System.out.println("\'Bengaluru\'");
        System.out.println("\"GeeksForGeeks\"");

        System.out.println("windows\\d_drive\\users\\lab\\assignment.pdf");
        System.out.printf("%s Hello bhai log", message);
    }
}
