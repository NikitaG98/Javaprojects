package p_edubridge;

import java.util.Scanner;

public class UserInput
{
    public static void main(String[] args)
    {
        String name;
        System.out.println("Enter the Name:");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Name:" +name);
    }
}
