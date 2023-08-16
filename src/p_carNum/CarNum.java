package p_carNum;

import java.util.Scanner;

public class CarNum
{
    public static void main(String[] args)
    {
        int num,a,b,c,d,sum;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Car number: ");
        num = scanner.nextInt();
        a = num % 10;
        b = (num/10)%10;
        c = (num/100)%10;
        d = num/1000;
       // int leng = String.valueOf(num).length();

        sum = a+b+c+d;

        if (num>=1000&&num<=9999)
        {
            if (sum % 3 == 0)
            {
                System.out.println("Entered Car number is Lucky ");
            }
            else if (((sum % 5 == 0) || (sum % 7 == 0)) || (sum % 3 == 0))
            {
                System.out.println("Its Lucky Number ");
            }
            else
            {
                System.out.println("Sorry its not My Lucky Number ");
            }
        }
        else
        {
            System.out.println("Entered Car Number is Invalid , Number should be 4 digit");
        }

    }
}
