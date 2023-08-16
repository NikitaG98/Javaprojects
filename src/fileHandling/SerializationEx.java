package fileHandling;

import java.io.Serializable;

public class SerializationEx implements Serializable
{
    int id;
    String empName,position;
    public void display(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+empName);
        System.out.println("Degree: "+position);
    }
}
