package p_edubridgeJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepStatement
{
    public static void main(String[] args) throws  ClassNotFoundException, SQLException {


        //load the driver class
        Class.forName("com.mysql.cj.jdbc.Driver");


        // establish the connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp1?useTimezone=true&server=UTC", "root", "admin@1234");
        System.out.println("Database Connection Established Successfully");
//        String u="insert into employee values (?,?,?)";
     //   PreparedStatement ps =con.prepareStatement(u);
//////    ps .setInt(1, 7);
//        ps.setString(2,"Amay" );
//        ps.setString(3, "2014-05-07");
//        ps.execute();
        String u="update employee set ename=?,dob=? where eid=?";
        PreparedStatement ps =con.prepareStatement(u);
        ps.setString(1,"Vihan" );
        ps.setString(2, "2014-11-04");
        ps .setInt(3, 1);
        ps.executeUpdate();
        System.out.println("Record updated");

    }
}
