package src.fundamental.types;

import java.util.Arrays;
import java.util.Scanner;

public class Lab5_3array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int index = Arrays.binarySearch(arr,6);     // return Searched Element if element doesn't exist return -n
        System.out.println(index);

        /**
         int[] arr2 = new int[6];                    // Input Array Element of size 6
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Element");
        for (int i=0; i< arr2.length; i++){
            arr2[i] = input.nextInt();
        }
        System.out.print("Your array : ");
        System.out.print (Arrays.toString(arr2));
         **/

        int[] ints = {0,2,4,6,8,10};

        int index2 = Arrays.binarySearch(ints, 0, 4, 4);
        System.out.println(index2);
        maxValue(ints);
        minValue(ints);
    }

    private static void maxValue(int[] ints){
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < ints.length; i++){
            if (ints[i] > maxValue){
                maxValue = ints[i];
            }
        }
        System.out.println("Max Value : " + maxValue);
    }

    private static void minValue(int[] ints){
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < ints.length; i++){
            if (ints[i] < minValue){
                minValue = ints[i];
            }
        }
        System.out.println("Min Value : " + minValue);
    }
}
