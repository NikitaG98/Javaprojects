package p_labelButton;

import javax.swing.*;
import java.awt.*;

public class LabelButton
{
    JFrame jFrame;
    JTextField jtextfieldname;
    JTextField jtextfieldname1;
    Font font;
    JButton jButtoncopy;
    JButton jButtoncopy1;

    public  LabelButton()
    {
        jFrame = new JFrame();
        jFrame.setBounds(20,20,300,300);
        font= new Font("Arial",Font.BOLD,20);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

        jtextfieldname =new JTextField();
        jtextfieldname.setBounds(250,20,200,30);
        jtextfieldname.setFont(font);
        jtextfieldname.setColumns(10);

        jtextfieldname1 =new JTextField();
        jtextfieldname1.setBounds(460,20,200,30);
        jtextfieldname1.setFont(font);
        jtextfieldname1.setColumns(10);

        jButtoncopy=new JButton();
        jButtoncopy.setText("Copy");
        jButtoncopy.setFont(font);
        jButtoncopy.setBounds(300,70,100,30);

        jButtoncopy1=new JButton();
        jButtoncopy1.setText("Clear");
        jButtoncopy1.setFont(font);
        jButtoncopy1.setBounds(510,70,100,30);

        jFrame.add(jtextfieldname);
        jFrame.add(jtextfieldname1);
        jFrame.add(jButtoncopy);
        jFrame.add(jButtoncopy1);

        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }

}
