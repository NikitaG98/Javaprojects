package p_myMath;

import java.util.Scanner;

public class MyMath
{
    public void fact()
    {
        int num,fact=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        num=scanner.nextInt();
        for (int i = 1; i <=num ; i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial is " + fact );

    }
    public void reverse()
    {
        int num, rev=0,rem;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        num=scanner.nextInt();
        while (num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("Reverse is " +rev);
    }
    public static void main(String args[])
    {
        MyMath math = new MyMath();
        System.out.println("1.fact\n2.reverse");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        if (choice==1)
        {
            math.fact();
        }else
        {
            math.reverse();

        }
    }
}
