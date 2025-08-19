package src.fundamental.types;

import java.util.Arrays;

public class Lab5_2array {
    public static void main(String[] args) {
        // Notice: size is 9, but we use only first 8 elements
        int[] arr = new int[9];
        arr[0] = 1; arr[1] = 2; arr[2] = 3;
        arr[3] = 4; arr[4] = 5; arr[5] = 6;
        arr[6] = 7; arr[7] = 8;

        int length = 8;   // actual used size
        int position = 5; // index where we want to insert
        int number = 10;

        System.out.println("Before Add : " + Arrays.toString(arr));
        insertElement(arr, number, position, length);
        length++; // now 9 elements
        System.out.println("After Add  : " + Arrays.toString(arr));

        System.out.println("Before Delete : " + Arrays.toString(arr));
        int element = 10;
        deleteElement(arr,element);
        System.out.println("After Delete : " + Arrays.toString(arr));
    }

    private static void insertElement(int[] arr, int number, int position, int length) {
        // Shift elements to the right
        for (int i = length - 1; i >= position; i--) {
            arr[i + 1] = arr[i];
        }
        // Insert new element
        arr[position] = number;
    }


    private static void deleteElement(int[] arr, int element){
        for (int i = 0; i< arr.length; i++){
            if (element == arr[i]){
                for (int j = i; j< arr.length-1; j++){
                    arr[i] = arr[i+1];
                }
                break;
            }
        }
    }

}
