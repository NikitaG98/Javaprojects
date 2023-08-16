package java8Exple;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class DateTime
{
    public static void main(String[] args) {
        LocalDate today= LocalDate.now();
        System.out.println("Current Date="+today);
        LocalDate firstDay_2023=LocalDate.of(2023, Month.SEPTEMBER,5 );
        System.out.println("Specific Date="+firstDay_2023);
        LocalTime time=LocalTime.now();
        System.out.println("Current Time:"+time);

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your birth date (yyyy-mm-dd format only) ");
        String st = sc.nextLine();

        LocalDate Dob;
        Dob = LocalDate.parse(st);

        System.out.println("Age is :- "+calcAge(Dob));
    }

    static int calcAge(LocalDate Dob)
    {
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(Dob,currentDate).getYears();
        return age;
    }
}
