package collectonsEdubrdge;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueueEx
{
    public static void main(String[] args) {
        Deque <Integer> qq=new ArrayDeque<Integer>();
        qq.offer(4);
        qq.offer(7);
        qq.offer(5);
        qq.offer(10);
        qq.offerLast(17);
        qq.offerFirst(8);
        qq.offerLast(9);
        System.out.println(qq);
        int r= qq.poll();
        int a=qq.pollFirst();
        int n=qq.pollLast();
        System.out.println(r);
        System.out.println(a);
        System.out.println(n);
    }
}
