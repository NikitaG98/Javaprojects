package p_digitCount;

import java.util.Scanner;

public class DigitCount
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  digit number:");
        int num = scanner.nextInt();
        int counter = 0,rem;

        while (num>0)
        {
            num = num /10;
            counter++;
        }
            System.out.println("It is a " + counter + "digit number");


    }


}



