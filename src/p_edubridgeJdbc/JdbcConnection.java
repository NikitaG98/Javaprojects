package p_edubridgeJdbc;

import java.sql.*;
import java.lang.Class;
import  java.sql.ResultSet;

public class JdbcConnection
{
    public static void main(String[] args) throws  ClassNotFoundException, SQLException {


        //load the driver class
        Class.forName("com.mysql.cj.jdbc.Driver");


        // establish the connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp1?useTimezone=true&server=UTC", "root", "admin@1234");
        System.out.println("Database Connection Established Successfully");
        //create stmt object
        Statement stmt;
        stmt=(Statement) con.createStatement();
        //execute the query
      //  String query1= "INSERT INTO employee VALUES ('5','minti','1999-08-27')";
       // stmt.executeUpdate(query1);
        System.out.println("Record insert successfully");

        ResultSet rs = null;
        rs = stmt.executeQuery("select * from employee");

        System.out.println("No of Records:");
        while (rs.next()) {
            // Display values
            System.out.print("EID: " + rs.getInt("eid"));
          //  System.out.print(", Email Id: " + rs.getString("email_address"));
            System.out.println(", Name: " + rs.getString("first_name"));
            System.out.println(", DOB: " + rs.getString("last_name"));


        }


    }

}
