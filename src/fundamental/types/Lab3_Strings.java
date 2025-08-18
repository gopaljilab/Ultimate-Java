package src.fundamental.types;

public class Lab3_Strings {
    public static void main(String[] args) {
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

    }
}
