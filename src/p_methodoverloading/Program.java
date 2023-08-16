package p_methodoverloading;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        System.out.println("1.Rectangle\n2.Circle\n3.Triangle\nEnter choice:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        double l,b,r;
        float bs,h;
        Area obj= new Area();
        switch (choice)
        {
            case 1:
                System.out.println("Rectangle");
                System.out.println("Enter l and b:");
                l = scanner.nextDouble();
                b = scanner.nextDouble();
                obj.area(l,b);
                break;
            case 2:
                System.out.println("Cirle");
                r = scanner.nextDouble();
                obj.area(r,r);
                break;
            case 3:
                System.out.println("Triangle");
                bs = scanner.nextFloat();
                h = scanner.nextFloat();
                obj.area(bs,h);
                break;
            default:
                System.out.println("Invalid choice entered");
                break;

        }
    }
}
