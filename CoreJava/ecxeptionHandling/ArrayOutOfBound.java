package CoreJava.ecxeptionHandling;

public class ArrayOutOfBound {
    public static void main( String[] args){
        try{
            System.out.println("a");
            int[] arr = new int[3];

            System.out.println(arr[2]);
            System.out.println(arr[4]);

            System.out.println("b");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("c");
        }
        catch(ArithmeticException e){
            System.out.println("d");
        }
        System.out.println("e");
    }
}
