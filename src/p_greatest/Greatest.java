package p_greatest;

import java.util.Scanner;

public class Greatest
{
    public int getGreatest(int a,int b,int c) {


        int large=c>(a>b?a:b)?c:((a>b)?a:b);
        return large;

    }
    public static void main(String[] args)
    {

        int large;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = scanner.nextInt();
        System.out.println("Enter b:");
        int b=scanner.nextInt();
        System.out.println("Enter c:");
        int c=scanner.nextInt();

        Greatest large1=new Greatest();
        large=large1.getGreatest(a,b,c);
        System.out.println("Greatest number is " +large);

    }
}
