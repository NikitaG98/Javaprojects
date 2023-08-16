package p_maxDept;
import java.util.Scanner;

public class MaxDept
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int CSE,ECE,MECH;

        System.out.println("Enter no. of students placed in CSE:");
        CSE = scanner.nextInt();
        System.out.println("Enter the no. of students placed in ECE");
        ECE = scanner.nextInt();
        System.out.println("Enter the no. of students placed in MECH");
        MECH = scanner.nextInt();

        if (CSE<0||ECE<0||MECH<0)
        {
            System.out.println("Input is Invalid");
        }
        else if (CSE>ECE&&CSE>MECH)
        {
            System.out.println("Highest placement in CSE department " );
        }
        else if(ECE>CSE&&ECE>MECH)
        {
            System.out.println("Highest placement in ECE department ");

        }
        else if (MECH>CSE&&MECH>ECE)
        {
            System.out.println("Highest placement in MECH department ");

        }
        else if (CSE==ECE&&CSE>MECH)
        {
            System.out.println("Highest placement in CSE and ECE department " + CSE);
        }
            else if (CSE==MECH&&CSE>ECE)
            {
                System.out.println("Highest placement in CSE and MECH department" + MECH);
            }
            else if (ECE==MECH&&ECE>CSE)
            {
                System.out.println("Highest placement in ECE and MECH department" + MECH);
            }
            else
            {
                System.out.println("None of department has got the highest placement");
            }


    }
}
