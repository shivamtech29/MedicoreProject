
package medicore;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.text.ParseException;
import java.util.*;

public class addamb extends JFrame implements ActionListener {
    
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1,b2;
    
    public addamb(){
        super("MEDICORE - SHIVAM AGARWAL");
        setLayout(null);
        
        Color c= new Color(80,240,200);
        getContentPane().setBackground(Color.cyan);
        pack();
        
        l1 = new JLabel("Ambulance No. :");
        l2 = new JLabel("Driver :");
        l3 = new JLabel("Capacity :");
        t1 = new JTextField(10);
        t2 = new JTextField(30);
        t3 = new JTextField(1);
        b1 = new JButton("ADD NOW");
        b2 = new JButton("RETURN");
        
        l1.setBounds(40,50,150,30);
        add(l1);
        l2.setBounds(40,90,150,30);
        add(l2);
        l3.setBounds(40,130,150,30);
        add(l3);
        t1.setBounds(200,50,150,30);
        add(t1);
        t2.setBounds(200,90,150,30);
        add(t2);
        t3.setBounds(200,130,150,30);
        add(t3);
        b2.setBounds(40,180,120,30);
        add(b2);
        b1.setBounds(220,180,120,30);
        add(b1);
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setBackground(Color.black);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        setVisible(true);
        setSize(400,300);
        setLocation(400,200);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b2){
           new admin();
           setVisible(false);
       }
       if(e.getSource()==b1){
           try{
               conn c1 = new conn();
               String s1 = t1.getText();
               String s2 = t2.getText();
               String s3 = t3.getText();
               
               String str1 = "INSERT INTO ambulance values('"+s1+"','"+s2+"','"+s3+"')";
               c1.s.executeUpdate(str1);
               
               JFrame f= new JFrame();
               JOptionPane.showMessageDialog(f, "ADDED SUCCESSFULLY");
           }
           catch(Exception e1){
               System.out.print(e1);
           }
           
       }
    }
    public static void main(String[] args) throws ParseException {
        new addamb();
        
    }
}
