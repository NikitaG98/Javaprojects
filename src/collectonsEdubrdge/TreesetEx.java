package collectonsEdubrdge;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreesetEx
{
    public static void main(String[] args) {
        TreeSet name = new TreeSet();
// Below line of code will remove element from HashSet
        name.add("Nikita");
        name.add("Anika");
        name.add("Abhi");
        name.add("Kartiki");
      //  name.add(null);
        System.out.println(name);
//Below line of code will remove element from HashSet
       name.remove("kartiki");
        Iterator iterator = name.descendingIterator();
        while(iterator.hasNext())
        {
            String name1=(String) iterator.next();
            System.out.println(name1);
       }
    }
}
