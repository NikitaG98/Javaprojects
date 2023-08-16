package p_fullName;

import java.util.Scanner;

public class FullName
{
    public static String getFullName(String fname,String mname,String lname)
    {
        String name =fname+" "+ mname +" "+lname;
        return name;

    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String fname,mname,lname,name;
        System.out.println("Enter first name: ");
        fname=scanner.next();
        System.out.println("Enter middle name: ");
        mname=scanner.next();
        System.out.println("Enter last name: ");
        lname=scanner.next();
        FullName name1=new FullName();
        name=name1.getFullName(fname,mname,lname);
        System.out.println(name);
    }
}
