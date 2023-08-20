import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class IOStreamExample{
    public static void main (String args[]) throws IOException{
        File file=new File("D:/myFile.txt");
        FileReader reader=new FileReader(file);
        char chars[]=new char[(int) file.length()];
        reader.read(chars);
        File out=new File("D:/CopyOfmyFile.txt");
        FileWriter Writer=new FileWriter(out);
        Writer.write(chars);
        Writer.flush();
        System.out.println("Data successfully written in the specified file");
        }
}