package p_add;

import java.util.Scanner;

public class Addition
{
    public static void main(String[] args) {
        int n1,n2,sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n1:");
        n1 = scanner.nextInt();
        System.out.println("Enter n2:");
        n2 = scanner.nextInt();
        sum = n1 + n2;
        System.out.println("Sum is " + sum);
    }
}
