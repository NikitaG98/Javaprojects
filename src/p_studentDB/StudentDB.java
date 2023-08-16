package p_studentDB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDB implements ActionListener
{
    JFrame jFrame;
    JTextField jTextFieldrno, jTextFieldname, jTextFieldcourse, jTextFieldfees;
    JLabel jLabelrno, jLabelname, jLabelcourse, jLabelfees;
    Font font;
    JButton getbtn;
    public StudentDB() {
        jFrame = new JFrame();
        jFrame.setBounds(20, 20, 600, 300);
        font = new Font("Arial", Font.BOLD, 20);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

        jLabelrno = new JLabel("Roll No.:");
        jLabelrno.setBounds(30, 30, 200, 30);
        jLabelrno.setFont(font);

        jTextFieldrno = new JTextField(1);
        jTextFieldrno.setBounds(150, 30, 300, 30);
        jTextFieldrno.setFont(font);

        jLabelname = new JLabel("Name  :");
        jLabelname.setBounds(30, 90, 200, 30);
        jLabelname.setFont(font);

        jTextFieldname = new JTextField(1);
        jTextFieldname.setBounds(150, 90, 300, 30);
        jTextFieldname.setFont(font);

        jLabelcourse = new JLabel("Course:");
        jLabelcourse.setBounds(30, 150, 200, 30);
        jLabelcourse.setFont(font);

        jTextFieldcourse = new JTextField(1);
        jTextFieldcourse.setBounds(150, 150, 300, 30);
        jTextFieldcourse.setFont(font);

        jLabelfees = new JLabel("Fees :");
        jLabelfees.setBounds(30, 210, 200, 30);
        jLabelfees.setFont(font);

        jTextFieldfees = new JTextField(1);
        jTextFieldfees.setBounds(150, 210, 300, 30);
        jTextFieldfees.setFont(font);

        getbtn = new JButton();
        getbtn.setText("Get");
        getbtn.setFont(font);
        getbtn.setBounds(200, 400, 130, 30);
        getbtn.addActionListener(this);

       // connectTostudentDB();

        jFrame.add(jTextFieldrno);
        jFrame.add(jLabelname);
        jFrame.add(getbtn);
        jFrame.add(jLabelrno);
        jFrame.add(jTextFieldname);
        jFrame.add(jTextFieldcourse);
        jFrame.add(jLabelcourse);
        jFrame.add(jLabelfees);
        jFrame.add(jTextFieldfees);

        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }

//    public void insertData()
//    {
//        try
//        {
//            int rno;
//            String name,course;
//            float fee;
//
//            rno= Integer.parseInt(jTextFieldrno.getText());
//            name=jTextFieldname.getText();
//            course=jTextFieldcourse.getText();
//            fee=Float.parseFloat(jTextFieldfees.getText());
//            String qry ="insert into student values(" + rno + "," + name + "," + course + "," + fee + ")";
//            int
//
//        }
//    }

        @Override
        public void actionPerformed (ActionEvent e)
        {
            try {
                //load the driver class
                Class.forName("com.mysql.cj.jdbc.Driver");

                // establish the connection
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb?useTimezone=true&server=UTC", "root", "");

                //create stmt object
                Statement stmt = con.createStatement();

                //execute the query
                ResultSet rs = stmt.executeQuery("select * from student");

                if (e.getSource()==getbtn)
                {
                    if (rs.next() == true)
                    {

                        jTextFieldrno.setText(rs.getString(1));
                        jTextFieldname.setText(rs.getString(2));
                        jTextFieldcourse.setText(rs.getString(3));
                        jTextFieldfees.setText(rs.getString(4));
                        // System.out.println("\n\n");
                    }
                    con.close();
                }

            } catch (Exception ex)
            {
                ex.printStackTrace();
               // System.out.println("error in code");
            }

        }
}

