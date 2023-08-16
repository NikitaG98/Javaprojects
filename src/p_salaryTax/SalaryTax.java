package p_salaryTax;

import java.util.Scanner;

public class SalaryTax
{
    public static void main(String[] args)
    {
        System.out.println("Enter the salary");
        Scanner scanner = new Scanner(System.in);
        int sal = scanner.nextInt();
        float tax;
        if (sal>=1&&sal<=150000)
        {
            tax=0;
            System.out.println("Salary is " +tax);
        } else if (sal>=150001&&sal<=300000)
        {
            tax = 0.1f*sal;
            System.out.println("Salary is " +tax);
        } else if (sal>=300001&&sal<=500000)
        {
            tax = 0.2f*sal;
            System.out.println("Salary is " +tax);
        }
        else
        {
            tax = 0.3f*sal;
            System.out.println("Salary is " +tax);
        }

    }
}
