package p_stringArr;

import java.util.Scanner;

public class StringArray
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter words: ");
        String s = scanner.nextLine();
        String str[] =s.split(" ");

        for (int i = 0; i < str.length; i++)
        {
                System.out.println(str[i].charAt(0));

        }

    }
}
