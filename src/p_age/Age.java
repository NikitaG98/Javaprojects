package p_age;

import java.util.Scanner;

public class Age
{
    public static void main(String[] args) {
        int age, a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Age:");
        age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You can vote");
        } else {
            a = 18 - age;
            System.out.println("You can vote after " + a + " years");
        }
    }
}
