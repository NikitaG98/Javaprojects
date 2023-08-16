package p_labelwithmanybuttons;

import javax.swing.*;
import java.awt.*;

public class LabelWithManyButtons extends JFrame
{
    JFrame jFrame;
    JTextField jTextField;
    JLabel jLabelname;
    Font font;
    JButton r,b,g,o;

    public LabelWithManyButtons()
    {

        jFrame = new JFrame();
        jFrame.setBounds(20,20,600,300);
        font= new Font("Arial",Font.BOLD,20);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

        jTextField = new JTextField(1);
        jTextField.setBounds(150, 50,300, 30);
        jTextField.setFont(font);


        jLabelname = new JLabel("Welcome to Binary Brains");
        jLabelname.setBounds(180, 20,500, 30);
        jLabelname.setFont(font);

        r=new JButton();
        r.setText("Red");
        r.setFont(font);
        r.setBounds(100,200,130,30);

        b=new JButton();
        b.setText("Blue");
        b.setFont(font);
        b.setBounds(200,200,130,30);

        g=new JButton();
        g.setText("Green");
        g.setFont(font);
        g.setBounds(300,200,130,30);

        o=new JButton();
        o.setText("Orange");
        o.setFont(font);
        o.setBounds(420,200,130,30);


        jFrame.add(jTextField);
        jFrame.add(jLabelname);
        jFrame.add(r);
        jFrame.add(b);
        jFrame.add(g);
        jFrame.add(o);


        jFrame.setLayout(null);
        jFrame.setVisible(true);

    }
}
