package p_edubridge.assignments;

import java.util.Scanner;

public class Pattern
{
    public static void main(String[] args)
    {
//        System.out.println("Enter the input:");
//        Scanner scan = new Scanner(System.in);
//        int num=scan.nextInt();
//        int rows=0,cols=0;
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print("1 ");
//            }
//            System.out.println();

            int i,j,num;

            System.out.print("Input number of n : ");
            Scanner in = new Scanner(System.in);
            num = in.nextInt();

            for(i=1;i<=num;i++)
            {
                for(j=1;j<=i;j++)
                    System.out.print(i);
                System.out.println("");
            }
    }
}


