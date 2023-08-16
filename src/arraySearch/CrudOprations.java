package arraySearch;

import java.util.ArrayList;
        import java.util.Iterator;
        import java.util.Scanner;

//class Learner{
//    int lno;
//    String lname,ldegree;
//    public int getLno() {
//        return lno;
//    }
//    public void setLno(int lno) {
//        this.lno = lno;
//    }
//    public String getLname() {
//        return lname;
//    }
//    public void setLname(String lname) {
//        this.lname = lname;
//    }
//    public String getLdegree() {
//        return ldegree;
//    }
//    public void setLdegree(String ldegree) {
//        this.ldegree = ldegree;
//    }
//    public Learner(int lno, String lname, String ldegree) {
//        super();
//        this.lno = lno;
//        this.lname = lname;
//        this.ldegree = ldegree;
//    }
//    @Override
//    public String toString() {
//        return "Learner [lno=" + lno + ", lname=" + lname + ", ldegree=" + ldegree + "]";
//    }
//
//}
//public class CrudOprations {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        ArrayList<Learner> l = new ArrayList<Learner>();
//        Scanner s = new Scanner(System.in);
//        int choice;
//        do {
//            System.out.println("1. Insert data ");
//            System.out.println("2. Display data ");
//            System.out.println("3. Search data ");
//            System.out.println("Enter your choice: ");
//            choice = s.nextInt();
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter lno ");
//                    int lno = s.nextInt();
//                    System.out.print("Enter lname ");
//                    String lname = s.next();
//                    System.out.print("Enter ldegree ");
//                    String ldegree = s.next();
//                    l.add(new Learner(lno, lname, ldegree));
//                    break;
//
//                case 2:
//                    Iterator<Learner> i = l.iterator();
//                    while (i.hasNext()) {
//                        Learner le = i.next();
//                        System.out.println(le);
//                    }
//                case 3:
//                    boolean found = false;
//                    System.out.print("Enter lno to Search : ");
//                    int lno1 = s.nextInt();
//
//                    Iterator<Learner> j = l.iterator();
//                    while (j.hasNext()) {
//                        Learner e = j.next();
//                        if (e.getLno() == lno1) {
//                            System.out.println(e);
//                            found = true;
//                        }
//                    }
////                    if (!found) {
////                        System.out.println("Record Not Found");
//                    }
//                    //   case 4:
//                    //     Iterator<Learner> k= l.iterator();
//                    //   while (k.hasNext()) {
//                    //     Learner d = k.next();
//                    //   if (lno.equals(2)) {
//                    //     k.remove(); // Remove the element from the list
//            }
//        }
//            }
//        }while(choice!=0);
//
      //  }
//


//    boolean found = false;
//                    System.out.print("Enter Lno to Update : ");
//                            lno = s.nextInt();
//                            Iterator < Learner > li = al.Iterator();
//        while (li.hasNext()) {
//        Learner e = li.next();
//        if (e.getLno() == lno) {
//        System.out.print("Enter new Name : ");
//        lname = s1.nextLine();
//        System.out.print("Enter new degree : ");
//        ldegree = s.nextInt();
//        li.set(new Learner(lno, lname, ldegree));
//        found = true;
//        }
//        }
//
//        if (!found) {
//        System.out.println("Record Not Found");
//        }
//        else {
//        System.out.println("Record is Updated Sucessfully");
//        }