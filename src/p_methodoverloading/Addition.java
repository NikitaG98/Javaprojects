package p_methodoverloading;

public class Addition
{
    public void add(int x,int y)
    {
        int add = x+y;
        System.out.println("Addition is :" +add);
    }

    public void add(float x,float y)
    {
        float add = x+y;
        System.out.println("Addition is :" +add);
    }

    public void add(long x,long y)
    {
        long add = x+y;
        System.out.println("Addition is :" +add);
    }

    public void add(double x,double y)
    {
        double add = x+y;
        System.out.println("Addition is :" +add);
    }

//    public void add(char x,char y)
//    {
//        char add = x+y;
//        System.out.println("Addition is :" +add);
//    }

    public void add(String x,String y)
    {
        String add = x+y;
        System.out.println("Addition is :" +add);
    }
}
