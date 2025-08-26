package src.advanced.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box <Integer> integerBox = new Box<>();
        integerBox.setValue(10);          //autoBoxing
        System.out.println(integerBox.getValue());   // Unboxing


        Box <String> stringBox = new Box<>();
        stringBox.setValue("Hello");
        System.out.println(stringBox.getValue());

        //Constraints on Number class
        Calculator <Double> integerCalculator = new Calculator<>();
        System.out.println(integerCalculator.square(20.2));


        GenericList<Integer> genericList = new GenericList<>();

    }
}
