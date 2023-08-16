package p_constructoroverloading;

public class Box
{
    private  double width,height,length;
    public Box()
    {
        width=height=length=0;
        double volm=width*height*length;
    }

    public  Box(double a)
    {

        width=height=length=a;
        double volm=width*height*length;
    }

    public  Box(double a,double b,double c)
    {
        width=a;
        height=b;
        length=c;
        double volm=width*height*length;
    }

    public double getVolume()
    {
        double volm=width*height*length;
        System.out.println("Volume is : ");
        return volm;
    }

}
