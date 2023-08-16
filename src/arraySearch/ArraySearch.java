package arraySearch;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch
{

    public static boolean search(int a[], int num)
    {
        for (int i = 0; i <a.length ; i++)
        {
            if (a[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        int size,num;
        System.out.println("Enter Size: ");
        Scanner scanner=new Scanner(System.in);
        size=scanner.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Array: ");
        for (int i = 0; i < arr.length ; i++)
        {
            arr[i]=scanner.nextInt();

        }
        System.out.println("Enter num to search:");
        num=scanner.nextInt();
        ArraySearch search1=new ArraySearch();
        boolean b = search1.search(arr,num);
        if (b == true)
        {
            System.out.println("Found");
         }
        else
        {
             System.out.println("Not found");
        }
    }
}
