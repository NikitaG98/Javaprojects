package p_edubridge;
import packArray.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListEx
{
    public static void main(String[] args) {


    ArrayList <String> al=new ArrayList<>();
    al.add("Nikita");
    al.add(0,"Anika");
        al.add(1,"Abhi");
        al.add(2,"Hinata");
    al.add(" ");
    al.sort(Comparator.reverseOrder());
        System.out.println("Elements in My ArrayList :" +al);
        al.sort(Comparator.naturalOrder());
        System.out.println("Elements in My ArrayList :" +al);
        System.out.println("Size of My ArrayList :" +al.size());
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 41, 2, 32, 44, 85);

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Nikita","Nini"));
        Collections.sort(list);
        System.out.println("Sorted list:" +list);
        System.out.println(arrayList);

    }
}
