package p_profitLoss;

import java.util.Scanner;

public class ProfitLoss
{
    public static void main(String[] args)
    {
        int profit,loss,sp,cp;
        System.out.println("Enter the Selling Price:");
        Scanner scanner = new Scanner(System.in);
        sp = scanner.nextInt();
        System.out.println("Enter the Cost Price:");
        cp = scanner.nextInt();
        profit = sp-cp;
        if(sp>cp)
        {
            System.out.println("The Profit of Rs " +profit);
        }
        else
        {
            loss = cp-sp;
            System.out.println("The Loss of Rs " +loss);
        }

    }
}
