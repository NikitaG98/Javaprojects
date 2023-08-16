package p_fibonacheSeries;

import java.util.Scanner;

public class FibonacheSeries
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number of elements:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int fibo=1;
        int n1=0;
        int n2=1;
        int nextnum;
       // int i;

        System.out.println(n1);
        System.out.println(n2);
        for (int i = 2; i <=num ; ++i)
        {
            nextnum= n1+n2;
            fibo=n1;
            n1=n2;
            n2=nextnum;
            System.out.println(nextnum);
         //   }
        }

    }
}
