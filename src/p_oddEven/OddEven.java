package p_oddEven;

import java.util.Scanner;
public class OddEven
{
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the Number:");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        if (num%2==0)
        {
            System.out.println("The Number is Even");
        }
        else
        {
            System.out.println("The Number is Odd");
        }
    }
}
