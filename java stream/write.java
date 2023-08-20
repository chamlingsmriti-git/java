import java.io.FileOutputStream;
import java.io.IOException;

public class write {
    public static void main(String[] args) {
        try {
            FileOutputStream outputStream = new FileOutputStream("File.txt");
            outputStream.write(" write the name ".getBytes());
            outputStream.close();
        } catch (IOException e) {

        }
    }
}