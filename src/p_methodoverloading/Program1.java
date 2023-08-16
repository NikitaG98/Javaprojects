package p_methodoverloading;

import java.util.Scanner;

public class Program1
{
    public static void main(String[] args) {
        System.out.println("1.\n2.\n3.\n4.\n5.\nEnter choice:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        int a,b;
        float a1,b1;
        long a2,b2;
        double c,d;
        String c1,d1;

        Addition obj= new Addition();
        switch (choice) {
            case 1:
                System.out.println("Enter value:");
                System.out.println("Enter a and b:");
                a = scanner.nextInt();
                b = scanner.nextInt();
                obj.add(a, b);
                break;
            case 2:
                System.out.println("Enter value:");
                System.out.println("Enter a1 and b1:");
                a1 = scanner.nextFloat();
                b1 = scanner.nextFloat();
                obj.add(a1, b1);
                break;
            case 3:
                System.out.println("Enter value:");
                System.out.println("Enter a2 and b2:");
                a2 = scanner.nextLong();
                b2 = scanner.nextLong();
                obj.add(a2, b2);
                break;
            case 4:
                System.out.println("Enter value:");
                System.out.println("Enter c and d:");
                c = scanner.nextDouble();
                d = scanner.nextDouble();
                obj.add(c, d);
                break;
            case 5:
                System.out.println("Enter String:");
                System.out.println("Enter c1 and d1:");
                c1 = scanner.next();
                d1 = scanner.next();
                obj.add(c1, d1);
                break;
            default:
                System.out.println("Invalid choice entered");
                break;
        }
    }
}
