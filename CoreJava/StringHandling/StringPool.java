package CoreJava.StringHandling;

public class StringPool {
    public static void main(String[] args){
        String s1 = "Java";
        String s2 = "Java";
        String s3 = "Java";
        //this is called string pooling giving same values to
        //the different objects make java store the value by fixing the reference same.
        //it creates only one object aND LET EVERY ONE SHARE IT.
        String s4 = "Java";
        String s5 = new String("Java");
        //here s4 will be saved in the pool but s5 will be saved in the heap
        //new String("Java") always creates a new object on the heap.
    }
}
