package src.fundamental.controlFlow;

public class Lab2_1IfElseStatement {
    public static void main(String[] args) {
        int age = 14;
        if (age < 5){
            System.out.println("Child");
        }
        else if (age >= 5 && age < 18){
            System.out.println("Teenager");
        }
        else if(age>=18 && age < 40){
            System.out.println("Adult");
        }else {
            System.out.println("Old");
        }


        int checkAge = 28;

        System.out.println(checkAge<30 ? "Young" : "Old");    // check the condition if its
                                                            // true return Young then false

//        switch ()  --- > to execute diff part of code we use the Switch Statement
    }
}
