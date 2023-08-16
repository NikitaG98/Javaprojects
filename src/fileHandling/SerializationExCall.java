package fileHandling;

import javax.imageio.IIOException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExCall {
    public static void main(String[] args) throws IOException {
        SerializationEx ser=new SerializationEx();
        SerializationEx ser1=new SerializationEx();
        SerializationEx ser2=new SerializationEx();
        ser.position="Java Developer";
        ser.empName="Nikita";
        ser.id=1;
        ser1.position="Data Scientist";
        ser1.empName="Abhi";
        ser1.id=2;
        ser2.position="DevOps Engineer";
        ser2.empName="Anika";
        ser2.id=3;
        FileOutputStream fos=new FileOutputStream("fileSerial.txt");
        ObjectOutputStream ob=new ObjectOutputStream(fos);
        ob.writeObject(ser);
        ob.writeObject(ser1);
        ob.writeObject(ser2);
        ob.close();
        fos.close();
        System.out.println("Data saved in file");
    }

}
