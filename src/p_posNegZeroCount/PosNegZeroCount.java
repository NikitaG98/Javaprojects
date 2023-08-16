package p_posNegZeroCount;

import java.util.Scanner;

public class PosNegZeroCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num,pos=0,neg=0,zero=0;
        do {
            System.out.println("Enter any number:");
            num = scanner.nextInt();

        }while (num!=0);

        {
            if (num > 0) {
                System.out.println("positive is " + pos);
                pos++;
            } else if (num < 0) {
                System.out.println("negative is " + neg);
                neg++;
            } else {
                System.out.println("zero is " + zero);
                zero++;
            }

        }
    }
}
