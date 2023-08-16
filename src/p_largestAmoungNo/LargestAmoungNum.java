package p_largestAmoungNo;

import java.util.Scanner;

public class LargestAmoungNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = scanner.nextInt();
        int large=0, rem=0;
        while (num >0)
        {
            rem = num%10;
            if(rem>large)
            {
                large=rem;
            }
            num=num/10;
        }
        System.out.println("Largest number is " +large);
    }
}
