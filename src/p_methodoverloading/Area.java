package p_methodoverloading;


public class Area{
    public void area(double length,double breadth)
    {
       double area = length*breadth;
        System.out.println("Area is :" +area);

    }
    public void area(double radius)
    {
        double area=radius*radius;
        System.out.println("Area of Circle is :" +area);

    }
    public void area(float base,float height)
    {
        float area=(base*height)/2;
        System.out.println("Area of Traingle is :" +area);

    }
}
