package p_elecBill;

import java.util.Scanner;

public class ElectricityBill
{
    public static void main(String[] args)
    {
        int unit,amt,total;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter units consumed: ");
        unit = scanner.nextInt();
        if (unit>=1&&unit<=100)
        {
            amt = unit*3;
            System.out.println("Bill is Rs " +amt);
        } else if (unit>=101&&unit<=300)
        {
            amt = 300 + ((unit-100)*5);
            System.out.println("Bill is Rs " +amt);
        }
        else
        {
            amt = 1300 + ((unit-300)*7);
            System.out.println("Bill is Rs " +amt);
        }

    }
}
