package p_posNegSwitch;

import java.util.Scanner;

public class PosNegSwitch
{
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String s = (num > 0) ? "Positive" : (num == 0) ? "Zero" : "Negative";
        System.out.println(s);
    }
}
