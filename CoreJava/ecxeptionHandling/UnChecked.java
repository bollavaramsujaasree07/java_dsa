package CoreJava.ecxeptionHandling;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class UnChecked {
    public static void main(String[] args){
        try {
            FileReader fr =new FileReader("CoreJava/two.txt");
            System.out.println(fr);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
