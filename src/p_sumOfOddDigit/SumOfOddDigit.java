package p_sumOfOddDigit;

import java.util.Scanner;

public class SumOfOddDigit
{
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int rem,sum=0;
       // int count=0;
        while (num>0)
        {
            rem=num%10;
            num=num/10;
            if(rem%2==1)
            {
               // count++;
                sum=sum+rem;
               // System.out.println("sum is " + sum);
            }
        }
        System.out.println(sum);
    }
}
