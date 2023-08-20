import java.io.*;

public class Student implements Serializable {
    int rno;
    String name;
    String address;

    Student(int rno, String name, String address) {
        this.rno = rno;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(rno + "\t" + name + "\t" + address);
    }
}