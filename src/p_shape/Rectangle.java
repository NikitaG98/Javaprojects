package p_shape;

public class Rectangle extends Shape
{
    public Rectangle(double l,double b) {
        length = l;
        breadth = b;
    }

    @Override
    public void area() {
        double a=length*breadth;
        System.out.println("Area is : "+a);


    }

    @Override
    public void perimeter() {
        double p=2*(length+breadth);
        System.out.println("Perimetre is : "+p);

    }
}
