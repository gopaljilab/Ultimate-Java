package src.fundamental.controlFlow;

public class Lab2_2Loops {
    public static void main(String[] args) {
        for (int i=0; i < 10; i++){
            if (i==5)
                continue;    // to moves the control at the beginning of the loop
            System.out.print(i + " ");
            if (i==8)
                break;   // when the  i == 8 then break the loop instead of if
        }
        System.out.println();
        System.out.println("----------------------------------------- While Loop ---------------------------------------------");

        int date = 10;

        while (date <= 16) {   // keep looping until date reaches 16
            if (date == 16){
                System.out.println("Happy BirthDay");
                break;
            }
            date++;
        }

        do {
            System.out.println("Happy BirthDay");   // first print
            break;              // break the loop
        } while (date <= 16);


    }
}
