package p_withoutVowel;

import java.util.Scanner;

public class WithoutVowel
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
        System.out.println("The Length is: " + sb.length());
        System.out.println("Alphabets are: " + sb);


        sb.delete(0, 1);
        sb.delete(3, 4);
        sb.delete(6, 7);
        sb.delete(11, 12);
        sb.delete(16, 17);
        System.out.println("The Length is: " + sb.length());
        System.out.println("Alphabets without Vowels are: " + sb);
    }

}

        //String alphabet = "abcdefghijklmnopqrstuvwxyz";
        //String vowels = "aeiou";

        //System.out.println(alphabet.length());

        //for (int i=0; i<alphabet.length(); i++)
       // {
           // System.out.println(alphabet.charAt(i));
       // }


