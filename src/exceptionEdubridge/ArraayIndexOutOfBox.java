package exceptionEdubridge;

public class ArraayIndexOutOfBox
{
    public static void main(String[] args) {
        try {
        int a[]= {1,2,3,4,5};
        System.out.println(a[1]);
        int c=10/5;
        System.out.println(c);
        String s="abc";
        int x=Integer.parseInt(s);
            System.out.println(x);
        }
        catch (ArrayIndexOutOfBoundsException a){
           // a.printStackTrace();
            System.out.println("Some error in code"+ a);
        }catch (ArithmeticException a)
        {
            System.out.println("Number cannot divided by 0"+a);
        }catch (NumberFormatException n)
        {
            System.out.println("number formate"+ n);
        }
        finally {
            System.out.println("the end");
        }
    }
}
