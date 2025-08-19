package src.fundamental.types;

import java.util.Arrays;

public class Lab5_1array {
    public static void main(String[] args) {
        int[] arr = {12,13,2,3,3,1,4,5,25,36};
        System.out.println(Arrays.toString(arr));    // For Printing the String
        Arrays.sort(arr);                           // didn't return anything just Sort the array Internally
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.hashCode(arr));  // return the hashcode of Array reference
        Arrays.fill(arr,3,5,5);   // fill element in a range
        System.out.println(Arrays.toString(arr));


        int[] arr2 = {12,13,2,3,3,1,4,5,25,36};
        int[] arr3 = {12,13,2,3,3,1,4,5,25,36};
        boolean check = (arr2 == arr3);    // this compare the reference of arrays
        System.out.println(check);
        System.out.println(Arrays.equals(arr2,arr3));  // this compare the element length and the elements
    }
}
