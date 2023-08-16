package p_swing;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

// insert image on jframe
//
public class MyFrame extends JFrame
{
    private ImageIcon image;
    private JLabel label;
     MyFrame()
     {
//        jFrame=new JFrame();
//        jFrame.setBounds(20,20,300,500);
//        jFrame.setVisible(true);

         setLayout(new FlowLayout(20));
//         image = new ImageIcon(this.getClass().getResource("naruto-shippuden-ss1.jpg"));
//         label=new JLabel(image);
         add(label);
//        BufferedImage img = null;
//        try{
//            img= ImageIO.read(new File("naruto-shippuden-ss1.jpg"));
//
//        }catch (IOException e)
//        {
//            e.printStackTrace();
//        }
//        Image  dimg = img.getScaledInstance(jFrame.getWidth(),jFrame.getHeight(),Image.SCALE_SMOOTH);
    }

}
