//package p_hospitaldb;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//
//public class Login extends HospitalDb implements ActionListener
//{
//
//    public  Login()
//    {
//        JFrame frame = new JFrame("Login");
//        frame.setSize(400, 300);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//       // JPanel panel = new JPanel();
//      //  frame.add(panel);
//
//        frame.setLayout(null);
//        frame.setVisible(true);
//
//        JLabel userLabel = new JLabel("Username:");
//        userLabel.setBounds(40, 20, 100, 30);
//        JTextField userText = new JTextField();
//        userText.setBounds(150,20,250, 30);
//
//        JLabel passwordLabel = new JLabel("Password:");
//        passwordLabel.setBounds(40, 60, 100, 30);
//        JPasswordField passwordText = new JPasswordField();
//        passwordText.setBounds(150, 60, 250, 30);
//
//        JButton loginButton = new JButton("Login");
//        loginButton.setBounds(150,150,100,30);
//
//        frame.add(userLabel);
//        frame.add(userText);
//        frame.add(passwordLabel);
//        frame.add(passwordText);
//        frame.add(loginButton);
//
//        frame.setVisible(true);
//
//    }
//
//
//
//
//    @Override
//    public void actionPerformed(ActionEvent e)
//    {
//
//    }
//}
