package collectonsEdubrdge;
import java.util.HashSet;
import java.util.Iterator;
public class Hashsetex {
    public static void main(String[] args) {
            HashSet cities = new HashSet();
// Below line of code will remove element from HashSet
            cities.add("New Delhi");
            cities.add("Mumbai");
            cities.add("Chennai");
            cities.add("Kolkata");
        System.out.println(cities);
//Below line of code will remove element from HashSet
            cities.remove("New Delhi");
            Iterator iterator = cities.iterator();
            while(iterator.hasNext())
            {
                String nameOfCity=(String) iterator.next();
                System.out.println(nameOfCity);
            }
    }
}

