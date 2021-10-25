
package medicore;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.text.ParseException;
import java.util.*;

public class Pregister extends JFrame implements ActionListener {
    
    JButton b1,b2;
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4,t5;
    
    public Pregister(){
        super("MEDICORE - SHIVAM AGARWAL");
        setLayout(null);
        
        Color c= new Color(80,240,200);
        getContentPane().setBackground(Color.cyan);
        pack();
        
        l1 = new JLabel("Name");
        l2 = new JLabel("DOB");
        l3 = new JLabel("Address");
        l4 = new JLabel("Phone No");
        l5 = new JLabel("ID *auto*");
        
        t1 = new JTextField();
        t2 = new JTextField(10);
        t3 = new JTextField();
        t4 = new JTextField(10);
        t5 = new JTextField();
        
        b1 = new JButton("Register");
        b2 = new JButton("Return");
        
        l1.setBounds(30,30,100,40);
        add(l1);
        l2.setBounds(30,80,100,40);
        add(l2);
        l3.setBounds(30,130,100,40);
        add(l3);
        l4.setBounds(30,180,100,40);
        add(l4);
        l5.setBounds(30,230,100,40);
        add(l5);
        t1.setBounds(140,30,150,40);
        add(t1);
        t2.setBounds(140,80,150,40);
        add(t2);
        t3.setBounds(140,130,150,40);
        add(t3);
        t4.setBounds(140,180,150,40);
        add(t4);
        t5.setBounds(140,230,150,40);
        add(t5);
        b2.setBounds(40,290,100,30);
        add(b2);
        b1.setBounds(160,290,100,30);
        add(b1);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setBackground(Color.black);
        
        setVisible(true);
        setSize(350,400);
        setLocation(400,200);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b2){
           new receptionist();
           setVisible(false);
       }
        if(e.getSource()==b1){
           try{
               conn c1 = new conn();
               
               String s1 = t1.getText();
               String s2 = t2.getText();
               String s3 = t3.getText();
               String s4 = t4.getText();
               String str = "select count(*) from patientreg";
               ResultSet rs = c1.s.executeQuery(str);
      
               rs.next();
               int count = rs.getInt(1);
               String s5 = "MdP"+(count+1);
               
               t5.setText(s5);
               
               String str1 = "INSERT INTO patientreg values('"+s5+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"')";
               c1.s.executeUpdate(str1);
               
               JFrame f= new JFrame();
               JOptionPane.showMessageDialog(f, "Registered Successfully");
           }
           catch(Exception e1){
               System.out.print(e1);
           }
           
       }
    }
    public static void main(String[] args) throws ParseException {
        new Pregister();
        
    }
}
