import java.io.FileInputStream;
import java.io.ObjectOutputStream;
Person person;
try(FileInputStream fis=new FileInputStream("person.bin"));
ObjectOutputStream ois=new ObjectOutputStream(fis)){
    person=(Person) ois.readObject();
}