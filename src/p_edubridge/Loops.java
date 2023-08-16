package p_edubridge;

public class Loops
{
    public static void main(String[] args)
    {
        int num = 1;
        while (num <= 50)
        {
            if (num % 2 == 0)
            {
                System.out.println("Num is even");
                num++;
            } else {
                System.out.println("Num is odd");
            }
        }
    }
}
