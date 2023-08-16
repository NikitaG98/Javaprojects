package exceptionEdubridge;
//compile time example- also cheacked exception
public class ExceptionHand
{
    public static void main(String[] args) {
        try {
           // Class.forName("com.mysql.jdbc.Driver");
            Class.forName("basic.EnumEx11");
            System.out.println("Class found");
        }catch (Exception e)
        {
            //e.printStackTrace();
            System.out.println(e);
        }
    }
}
