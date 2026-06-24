package CoreJava.ecxeptionHandling;

public class intro {
    public static void main(String[] args){
      /*  int a = 10;
        int b = 0;
        int c =a/b;
        System.out.println(c);
        output:
        Exception in thread "main" java.lang.ArithmeticException: / by zero
        at CoreJava.ecxeptionHandling.intro.main(intro.java:7)
        Why Exception Handling?

                To handle errors gracefully instead of crashing.
       for example: */
        try{
            int a = 10;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        }
        catch( ArithmeticException e){
            System.out.println("divided by zero is not valid");
        }
    }
}
