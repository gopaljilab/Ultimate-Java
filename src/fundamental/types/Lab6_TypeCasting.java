package src.fundamental.types;

public class Lab6_TypeCasting {
    public static void main(String[] args) {
        byte age = 17;
        int myAge = age;           // Implicit Type Casting

        System.out.println("------------------------------------- Implicit Type Casting -------------------------------------");
        System.out.println("Age : " + age);
        System.out.println("myAge : " + myAge);

        int myInt = 1105;
        byte myByte = (byte) myInt;    // Explicit Type Casting

        System.out.println("------------------------------------- Explicit Type Casting -------------------------------------");
        System.out.println("myNum : " + myInt);
        System.out.println("myByte : " + myByte);

        int maxScore = 500;
        int userScore = 423;

        System.out.println("Max Score : " + maxScore);
        System.out.println("User Score : " + userScore);
        float percentage = ((float) userScore /maxScore)*100.0f;
        System.out.println("Percentage of User W.R.T. Max Score : " + percentage);

        double i = 100.245;

        // Narrowing Type Casting
        short j = (short)i;
        int k = (int)i;

        System.out.println(i);

        Animal animal = new Animal();   // Explicit Upcasting
        animal.makeSound();

        Object obj = "hello";         // A String stored in an Object

        String s = (String) obj;      // Valid cast, no error

//        Integer num = (Integer) obj;  ---- > throw Runtime Exception ClassCastException
    }
}

class Animal {
    public void makeSound()
    {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    public void makeSound()
    {
        System.out.println("The dog barks");
    }

    public void fetch()
    {
        System.out.println("The dog fetches a ball");
    }
}
