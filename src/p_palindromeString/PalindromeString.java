package p_palindromeString;

import java.util.Scanner;

public class PalindromeString
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.next();
        name.toLowerCase();
        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        String rev = sb.toString();

        if (rev.equals(name) == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
