package p_edubridge;

class Learner{
    public void lname() {
      //  this.lname("Nikita G");
        System.out.println("My name is Nikita Ghansawant");
    }

    void courseName()
    {
       // this.courseName("Python full stack");
        System.out.println("Java full Stack");
    }

    void courseDuration(){
       // this.courseDuration("6 months");
        System.out.println("4 months");
    }
}
class Lcourse extends Learner{
    public void courseName()//Cannot reduce the visibility of inherited method in child class
    {
        //super.courseName("Mern");
        System.out.println("data analytics");
    }
    @Override
    void courseDuration(){
        System.out.println("2 months");
    }

    void analytics() {
        System.out.println("Analytics");
    }

}

public class MethodOverriding
{
    public static void main(String[] args) {
        Learner l=new Lcourse();
        l.courseName();
        l.lname();
        l.courseName();
        l.courseDuration();
//Learner le=new Learner();
//le.courseName();
//le.lname();
    }
}
