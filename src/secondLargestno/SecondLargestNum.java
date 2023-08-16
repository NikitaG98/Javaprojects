package secondLargestno;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNum
{
    public static void main(String[] args)
    {
        int size,secondlargest;
        System.out.println("Enter Size: ");
        Scanner scanner=new Scanner(System.in);
        size=scanner.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Array: ");
        for (int i = 0; i < arr.length ; i++)
        {
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        secondlargest=arr[arr.length-2];
        System.out.println("Second Largest is "+secondlargest);
    }
}
