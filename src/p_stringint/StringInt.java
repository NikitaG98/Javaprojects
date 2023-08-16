package p_stringint;

import java.util.Scanner;
public class StringInt
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Password:");
        String str=scanner.nextLine();
        int Ac=0,nc=0,Sc=0;
        if(str.length()>=7 && !(str.charAt(0)>='0' && str.charAt(0)<='9'))
        {
            for (int i = 0; i < str.length(); i++)
            {
                char ch= str.charAt(i);
                if(ch>='A' && ch<='Z')
                {
                    Ac=1;
                } else if (ch>='0' && ch<='9')
                {
                    nc=1;
                } else if (ch=='_' || ch=='\\')
                {
                    Sc=1;
                } else if (Ac==1 && nc==1 && Sc!=1)
                {
                    System.out.println(1);

                }else {
                    System.out.println(0);
                }
            }
        }else {
            System.out.println(0);
        }
    }














}






  //  public static void main(String[] args)
  //  {
  //      Scanner scanner=new Scanner(System.in);
    //    System.out.println("Enter Product Code: ");
      //  Scanner scanner = new Scanner(System.in);
     //   String pcode = scanner.next();
 //       float dis;
   //     int mrp;
     //   if (mrp>=1&&dis<=150000)
 //       {
   //         dis=0;
     //       System.out.println("MRP is " +dis);
 //       } else if (sal>=150001&&sal<=300000)
   //     {
     //       tax = 0.1f*sal;
       //     System.out.println("Salary is " +tax);
   //     } else if (sal>=300001&&sal<=500000)
     //   {
       //     tax = 0.2f*sal;
         //   System.out.println("Salary is " +tax);
  //      }
    //    else
      //  {
        //    tax = 0.3f*sal;
      //      System.out.println("Salary is " +tax);
        //}

   // }

