package p_positiveNegative;

import java.util.Scanner;

public class PositiveNegative
{
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the Number:");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        if (num>0)
        {
            System.out.println("The Number is Positive.");
        }
        else
        {
            System.out.println("The Number is Negative.");
        }

    }
}
