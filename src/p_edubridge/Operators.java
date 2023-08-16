package p_edubridge;

public class Operators
{
    public static void main(String[] args)
    {
        int a=3,b=5,c=8;
        int result = (a<b)?(a<c?a:c):(c<b?c:b);
        System.out.println("min is :"+ result);
    }
}
