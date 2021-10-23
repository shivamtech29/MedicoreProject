
package medicore;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.text.ParseException;
import java.util.*;

public class addstaff extends JFrame implements ActionListener {
    
    JLabel name,dob,qual,spec,exp,doj,id,pas;
    JTextField t1,t2,t3,t4,t5,d1,d2;
    JPasswordField p1;
    JButton b1,b2;
    JRadioButton r1,r2;
    
    public addstaff(int t){
        super("MEDICORE - SHIVAM AGARWAL");
        setLayout(null);
        
        Color c= new Color(80,240,200);
        getContentPane().setBackground(Color.cyan);
        pack();
        
        name = new JLabel("NAME :");
        dob = new JLabel("Date Of Birth :");
        qual = new JLabel("Qualification :");
        spec = new JLabel("Specialization :");
        exp = new JLabel("Experience :");
        doj = new JLabel("Joining date :");
        id = new JLabel("New ID :");
        pas = new JLabel("Password :");
        
        t1 = new JTextField(30);
        d1 = new JTextField(10);
        t2 = new JTextField(50);
        t3 = new JTextField(40);
        t4 = new JTextField(2);
        d2 = new JTextField(10);
        t5 = new JTextField(15);
        p1 = new JPasswordField(15);
        
        b1 = new JButton("ADD STAFF");
        b2 = new JButton("RETURN");
        b1.addActionListener(this);
        b2.addActionListener(this);
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        
        name.setBounds(50,20,100,30);
        add(name);
        dob.setBounds(50,60,150,30);
        add(dob);
        qual.setBounds(50,100,120,30);
        add(qual);
        spec.setBounds(50,140,120,30);
        add(spec);
        exp.setBounds(50,180,120,30);
        add(exp);
        doj.setBounds(50,220,150,30);
        add(doj);
        id.setBounds(50,260,100,30);
        add(id);
        pas.setBounds(50,300,100,30);
        add(pas);
        
        t1.setBounds(210,20,200,30);
        add(t1);
        d1.setBounds(210,60,200,30);
        add(d1);
        t2.setBounds(210,100,200,30);
        add(t2);
        t3.setBounds(210,140,200,30);
        add(t3);
        t4.setBounds(210,180,200,30);
        add(t4);
        d2.setBounds(210,220,200,30);
        add(d2);
        t5.setBounds(210,260,200,30);
        add(t5);
        p1.setBounds(210,300,200,30);
        add(p1);
        if(t==1) {t3.setText("-----Not Applicable -----");t3.setEnabled(false);}
        
        r1.setBounds(70,340,100,30);
        r2.setBounds(230,340,100,30);
        ButtonGroup bg=new ButtonGroup();    
        bg.add(r1);
        bg.add(r2);
        add(r1);
        add(r2);
        b1.setBounds(280,400,120,30);
        add(b1);
        b2.setBounds(50,400,120,30);
        add(b2);
        
        
        setVisible(true);
        setSize(500,550);
        setLocation(400,200);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b2){
           new admin();
           setVisible(false);
       }
       if(e.getSource()==b1){
           //code to ADD TO DATABASE
           JFrame f= new JFrame();
           JOptionPane.showMessageDialog(f, "ADDED SUCCESSFULLY");
       }
    }
    public static void main(String[] args) throws ParseException {
        new addstaff(0);
        
    }
}
