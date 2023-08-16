package p_edubridgeJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BatchEx
{
    public void insert(List<PersonEntity> personEntities) throws ClassNotFoundException,SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");


        // establish the connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp1?useTimezone=true&server=UTC", "root", "admin@1234");
        System.out.println("Database Connection Established Successfully");
        String query = "INSERT INTO person(id, name) VALUES( ?, ?)";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        for (PersonEntity personEntity: personEntities) {
            preparedStatement.setInt(1, personEntity.getId());
            preparedStatement.setString(2, personEntity.getName());
            preparedStatement.addBatch();
        }
        preparedStatement.executeBatch();
    }

    public static void main(String[] args) throws ClassNotFoundException,SQLException {
            List<PersonEntity> l = new ArrayList<>();
            l.add(new PersonEntity(3,"Anika"));
            l.add(new PersonEntity(4,"Nikita"));
            l.add(new PersonEntity(5,"Apurva"));
            l.add(new PersonEntity(6,"Nikii"));
            l.add(new PersonEntity(7,"Ankita"));



    }
}
