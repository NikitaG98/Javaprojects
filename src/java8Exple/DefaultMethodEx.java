package java8Exple;

interface Int1{
    void abstractmethod();
    default void display(){
        System.out.println("Interface 1.....");
    }
    static  void  display1(){
        System.out.println("Static Method......");
    }
}

public class DefaultMethodEx implements Int1{
    public static void main(String[] args)
    {
        DefaultMethodEx d=new DefaultMethodEx();
        d.abstractmethod();
        d.display();
        Int1.display1();


    }

    @Override
    public void abstractmethod() {
        System.out.println("Abstract method");
    }
}
