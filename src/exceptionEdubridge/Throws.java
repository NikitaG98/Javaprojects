package exceptionEdubridge;

public class Throws
{
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("basic.unaryEx11");
        System.out.println("Class not found");

    }
}
