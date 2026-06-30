package CoreJava.StringHandling;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.length());
        sb.append("Hello");
        System.out.println(sb);
        sb.append(" world!");
        System.out.println(sb);
        //StringBuilder is basically a string which is mutable .
        //while using String when you try to make changes to the object it is not possible.
        //if you want to change anything in String you just have to create a new object and store it again
        //but in StringBuilder you can just directly make changes to the same object.
    }

}