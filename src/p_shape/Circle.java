package p_shape;

public class Circle extends Shape
{
    public Circle(double r)
    {
        radius=r;
    }

    @Override
    public void area() {
        double a=3.14*radius*radius;
        System.out.println("Area is : "+a);

    }

    @Override
    public void perimeter() {
        double p=2*3.14*radius;
        System.out.println("Perimeter is : "+p);


    }
}
