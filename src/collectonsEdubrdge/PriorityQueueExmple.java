package collectonsEdubrdge;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExmple {
    public static void main(String[] args) {
        PriorityQueue<Integer> pp = new PriorityQueue<>(new Comparator<Integer>() {
            public int compare(Integer lhs, Integer rhs) {
                if (lhs < rhs) return +1;
                if (lhs.equals(rhs)) return 0;
                return -1;
            }
        });
        pp.add(8);
        pp.add(12);
        pp.add(6);
        pp.add(4);
        pp.add(2);
        pp.add(2);
        pp.add(12);
        pp.add(10);

        System.out.println("The max Priority Queue contents:");
        Integer val = null;
        while ((val = pp.poll()) != null) {//display the max PriorityQueue
            System.out.print(val + " ");
        }
    }
}
