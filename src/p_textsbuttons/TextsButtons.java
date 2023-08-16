package p_textsbuttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Calculator using swing jframe
//
public class TextsButtons implements ActionListener
{
    JFrame jFrame;
    JTextField jtextfieldname;
    JTextField jtextfieldname1;
    JTextField jtextfieldname2;
    Font font;
    JButton jBtnAdd;
    JButton jBtnSub;
    JButton jBtnMul;
    JButton jBtnDiv;
    JButton jBtnClear;

    public TextsButtons()
    {
        jFrame = new JFrame();
        jFrame.setBounds(20,20,800,600);
        font= new Font("Arial",Font.BOLD,20);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

        jtextfieldname =new JTextField();
        jtextfieldname.setBounds(250,20,100,30);
        jtextfieldname.setFont(font);
        jtextfieldname.setColumns(10);

        jtextfieldname1 =new JTextField();
        jtextfieldname1.setBounds(500,20,100,30);
        jtextfieldname1.setFont(font);
        jtextfieldname1.setColumns(10);

        jtextfieldname2 =new JTextField();
        jtextfieldname2.setBounds(800,20,100,30);
        jtextfieldname2.setFont(font);
        jtextfieldname2.setColumns(10);

        jBtnAdd=new JButton();
        jBtnAdd.setText("Add");
        jBtnAdd.setFont(font);
        jBtnAdd.setBounds(300,100,100,30);
        jBtnAdd.addActionListener(this);

        jBtnSub=new JButton();
        jBtnSub.setText("Sub");
        jBtnSub.setFont(font);
        jBtnSub.setBounds(400,100,100,30);
        jBtnSub.addActionListener(this);

        jBtnMul=new JButton();
        jBtnMul.setText("Mul");
        jBtnMul.setFont(font);
        jBtnMul.setBounds(500,100,100,30);
        jBtnMul.addActionListener(this);

        jBtnDiv=new JButton();
        jBtnDiv.setText("Div");
        jBtnDiv.setFont(font);
        jBtnDiv.setBounds(600,100,100,30);
        jBtnDiv.addActionListener(this);

        jBtnClear=new JButton();
        jBtnClear.setText("Clear");
        jBtnClear.setFont(font);
        jBtnClear.setBounds(700,100,100,30);
        jBtnClear.addActionListener(this);

        jFrame.add(jtextfieldname);
        jFrame.add(jtextfieldname1);
        jFrame.add(jtextfieldname2);
        jFrame.add(jBtnAdd);
        jFrame.add(jBtnSub);
        jFrame.add(jBtnMul);
        jFrame.add(jBtnDiv);
        jFrame.add(jBtnClear);

        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        int x, y, z;
        try {
            if (e.getSource() == jBtnAdd)
            {
                x = Integer.parseInt(jtextfieldname.getText());
                y = Integer.parseInt(jtextfieldname1.getText());
                z = x + y;
                jtextfieldname2.setText(String.valueOf(z));
            }
            else if (e.getSource() == jBtnSub)
            {

                x = Integer.parseInt(jtextfieldname.getText());
                y = Integer.parseInt(jtextfieldname1.getText());
                z = x - y;
                jtextfieldname2.setText(String.valueOf(z));

            }
            else if (e.getSource()==jBtnMul)
            {
                x = Integer.parseInt(jtextfieldname.getText());
                y = Integer.parseInt(jtextfieldname1.getText());
                z = x * y;
                jtextfieldname2.setText(String.valueOf(z));
            }
            else if (e.getSource()==jBtnDiv)
            {
                x = Integer.parseInt(jtextfieldname.getText());
                y = Integer.parseInt(jtextfieldname1.getText());
                z = x / y;
                jtextfieldname2.setText(String.valueOf(z));

            }
            else if (e.getSource() == jBtnClear)
            {
                jtextfieldname2.setText("");
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();

        }
    }
}
