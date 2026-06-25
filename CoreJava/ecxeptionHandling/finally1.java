package CoreJava.ecxeptionHandling;

public class finally1 {

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
            finally {
                System.out.println("e");
            }
        }
    }
    /*A finally block contains code that should execute whether an exception occurs or not.
        Real-world use

    Suppose you open a file or database connection:

    try {
        // open connection
    }
    finally {
        // close connection
    }*/


