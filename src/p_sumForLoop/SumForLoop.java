package p_sumForLoop;

import java.util.Scanner;

public class SumForLoop
{
    public static void main(String[] args)
    {
        System.out.println("Enter the Number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum=0;
        for (int i = 1; i <=num ; i++)
        {
             sum = sum+i;
            System.out.println(sum);
        }
    }
}
