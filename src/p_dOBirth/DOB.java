package p_dOBirth;

import java.time.LocalDateTime;
import java.util.Scanner;

public class DOB
{

    public static void showDOB()
    {
        System.out.println("Enter year of birth:");
        Scanner scanner = new Scanner(System.in);
        int year= scanner.nextInt();
        System.out.println("Enter month of birth:");
        int month= scanner.nextInt();
        System.out.println("Enter day of birth:");
        int day=scanner.nextInt();
        System.out.println("Your date of birth is: ");
        System.out.println(day+"/"+month+"/"+year);
    }

    public static void main(String[] args)
    {

        DOB.showDOB();

    }
}
