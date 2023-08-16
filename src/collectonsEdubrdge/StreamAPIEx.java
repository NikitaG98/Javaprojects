package collectonsEdubrdge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Emp {
    int eid;
    String ename;
    double salary;
    String designation;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return "Emp [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", designation=" + designation + "]";
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Emp(int eid, String ename, double salary, String designation) {
        super();
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;
        this.designation = designation;
    }

}

public class StreamAPIEx {

    public static void main(String[] args) {
        ArrayList<Emp> al = new ArrayList<>();
        al.add(new Emp(12, "Shalini", 30000, "HR"));
        al.add(new Emp(13, "Shalu", 40000, "developer"));
        al.add(new Emp(14, "Shakira", 35000, "Tester"));
        al.add(new Emp(15, "Tanu", 40000, "Team Lead"));
        al.add(new Emp(16, "manoj", 25000, "Associate"));

        System.out.println(al);

        long count = al.stream().count();

        System.out.println("number of employees: " + count);

        long start_with_s=al.stream().filter(a->a.getEname().startsWith("S")).count();

        System.out.println("Start with S: " +start_with_s );

        Stream<Emp> namesStartsWith = al.stream().filter(a -> a.getEname().startsWith("A"));
       // System.out.println("Name start with A:"+namesStartsWith.collect(Collectors.toList()));
        System.out.println(""+namesStartsWith.collect(Collectors.toList()));

      //  Stream<Emp> s = al.stream().filter(name -> getname().startsWith("C"));

      //  System.out.println(s.collect(Collectors.toList()));

//		List<String> s=new al.stream().filter(a->a.getEname().startsWith("S"));
        Object max_sal=al.stream().collect(Collectors.maxBy(Comparator.comparingDouble(a->a.salary)));
        System.out.println("maximun salry: "+max_sal);
        Object min_sal=al.stream().collect(Collectors.minBy(Comparator.comparingDouble(a->a.salary)));
        System.out.println("minimun salry: "+min_sal);
        double avg_sal=al.stream().collect(Collectors.averagingDouble(a->a.salary));

        System.out.println("Average salry: "+avg_sal);

        String[] arr = {"bob", "alice", "paul", "ellie"};
        Stream<String> myStream = Arrays.stream(arr);
        System.out.println(myStream.collect(Collectors.toList()));
    }

}

