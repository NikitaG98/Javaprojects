package p_pencilCount;

import java.util.Scanner;

public class PencilCount
{
    public static void main(String[] args) {
        System.out.println("Enter the Standard:");
        Scanner scanner = new Scanner(System.in);
        int std = scanner.nextInt();
        int count=0;
        if(std>0 && std<=12)
        {
            for (int i = 1; i <=std ; i++)
            {
                count=count+(i*i);
                System.out.println(count);
            }
        }
        else
        {
            System.out.println("invalid standard entered");
        }
    }
}
