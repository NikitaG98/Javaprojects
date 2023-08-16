package p_krishnamurthyNo;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class KrishnamurthyNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scanner.nextInt();
        int sum=0,currentDigit,fact,temp;
        temp=num;
        while (temp!=0)
        {
            currentDigit=temp%10;
            fact=1;
            for (int i = 0; i <=currentDigit ; i++)
            {
                fact=fact*i;

            }
            sum=sum+fact;
            temp=temp/10;
        }
        if (sum==num)
        {
            System.out.println("Its Krishnamurthy number " + num);

        }
        else
        {
            System.out.println("Its Not Krishnamurthy number " + num);
        }

    }
}
