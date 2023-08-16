package p_table;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        System.out.println("Enter Number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1;i<=10;i++)
        {
           int table = i*num;
            System.out.println(table);
        }

    }
}
