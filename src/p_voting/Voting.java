package p_voting;

import java.util.Scanner;

public class Voting
{
    public int getAge()
    {
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Age:");
        age = scanner.nextInt();

        return age;
    }
    public void show(int age)
    {

        if (age >= 18)
        {
            System.out.println("You can vote");
        } else
        {
            System.out.println("You can not vote");
        }


    }
    public static void main(String[] args)
    {
        int age;


        Voting age1=new Voting();
       age= age1.getAge();
       age1.show(age);

    }
}
