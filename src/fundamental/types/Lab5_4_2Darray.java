package src.fundamental.types;

import java.util.Scanner;

public class Lab5_4_2Darray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Rows? : ");
        int row = input.nextInt();
        System.out.print("Enter Column? : ");
        int col = input.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter Elements : ");
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                arr[i][j] = input.nextInt();
            }
        }
        print2DArray(arr,row,col);
    }

    private static void print2DArray(int[][] arr,int row, int col){
        System.out.println("Your 2D Array : ");
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
