package p_calc;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        int num1,num2,add,sub;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1 and num2 ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        Calc calc = new Calc();
        calc.set(num1,num2);
        add= calc.add();
        sub=calc.sub();
        System.out.println("addition is" +add);
        System.out.println("subtraction is " +sub);


    }
}
