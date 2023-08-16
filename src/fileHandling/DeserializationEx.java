package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEx
{
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        FileInputStream fin=new FileInputStream("fileSerial.txt");
        ObjectInputStream oin=new ObjectInputStream(fin);
        SerializationEx s=null;
        SerializationEx s1=null;
        SerializationEx s2=null;
        s=(SerializationEx)oin.readObject();
        s1=(SerializationEx)oin.readObject();
        s2=(SerializationEx)oin.readObject();
        System.out.println(s.id+""+s.empName+""+s.position);
        System.out.println(s1.id+""+s1.empName+""+s1.position);
        System.out.println(s2.id+""+s2.empName+""+s2.position);
        s.display();
        s1.display();
        s2.display();
        oin.close();
        fin.close();
    }
}
