package p_hospitaldb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HospitalDb implements ActionListener
{

    JFrame jFrame;
    JLabel  jLabel, jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6;
    JTextField  jTextFieldId, jTextFieldName, jTextFieldAge, jTextFieldGender, jTextFieldDiseases, jTextFieldExists, jTextFieldDate;
    JButton jButtonSubmit;
   // JPasswordField pf2;
    Font font;
    Connection con;
    Statement stmt;
    ResultSet rs;


        public HospitalDb()
        {
            font = new Font("Consolas", Font.BOLD, 20);
            jFrame = new JFrame();
            jFrame.setBounds(10, 10, 800, 500);
            jFrame.setTitle("Patient Details");

            jLabel = new JLabel("Id");
            jLabel.setBounds(40, 20, 60, 30);

            jTextFieldId = new JTextField();
            jTextFieldId.setFont(font);
            jTextFieldId.setBounds(150, 20, 250, 30);


            jLabel1 = new JLabel("Name");
            jLabel1.setBounds(40, 70, 60, 30);

            jTextFieldName = new JTextField();
            jTextFieldName.setFont(font);
            jTextFieldName.setBounds(150, 70, 250, 30);

            jLabel2 = new JLabel("Age");
            jLabel2.setBounds(40, 120, 100, 30);

            jTextFieldAge = new JTextField();
            jTextFieldAge.setFont(font);
            jTextFieldAge.setBounds(150, 120, 250, 30);

            jLabel3 = new JLabel("Gender");
            jLabel3.setBounds(40, 170, 140, 30);

            jTextFieldGender = new JTextField();
            jTextFieldGender.setFont(font);
            jTextFieldGender.setBounds(150, 170, 250, 30);

            jLabel4 = new JLabel("Disease");
            jLabel4.setBounds(40, 220, 180, 30);

            jTextFieldDiseases = new JTextField();
            jTextFieldDiseases.setFont(font);
            jTextFieldDiseases.setBounds(150, 220, 250, 30);

            jLabel5 = new JLabel("Date");
            jLabel5.setBounds(40, 270, 220, 30);

            jTextFieldExists = new JTextField();
            jTextFieldExists.setFont(font);
            jTextFieldExists.setBounds(150, 270, 250, 30);

            jLabel6 = new JLabel("Existing Disease");
            jLabel6.setBounds(40, 320, 260, 30);

            jTextFieldDate = new JTextField();
            jTextFieldDate.setFont(font);
            jTextFieldDate.setBounds(150, 320, 250, 30);


            jButtonSubmit = new JButton("Submit");
            jButtonSubmit.setBounds(180, 400, 100, 30);

            jFrame.setLayout(null);
            jFrame.setVisible(true);

            jFrame.add(jLabel);
            jFrame.add(jTextFieldId);
            jFrame.add(jLabel1);
            jFrame.add(jTextFieldName);
            jFrame.add(jLabel2);
            jFrame.add(jTextFieldGender);
            jFrame.add(jLabel3);
            jFrame.add(jTextFieldAge);
            jFrame.add(jTextFieldDate);
            jFrame.add(jLabel4);
            jFrame.add(jTextFieldDiseases);
            jFrame.add(jLabel5);
            jFrame.add(jTextFieldExists);
            jFrame.add(jLabel6);
            jFrame.add(jButtonSubmit);

            connectToDb();


        }

    public class Login extends HospitalDb implements ActionListener
    {

        public Login()
        {
            JFrame frame = new JFrame("Login");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // JPanel panel = new JPanel();
            //  frame.add(panel);

            frame.setLayout(null);
            frame.setVisible(true);

            JLabel userLabel = new JLabel("Username:");
            userLabel.setBounds(40, 20, 100, 30);
            JTextField userText = new JTextField();
            userText.setBounds(150, 20, 250, 30);

            JLabel passwordLabel = new JLabel("Password:");
            passwordLabel.setBounds(40, 60, 100, 30);
            JPasswordField passwordText = new JPasswordField();
            passwordText.setBounds(150, 60, 250, 30);

            JButton loginButton = new JButton("Login");
            loginButton.setBounds(150, 150, 100, 30);

            frame.add(userLabel);
            frame.add(userText);
            frame.add(passwordLabel);
            frame.add(passwordText);
            frame.add(loginButton);

            frame.setVisible(true);

        }

    }




    public void connectToDb() {
            try {
                //step 1 load the driver class
                Class.forName("com.mysql.cj.jdbc.Driver");

                //step 2 establish the connection
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb?useTimezone=true&serverTimezone=UTC",
                        "root", "");
                getData();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        public void getData() {
            try {

                //Step 3 create SQL queries
                stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

                //step 4 : execute sql query
                rs = stmt.executeQuery("select * from patient ");
                if (rs.next() == true) {
                    showData();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        public void showData() {
            try {
                jTextFieldId.setText(rs.getString(1));
                jTextFieldName.setText(rs.getString(2));
                jTextFieldAge.setText(rs.getString(3));
                jTextFieldGender.setText(rs.getString(4));
                jTextFieldDiseases.setText(rs.getString(5));
                jTextFieldDate.setText(rs.getString(6));
                jTextFieldExists.setText(rs.getString(7));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }


        @Override
        public void actionPerformed(ActionEvent e)
        {
            try {
                if (e.getSource() == jButtonSubmit)
                {
                    showData();

                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

}

