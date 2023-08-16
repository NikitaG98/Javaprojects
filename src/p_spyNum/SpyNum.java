package p_spyNum;

import java.util.Scanner;

public class SpyNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = scanner.nextInt();
        int sum=0,product=1,rem;
        while (num>0)
        {
            rem = num % 10;
            sum = sum + rem;
            product = product * rem;
            num = num / 10;
        }
            System.out.println("Sum of digit= " + sum);
            System.out.println("Product of digit= " + product);

        if (sum==product)
        {
            System.out.println("Number is Spy");
        }else
        {
            System.out.println("Number is not Spy");
        }

    }
}
