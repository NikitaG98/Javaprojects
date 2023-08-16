package p_temp;

import java.util.Scanner;

public class Temperature
{
    public static void main(String[] args)
    {
        float c,f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of celsius");
        c = scanner.nextFloat();
        f = (c*9/5)+32;
        System.out.println("Fahrenheit value is " + f);
    }
}

