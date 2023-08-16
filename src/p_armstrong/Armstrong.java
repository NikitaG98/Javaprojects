package p_armstrong;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num1,sum=0,rem,digit=0;
        num1=num;
        while (num1>0) {
            num1 = num1 / 10;
            digit++;
        }
        while (num1>0)
        {
            rem=num1%10;
            sum=sum+(rem*rem*rem);
            num1=num1/10;
        }
        if (num1==sum)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Its not Armstrong Number");
        }

    }
}
