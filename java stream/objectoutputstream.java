import java.io.FileInputStream;
import java.io.ObjectOutputStream;
Person person =new Person("Alice",30);
try(FileoutputStream fos=new FileInputStream("person.bin");
ObjectOutputStream oos=new ObjectOutputStream(fos)){
    oos.writeObject(person);
}