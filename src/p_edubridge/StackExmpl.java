package p_edubridge;
import java.util.Stack;
import java.util.Collections;

public class StackExmpl
{
    public static void main(String[] args) {
        Stack <String> s=new Stack<>();
        s.push("nikita");
        s.push("Anika");
        s.push("Abhi");
        System.out.println(s);
        System.out.println("Stack is empty?" +s.empty());
        s.pop();
        System.out.println("After popping:" +s);
    }
}
