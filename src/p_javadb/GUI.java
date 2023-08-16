package p_javadb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

    public class GUI implements ActionListener
    {
        JFrame jFrame;
        JLabel jLabel, jLabel1, jLabel2, jLabel3;
        JTextField jTextFieldRno, jTextFieldName, jTextFieldCourse, jTextFieldFees, jTextField4;
        JButton jButtonFirst, jButtonNext, jButtonPrev, jButtonLast, jButtonNew, jButtonInsert, jButtonDelete, jButtonUpdate, jButtonSearch;
        Font font;
        Connection con;
        Statement stmt;
        ResultSet rs;

        public GUI(){
            font = new Font("Consolas", Font.BOLD, 20);
            jFrame = new JFrame();
            jFrame.setBounds(10, 10, 700, 500);
            jFrame.setTitle("Student Details");

            jLabel = new JLabel("Roll No.");
            jLabel.setBounds(40, 20, 60, 30);

            jTextFieldRno = new JTextField();
            jTextFieldRno.setFont(font);
            jTextFieldRno.setBounds(120, 20, 250, 30);


            jLabel1 = new JLabel("Name");
            jLabel1.setBounds(40, 70, 60, 30);

            jTextFieldName = new JTextField();
            jTextFieldName.setFont(font);
            jTextFieldName.setBounds(120, 70, 250, 30);

            jLabel2 = new JLabel("Course");
            jLabel2.setBounds(40, 120, 100, 30);

            jTextFieldCourse = new JTextField();
            jTextFieldCourse.setFont(font);
            jTextFieldCourse.setBounds(120, 120, 250, 30);


            jLabel3 = new JLabel("Fees");
            jLabel3.setBounds(40, 170, 100, 30);

            jTextFieldFees = new JTextField();
            jTextFieldFees.setFont(font);
            jTextFieldFees.setBounds(120, 170, 250, 30);

            jButtonFirst = new JButton("First");
            jButtonFirst.setBounds(40, 250, 100, 30);

            jButtonNext = new JButton("Next");
            jButtonNext.setBounds(160, 250, 100, 30);

            jButtonPrev = new JButton("Prev");
            jButtonPrev.setBounds(280, 250, 100, 30);

            jButtonLast = new JButton("Last");
            jButtonLast.setBounds(400, 250, 100, 30);

            jButtonNew = new JButton("New");
            jButtonNew.setBounds(40, 300, 100, 30);

            jButtonInsert = new JButton("Insert");
            jButtonInsert.setBounds(160, 300, 100, 30);

            jButtonDelete = new JButton("Delete");
            jButtonDelete.setBounds(280, 300, 100, 30);

            jButtonUpdate = new JButton("Update");
            jButtonUpdate.setBounds(400, 300, 100, 30);

            jTextField4 = new JTextField();
            jTextField4.setBounds(500, 20, 150, 30);


            jButtonSearch = new JButton("Search");
            jButtonSearch.setBounds(525, 70, 100, 30);


            jFrame.setLayout(null);
            jFrame.setVisible(true);

            jFrame.add(jLabel);
            jFrame.add(jTextFieldRno);
            jFrame.add(jLabel1);
            jFrame.add(jTextFieldName);
            jFrame.add(jLabel2);
            jFrame.add(jTextFieldCourse);
            jFrame.add(jLabel3);
            jFrame.add(jTextFieldFees);
            jFrame.add(jButtonFirst);
            jFrame.add(jButtonNext);
            jFrame.add(jButtonPrev);
            jFrame.add(jButtonLast);
            jFrame.add(jButtonNew);
            jFrame.add(jButtonInsert);
            jFrame.add(jButtonDelete);
            jFrame.add(jButtonUpdate);
            jFrame.add(jTextField4);
            jFrame.add(jButtonSearch);


            jButtonFirst.addActionListener(this);
            jButtonNext.addActionListener(this);
            jButtonLast.addActionListener(this);
            jButtonPrev.addActionListener(this);
            jButtonNew.addActionListener(this);
            jButtonInsert.addActionListener(this);
            jButtonDelete.addActionListener(this);
            jButtonSearch.addActionListener(this);
            jButtonUpdate.addActionListener(this);

            connectToDb();
        }

        public void insertData()
        {
            try
            {
                int rno;
                String name,course;
                float fee;

                rno = Integer.parseInt(jTextFieldRno.getText());
                name = jTextFieldName.getText();
                course = jTextFieldCourse.getText();
                fee = Float.parseFloat(jTextFieldFees.getText());

                String qry = "insert into student values(" + rno + ",'" + name + "','" + course + "'," + fee + ")";
                System.out.println(qry);

                int n =stmt.executeUpdate(qry);
                if(n>0)
                {
                    JOptionPane.showMessageDialog(jFrame, "Data inserted Successfully");
                    getData();
                }
                else
                {
                    JOptionPane.showMessageDialog(jFrame, "Data insertion Problem");
                }

            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }

        public void clearAll()
        {
            try
            {
                jTextFieldRno.setText("");
                jTextFieldName.setText("");
                jTextFieldCourse.setText("");
                jTextFieldFees.setText("");
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }

        public  void  connectToDb()
        {
            try
            {
                //step 1 load the driver class
                Class.forName("com.mysql.cj.jdbc.Driver");

                //step 2 establish the connection
                con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb?useTimezone=true&serverTimezone=UTC",
                        "root","");
                getData();
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }

        public  void getData() {
            try {

                //Step 3 create SQL queries
                stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

                //step 4 : execute sql query
                rs = stmt.executeQuery("select * from student ");
                if (rs.next() == true)
                {
                    showData();
                }
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }

        public void showData()
        {
            try
            {
                jTextFieldRno.setText(rs.getString(1));
                jTextFieldName.setText(rs.getString(2));
                jTextFieldCourse.setText(rs.getString(3));
                jTextFieldFees.setText(rs.getString(4));
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }

        public void updateData()
        {
                try
                {
                    int rno;
                    String name,course;
                    float fee;

                    rno = Integer.parseInt(jTextFieldRno.getText());
                    name = jTextFieldName.getText();
                    course = jTextFieldCourse.getText();
                    fee = Float.parseFloat(jTextFieldFees.getText());

                    String qry = "update student set name='"+name+"',course='"+course+"',fees=" +fee+ "where rno=" +rno;
                    System.out.println(qry);

                    int n =stmt.executeUpdate(qry);
                    if(n>0)
                    {
                        JOptionPane.showMessageDialog(jFrame, "Data updated Successfully");
                        getData();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(jFrame, "Data update Problem");
                     }

                }
                catch (Exception ex)
                {
                    ex.printStackTrace();
                }
        }

        public void search()
        {
            try
            {
                int rno=Integer.parseInt(jTextField4.getText());
                String q = "select * from student where rno =" + rno;
                ResultSet rs = stmt.executeQuery(q);
                if (rs.next()==true)
                {
                    jTextFieldRno.setText(rs.getString(1));
                    jTextFieldName.setText(rs.getString(2));
                    jTextFieldCourse.setText(rs.getString(3));
                    jTextFieldFees.setText(rs.getString(4));
                }
                else
                {
                    JOptionPane.showMessageDialog(jFrame, "no does not exist");
                }
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }

        public void deleteData()
        {
            try
            {
                int rno= Integer.parseInt(jTextFieldRno.getText());
                String q= "delete from student where rno = " +rno;
                int n = stmt.executeUpdate(q);

                if (n>0)
                {
                    JOptionPane.showMessageDialog(jFrame, "Data Deleted Successfully");
                    getData();
                }
                else
                {
                    JOptionPane.showMessageDialog(jFrame, "Data Deletion Error");
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }


        @Override
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                if(e.getSource() == jButtonFirst)
                {
                   if(rs.first()==true)
                   {
                       showData();
                   }
                }
                else if (e.getSource()==jButtonPrev)
                {
                    if (rs.previous()==true)
                    {
                        showData();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(jFrame, "First Record");
                    }
                }
                else if (e.getSource()==jButtonNext)
                {
                    if (rs.next()==true)
                    {
                        showData();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(jFrame, "Last Record");
                    }
                }
                else if (e.getSource()==jButtonLast)
                {
                    if (rs.last()==true)
                        {
                            showData();
                        }
                }
                else if (e.getSource()==jButtonNew)
                {
                    clearAll();
                }
                else if (e.getSource()==jButtonInsert)
                {
                    insertData();
                }
                else if (e.getSource()==jButtonDelete)
                {
                    deleteData();
                }
                else if (e.getSource()==jButtonSearch)
                {
                    search();
                }
                else if (e.getSource()==jButtonUpdate)
                {
                    updateData();
                }
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }

        }
    }
