package p_stuDetail;

import java.util.Scanner;

public class StudentDetail
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Percetage:");
        float per=scanner.nextFloat();
        System.out.println("Enter Roll no:");
        int rollno=scanner.nextInt();
        System.out.println("Enter Name:");
        scanner.nextLine();
        String name=scanner.nextLine();
        System.out.println("Percetage is " + per );
        System.out.println("Roll no is " + rollno);
        System.out.println("Name is " + name);
    }
}
