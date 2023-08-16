package p_season;

import java.util.Scanner;

public class FindSeason
{
    public static void main(String[] args)
    {
        int January = 1,February = 2,March = 3,April = 4,May = 5 ,June = 6,July = 7,August = 8,September = 9,October = 10,November = 11,December = 12;
        int mon;
        System.out.println("Enter the Month: ");
        Scanner scanner = new Scanner(System.in);
        mon = scanner.nextInt();

        if (mon>=3 && mon<=5)
        {
            System.out.println("Season is Spring");
        }
        else if (mon>=6 && mon<=8)
        {
            System.out.println("Season is Summer");
        } else if (mon>=9 && mon<=11)
        {
            System.out.println("Season is Autumn");
        } else if (mon>=12 && mon<=2)
        {
            System.out.println("Season is Winter");
        } else
        {
            System.out.println("Invalid Month");
        }
    }
}
