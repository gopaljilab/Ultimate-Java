package src.fundamental.types;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Lab3_Strings {
    public static void main(String[] args) throws IOException {
        String message = "Hello Developer";
        System.out.println("String : " + message + "!!");

        System.out.println("Hashcode : " + message.hashCode()); // hashcode of this String "Hello World"
        System.out.println("Indexing of l : " + message.indexOf("l"));  // index of l character
        System.out.println("Check Empty or not? : " + message.isEmpty());  // Check is there any Character or not? and return True or False
        System.out.println("Return the Length of string : " + message.length());     // print length of String
        System.out.println("Return index of l in last: " + message.lastIndexOf("l"));  // return last index of l
        System.out.println("Bytes : " + message.getBytes());   //Strings as byte

        System.out.println("--------------------------------------------------------------------------------------");
        String mail = "GopaljiLab@gmail.com";
        System.out.println(mail);
        System.out.println("Lower Case : " + mail.toLowerCase());
        System.out.println("Upper Case : " + mail.toUpperCase());
        System.out.println("Return char at 6 : " + mail.charAt(6));
        System.out.println(mail.concat(" Yaar tera Khalnayak"));
        System.out.println("---------------------------------------------------------------------------------------");


        String name = "    Tony Stark   ";
        System.out.println(name);
        System.out.println("Remove Spaces : " + name.trim());

        System.out.println("-----------------------------------------------------------------------------------------");

        String str = new String("Hello");
        System.out.println(str);

        char arr[] = {'C','H','A','I','R','S'};
        String str2 = new String(arr,2,4); // form indexing 2 return 3 character
        System.out.println(str2);

        String cityFirstName = "Hydera";
        String cityLastName = "bad";
        System.out.println(cityFirstName.concat(cityLastName));      // concat cityFirstName & LastName
        System.out.println(cityFirstName.replace('a', 'e'));
        String newString = "Hello, Welcome to My Java University";
        char arr2[] = new char[20];
        newString.getChars(7,23,arr2,0);
        System.out.println(arr2);

        System.out.println("-----------------------------------------------------------------------------------------");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name_dijiye = br.readLine();

        System.out.println("Namaste, " + name_dijiye + "! java me apka Swagat hai.");
    }
}
