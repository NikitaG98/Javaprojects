package p_twoDjadarr;

import java.util.Scanner;

public class TwoDjdarr
{
    public static void main(String[] args)
    {
        int JA[][][]=new int[3][][];
        JA[0]=new int[3][4];
        JA[1]=new int[3][3];
        JA[2]=new int[2][3];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Elements");
        for (int i = 0; i < JA.length; i++) {
            for (int j = 0; j < JA[i].length; j++) {
                for (int k = 0; k < JA[i][j].length; k++) {
                    JA[i][j][k] = scanner.nextInt();
                }
            }
        }
        for (int i = 0; i < JA.length; i++)
        {
            for (int j = 0; j < JA[i].length; j++)
            {
                for (int k = 0; k < JA[i][j].length; k++)
                {
                    System.out.print(JA[i][j][k]+"\t");
                }
            }
            System.out.println();
        }
    }
}
