package p_edubridge;

import java.util.Scanner;

public class ReverseNum
{
    public static void main(String[] args) {
        int num,a,b,c,rev=0;
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
