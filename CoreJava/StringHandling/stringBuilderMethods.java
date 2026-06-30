package CoreJava.StringHandling;

public class stringBuilderMethods {
    public static void main(String[]args){
    StringBuilder sb = new StringBuilder();
    //StringBuilder methods

    //append()
    sb.append("JAVA");
    sb.append(" PROGRAMMING");
    System.out.println(sb);

    //insert()
    sb.insert(4," is ");
    System.out.println(sb);//Adds something at a particular index.

   //delete()
     sb.delete(5,9);
     System.out.println(sb);//Deletes a range of characters.

   //deleteCharAt()
        sb.deleteCharAt(5);
        System.out.println(sb);//deletes the character at that particular given index.

   //replace()
        sb.replace(5,15,"rocks");
        System.out.println(sb);

    //reverse()
        sb.reverse();
        System.out.println(sb);

     //setCharAt(index,char)
        sb.setCharAt(0,'k');
        System.out.println(sb);

     //length()
        sb.length();
        System.out.println(sb);

     //capacity()
        System.out.println(sb.capacity());

    }
}
