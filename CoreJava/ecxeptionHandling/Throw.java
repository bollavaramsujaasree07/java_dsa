package CoreJava.ecxeptionHandling;

public class Throw {
    public  static void  main(String[] args){
        try{
            int balance = 1000;
            if(balance > 500){
                throw new ArithmeticException("insuficient balance");
            }
            System.out.println("transaction succesfull");
        }
        catch(ArithmeticException e){
//            System.out.println("insuficient balance");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("fghjs");
        }
    }
}
