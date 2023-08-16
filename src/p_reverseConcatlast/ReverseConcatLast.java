package p_reverseConcatlast;


import java.util.Scanner;

public class ReverseConcatLast
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Words: ");
        String s=scanner.nextLine();
        s.toLowerCase();

        String str[]=s.split(" ");
        String lastone=str[str.length-1];
        StringBuilder sb = new StringBuilder(str[0]);
       // int n = str.length;
        sb.reverse();
        String rev = sb.toString();
      //  for (int i = 0; i < str.length; i++)
       // {
         //    char s1=str[i].charAt(0);
           //  if (s1==str[i])

        //}

            for (int i = 0; i < 1; i++)
            {

                System.out.println(rev.concat(lastone));

            }
    }
}
