package packArray;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int size, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements?");
        size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Sum of Array is " + sum);

    }


}
