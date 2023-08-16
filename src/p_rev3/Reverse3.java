package p_rev3;

import java.util.Scanner;

public class Reverse3
{
    public static void main(String[] args) {
        int num,a,b,c,rev;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 digit number:");
        num = scanner.nextInt();
        a = num%10;
        b = (num/10)%10;
        c = num/100;
        rev = a*100+b*10+c;
        System.out.println("The reverse number is " +rev);
    }
}
