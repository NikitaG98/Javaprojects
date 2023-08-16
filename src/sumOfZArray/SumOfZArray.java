package sumOfZArray;

import java.util.Scanner;

public class SumOfZArray
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows and columns:");
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Elements of arrays");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Elements of arrays ");
      //  for (int i = 0; i < arr.length; i++) {
        //    for (int j = 0; j < arr[i].length; j++) {
          //      System.out.print(arr[i][j] + "\t");
            //}
            for (int i = 1; i <= arr.length; i++) {
                for (int j = 1; j <= arr[i].length; j++) {
                    if (i == 1 || i == arr.length) {
                        System.out.print(arr[i][j]);
                    } else if (j == arr.length - i) {
                        System.out.print(arr[i][j]);

                    } else
                        System.out.print("  ");
                }
                System.out.println();

            }
        }
}

