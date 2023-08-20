import java.io.FileInputStream;
import java.io.IOException;

public class Mainn {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("File.txt");
            int data = inputStream.read();
            while (data != -1) {
                data = inputStream.read();
            }
            inputStream.close();
        } catch (IOException e) {

        }

    }
}
