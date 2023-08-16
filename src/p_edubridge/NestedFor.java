package p_edubridge;

public class NestedFor
{
    public static void main(String[] args)
    {
        {
            int rows=3;
            for (int i = 1; i <=rows ; i++)
            {
                // System.out.println("Value of i :" +i);
                for (int j = rows; j>=i ; --j)
                {
                    System.out.print("* " +j +i); //i for rows and j for columns
                }
                System.out.println();
            }

        }


        for (int i = 3; i>=1; --i)
        {
            // System.out.println("Value of i :" +i);
            for (int j =1; j<=i ; j++)
            {
                System.out.print("* " +j +i); //i for rows and j for columns
            }
            System.out.println();
        }
    }
}
