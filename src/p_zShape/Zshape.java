package p_zShape;

import java.util.Scanner;

public class Zshape
{
    public static void main(String[] args)
    {


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=5; j++) {
                if (i==1||i==5)
                {
                   System.out.print("* ");
                }else if (j==5-i)
                {
                    System.out.print(" *");

                } else
                    System.out.print("  ");
            }
            System.out.println(  );
        }
    }
}
