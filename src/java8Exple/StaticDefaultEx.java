package java8Exple;



interface Str1{
    default void display(){
        System.out.println("Hello1");
    }
    static void display1(){
        System.out.println("Hello static methods");
    }
//     void display2(){
//
//    }
}
interface Str2{
    default void display3(){
        System.out.println("Hello2");
    }
    static void display4(){
        System.out.println("Hello static methods str2");
    }
//    void display5(){
//
//    }
}
public class StaticDefaultEx implements Str1,Str2
{
    public static void main(String[] args) {
        StaticDefaultEx s=new StaticDefaultEx();
        s.display();
     //   s.display2();
        Str1.display1();
        s.display3();
     //   s.display5();
        Str2.display4();
    }

//    @Override
//    public void display2() {
//        System.out.println("Hello str1");
//    }
//
//    @Override
//    public void display5() {
//        System.out.println("Hello str2");
//
//    }
}
