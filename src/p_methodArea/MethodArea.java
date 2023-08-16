package p_methodArea;

import java.util.Scanner;

public class MethodArea
{
    public double area(double l,double b)
    {
        double area=l*b;
        return area;

    }
    public static void main(String[] args)
    {
        double l,b,area;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter length:");
        l=scanner.nextDouble();
        System.out.println("enter breadth:");
        b=scanner.nextDouble();
        MethodArea area1 = new MethodArea();
        area=area1.area(l,b);
        System.out.println("area is "+ area);


    }
}
