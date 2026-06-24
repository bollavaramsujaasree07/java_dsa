package CoreJava.ecxeptionHandling;

public class ArithmeticEcxeption {
    public static void main(String[] args){
        try {
            int x = 10 / 0;
            System.out.println("X printed");
        }
        catch(ArithmeticException e){
            System.out.println("Can not devide by Zero");
        }
        System.out.println("Program Executed");
    }
}
