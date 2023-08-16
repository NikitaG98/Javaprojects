package p_area;

import java.util.Scanner;

public class Area
{
    public static void main(String[] args) {
        float l,b,area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of Length:" );
        l = scanner.nextFloat();
        System.out.println("Enter the value of Breadth:");
        b = scanner.nextFloat();
        area = l*b;
        System.out.println("area is " + area);
    }
}
