package fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInoutput
{
    public static void main(String[] args) throws IOException {
        FileOutputStream fout=new FileOutputStream("D:/writableFile.txt");
        String s="HaPpY BIrThDaY";
        byte b[]=s.getBytes();
        fout.write(b);
        System.out.println("Content is added in file");
        FileInputStream fin=new FileInputStream("D:/writableFile.txt");
        System.out.println("File content is");
        int i =fin.read();
        while (i!=-1){
            System.out.print((char)i);
            i=fin.read();
        }



    }
}
