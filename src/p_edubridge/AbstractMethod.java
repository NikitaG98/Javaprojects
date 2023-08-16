package p_edubridge;

    abstract class Vehicle1
    {
        public Vehicle1() {
            // TODO Auto-generated constructor stub
            System.out.println("Vehicle Constructor");
        }
        abstract void show();
        void vehicleBrand() {    //This is my non Abstract method
            System.out.println("Non abstract method");
        }
        public  static void display() {
            System.out.println("Static display method");
        }



    }
    class Bike extends Vehicle1{

        @Override
        void show() {
            // TODO Auto-generated method stub
            System.out.println("Bike");
        }

    }
    class Car extends Vehicle1{

        @Override
        void show() {
            // TODO Auto-generated method stub
            System.out.println("car");
        }

    }
    public class  AbstractMethod
    {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            //Vehicle1 v=new Car();
            // v.show();
            Vehicle1 c=new Bike();
            c.show();
            c.vehicleBrand();
            Car.display();
            Bike.display();
            Vehicle1.display();
        }

    }

