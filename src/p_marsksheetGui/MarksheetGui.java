package p_marsksheetGui;

import javax.swing.*;
import java.awt.*;
import java.math.*;

public class MarksheetGui
{
    JFrame jFrame;
    JTextField jtextfieldname,jtextfieldname1,jtextfieldname2,jtextfieldname3,jtextfieldname4,jtextfieldname5,jtextfieldname6;
    JLabel jLabelmath,jLabelchem,jLabelphy,jLabeleng,jLabelhindi,jLabeltotal,jlabelper;
    Font font;
    JButton jBtnOk;
    JButton jBtnClose;

    public MarksheetGui()
    {
        jFrame = new JFrame();
        jFrame.setBounds(20,20,800,600);
        font= new Font("Arial",Font.BOLD,20);
//        jFrame.getMaximizedBounds();
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

        jtextfieldname =new JTextField();
        jtextfieldname.setBounds(300,30,200,30);
        jtextfieldname.setFont(font);
        jtextfieldname.setColumns(10);

        jLabelmath =new JLabel("Math:");
        jLabelmath.setBounds(200,30,100,30);
        jLabelmath.setFont(font);


        jtextfieldname1 =new JTextField();
        jtextfieldname1.setBounds(300,90,200,30);
        jtextfieldname1.setFont(font);
        jtextfieldname1.setColumns(10);

        jLabelphy =new JLabel("Phy:");
        jLabelphy.setBounds(200,90,100,30);
        jLabelphy.setFont(font);

        jtextfieldname2 =new JTextField();
        jtextfieldname2.setBounds(300,150,200,30);
        jtextfieldname2.setFont(font);
        jtextfieldname2.setColumns(10);

        jLabelchem=new JLabel("Chem:");
        jLabelchem.setBounds(200,150,100,30);
        jLabelchem.setFont(font);

        jtextfieldname3 =new JTextField();
        jtextfieldname3.setBounds(300,210,200,30);
        jtextfieldname3.setFont(font);
        jtextfieldname3.setColumns(10);

        jLabeleng=new JLabel("Eng:");
        jLabeleng.setBounds(200,210,100,30);
        jLabeleng.setFont(font);

        jtextfieldname4 =new JTextField();
        jtextfieldname4.setBounds(300,270,200,30);
        jtextfieldname4.setFont(font);
        jtextfieldname4.setColumns(10);

        jLabelhindi=new JLabel("Hindi:");
        jLabelhindi.setBounds(200,270,100,30);
        jLabelhindi.setFont(font);

        jtextfieldname5 =new JTextField();
        jtextfieldname5.setBounds(300,330,200,30);
        jtextfieldname5.setFont(font);
        jtextfieldname5.setColumns(10);

        jLabeltotal=new JLabel("Total:");
        jLabeltotal.setBounds(200,330,100,30);
        jLabeltotal.setFont(font);

        jtextfieldname6 =new JTextField();
        jtextfieldname6.setBounds(300,390,200,30);
        jtextfieldname6.setFont(font);
        jtextfieldname6.setColumns(10);

        jlabelper=new JLabel("Per:");
        jlabelper.setBounds(200,390,100,30);
        jlabelper.setFont(font);


        jBtnOk=new JButton();
        jBtnOk.setText("Ok");
        jBtnOk.setFont(font);
        jBtnOk.setBounds(200,500,100,30);

        jBtnClose=new JButton();
        jBtnClose.setText("Close");
        jBtnClose.setFont(font);
        jBtnClose.setBounds(500,500,100,30);

        jFrame.add(jtextfieldname);
        jFrame.add(jLabelmath);
        jFrame.add(jLabelphy);
        jFrame.add(jtextfieldname1);
        jFrame.add(jtextfieldname2);
        jFrame.add(jtextfieldname3);
        jFrame.add(jtextfieldname4);
        jFrame.add(jtextfieldname5);
        jFrame.add(jtextfieldname6);
        jFrame.add(jLabelchem);
        jFrame.add(jLabeleng);
        jFrame.add(jLabelhindi);
        jFrame.add(jLabeltotal);
        jFrame.add(jlabelper);

        jFrame.add(jBtnClose);
        jFrame.add(jBtnOk);

        jFrame.setLayout(null);
        jFrame.setVisible(true);

    }

}
