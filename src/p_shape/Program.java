package p_shape;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1.Circle\n2.Rectangle");
        int choice= scanner.nextInt();
        double l,b,r;
        switch(choice)
        {
            case 1:
                System.out.println("Enter r:");
                r= scanner.nextDouble();
                Circle circle = new Circle(r);
                circle.area();
                circle.perimeter();
                break;
            case 2:
                System.out.println("Enter l and b:");
                l= scanner.nextDouble();
                b= scanner.nextDouble();
               Rectangle rectangle = new Rectangle(l,b);
               rectangle.area();
               rectangle.perimeter();
               break;
            default:
                System.out.println("Invalid choice entered");
                break;
        }

    }
}
