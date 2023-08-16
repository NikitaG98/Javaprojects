package collectonsEdubrdge;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
  class Employees1 {
    private LocalDate dOj;
    int salary;
    String eName;
    public Employees1(int dOj, int salary, String eName ) {
        super();
        this.dOj = LocalDate.ofEpochDay(dOj);
        this.salary=salary;
        this.eName=eName;


    }

    @Override
    public String toString() {
        return "Employee[dOfJoining="+ dOj+ ",eSalary ="+ salary+ ",eName ="+ eName+"]";
    }
}

class SortbyEmployeesName implements Comparator<Employees1>{
    public int compare(Employees1 o1,Employees1 o2)
    {
        return o1.eName.compareTo(o2.eName);
    }
}

public class Employees{
    public static void main(String[] args) {
        ArrayList<Employees1> ar=new ArrayList<Employees1>();
        ar.add(new Employees1(2021-03-02, 15000, "Ankita"));
        ar.add(new Employees1(2020-02-04, 30000, "nini"));
        ar.add(new Employees1(2022-02-03, 20000, "Abhi"));
        ar.add(new Employees1(2021-01-03, 25000, "Nikita"));
        Collections.sort(ar,new SortbyEmployeesName());
        System.out.println("Sort by eName");
        for (int i = 0; i <ar.size() ; i++) {
            System.out.println(ar.get(i));

        }

    }

}


