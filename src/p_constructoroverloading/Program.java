package p_constructoroverloading;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double x,y,z;
        x=scanner.nextDouble();
        y=scanner.nextDouble();
        z=scanner.nextDouble();
        Box b1=new Box();
        Box b2=new Box(x);
        Box b3=new Box(x,y,z);

      //  b1.getVolume();
        b2.getVolume();
       // b3.getVolume();
    }
}
