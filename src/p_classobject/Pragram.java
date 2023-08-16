package p_classobject;

import java.util.ArrayList;
import java.util.Scanner;

public class Pragram
{
    public static void main(String[] args)
    {
       // ArrayList<Student> list=new ArrayList<>();
        Student s[] = new Student[3];
        //list.add()
        Scanner scanner=new Scanner(System.in);
        int sem,rno;
        String name,dept,search;
        float per;
       // list.add(search);
        for (int i = 0; i <s.length ; i++)
        {
            System.out.println("Enter sem,rno,name,dept,per");
            sem=scanner.nextInt();
            rno=scanner.nextInt();
            name=scanner.next();
            dept=scanner.next();
            per=scanner.nextFloat();

            s[i]=new Student();
            s[i].setSem(sem);
            s[i].setRno(rno);
            s[i].setName(name);
            s[i].setDept(dept);
            s[i].setPer(per);

        }

        for (int i = 0; i <s.length ; i++)
        {


            System.out.println("Enter name to search: ");
            search = scanner.next();
            if (s[i].getName() == search) {
                System.out.println("name is found" + s[i].toString());
            } else {
                System.out.println("name is not found");
            }


        }
    }
}
