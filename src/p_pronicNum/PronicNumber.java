package p_pronicNum;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PronicNumber
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int a=1,b=2;
        while (true)
        {
            if (a*b==num)
            {
                System.out.println("Entered number is Pronic number");
                break;
            }
            else if (a*b>num)
            {
                System.out.println("Entered number is not Pronic number");
                break;
            }
            a++;
            b++;
        }
    }
}
