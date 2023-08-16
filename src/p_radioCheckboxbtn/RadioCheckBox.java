package p_radioCheckboxbtn;

import javax.swing.*;
import java.awt.*;

public class RadioCheckBox
{
    JFrame jFrame;
    JLabel jLabelname;
    Font font;
    JRadioButton red,green,yellow,blue;
    JCheckBox bold,italic;
    JButton jButtonsubmit;

    public RadioCheckBox()
    {

        jFrame = new JFrame();
        jFrame.setBounds(20,20,300,300);
        font= new Font("Arial",Font.BOLD,20);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

        jLabelname = new JLabel("Welcome to Java Programming");
        jLabelname.setBounds(30, 30,400, 30);
        jLabelname.setFont(font);

        red=new JRadioButton("RED");
        red.setBounds(30, 80,150, 30);
        red.setFont(font);

        green=new JRadioButton("GREEN");
        green.setBounds(30, 150,150, 30);
        green.setFont(font);

        yellow=new JRadioButton("YELLOW");
        yellow.setBounds(30, 220,150, 30);
        yellow.setFont(font);

        blue=new JRadioButton("BLUE");
        blue.setBounds(30, 290,150, 30);
        blue.setFont(font);

        bold = new JCheckBox("BOLD");
        bold.setBounds(200, 80,100, 30);
        bold.setFont(font);

        italic = new JCheckBox("ITALIC");
        italic.setBounds(200, 150,100, 30);
        italic.setFont(font);


        jButtonsubmit=new JButton();
        jButtonsubmit.setText("Submit");
        jButtonsubmit.setFont(font);
        jButtonsubmit.setBounds(600,500,100,30);


        jFrame.add(jLabelname);
        jFrame.add(red);
        jFrame.add(green);
        jFrame.add(yellow);
        jFrame.add(blue);
        jFrame.add(bold);
        jFrame.add(italic);
        jFrame.add(jButtonsubmit);

        jFrame.setLayout(null);
        jFrame.setVisible(true);

    }
}
