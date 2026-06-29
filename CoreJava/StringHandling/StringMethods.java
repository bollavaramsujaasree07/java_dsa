package CoreJava.StringHandling;

import static java.lang.StringUTF16.charAt;

public class StringMethods {
    public static void main (String[] args){
        String s="java";
        System.out.println(s.length());//gives the no of char in the string object.
        System.out.println(s,charAt(2));// gives you the charecrter at that particular indedx
        String w ="";
        System.out.println(w.isEmpty());//checks weather trhe string is empty or not


    }
}
