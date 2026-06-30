package CoreJava.StringHandling;

//import static java.lang.StringUTF16.charAt;

public class StringMethods {
    public static void main (String[] args){
        //length()
        String s="java";
        System.out.println(s.length());//gives the no of char in the string object.
        //System.out.println(s,charAt(2));// gives you the character at that particular index
        //isEmpty()
        String w ="";
        System.out.println(w.isEmpty());//checks weather true string is empty or not
        //substring()
        String A ="Programming";
        System.out.println(A.substring(4));//Prints the character from the index 4 and till the last index number/
        String B = "Programming in java";
        System.out.println(B.substring(3,10));//Prints the Characters from index no 3 to 9 and excludes the char at 10;
        //equals()
        String C = "java";
        String D = "java";
        System.out.println(C.equals(D));
        //equalsIgnoreCase()
        String E = "JAVA";
        System.out.println(C.equalsIgnoreCase(E));
        //compareTo()
        System.out.println("Ant".compareTo("Bat"));//It compares alphabetically (lexicographical order).//gives -1
        System.out.println("Dog".compareTo("Bat"));//this give positive 2
        System.out.println("Dog".compareTo("Cat"));//this gives Positive 1
        System.out.println("Java".compareTo("Java"));//this gives 0
        System.out.println("Sujji".compareTo("Suja"));//goes for the next charecter when checking.//gives 9 cause order difference between j and a is 9
        //contains()
        String F = "Java Programming";
        String J = "Programming";
        System.out.println(F.contains(J));
        System.out.println(E.contains(J));
        //startsWith()
        String G = "Java";
        System.out.println(F.startsWith(G));
        //endsWith()
        System.out.println(F.endsWith(J));
        //indexOf()
        System.out.println(G.indexOf("v"));
        System.out.println(G.indexOf("s")); //gives -1 for the characters that are not present in String object
        //lastIndexOf()
        System.out.println(G.lastIndexOf("a"));
        //toUpperCase()
        System.out.println(F.toUpperCase());//displays every character to upper case.
        //toLowerCase()
        System.out.println(F.toLowerCase());//displays every character to lower case.
        //trim()
        String H =" J ava ";
        System.out.println(H.trim());//this method removes the space around the string object but doesnt touch the spaces in between.
        //replace()
        System.out.println(G.replace("a","x")); //replaces a with the char x
        //split()
        String I = "Sujji,suja,sree";
        String[] arr = I.split(",");
        for(int i=0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
