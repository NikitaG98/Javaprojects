package p_factorial;

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int fact=1;
        for (int i = 1; i <=num ; i++)
        {
            fact = fact*i;
            System.out.println("Factorial is "+fact);
        }
    }
}
