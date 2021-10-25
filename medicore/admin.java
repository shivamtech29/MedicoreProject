
package medicore;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class admin extends JFrame implements ActionListener {
    
    JLabel l1,l2,l3,l4;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,bl;
    Font f1,f2;
    
    public admin(){
        super("MEDICORE - SHIVAM AGARWAL");
        f1 = new Font("Times New Roman",Font.BOLD,20);
        f2 = new Font("Arial",Font.BOLD,20);
        
        setLayout(null);
        
        Color c= new Color(80,240,200);
        getContentPane().setBackground(Color.cyan);
        pack();
        
        l1 = new JLabel("ADMIN PANEL SERVICES");
        l1.setFont(f1);
        l2 = new JLabel("RECEPTIONIST");
        l2.setFont(f2);
        l3 = new JLabel("DOCTOR");
        l3.setFont(f2);
        l4 = new JLabel("AMBULANCE");
        l4.setFont(f2);
        
        b1 = new JButton("ADD NEW");
        b2 = new JButton("VIEW ALL");
        b3 = new JButton("REMOVE");
        b4 = new JButton("ADD NEW");
        b5 = new JButton("VIEW ALL");
        b6 = new JButton("REMOVE");
        b7 = new JButton("ADD NEW");
        b8 = new JButton("VIEW ALL");
        b9 = new JButton("REMOVE");
        bl = new JButton("LOGOUT");
        
        l1.setBounds(150,20 , 400, 40);
        add(l1);
        l2.setBounds(60,80 , 150, 40);
        add(l2);
        l3.setBounds(250,80 , 150, 40);
        add(l3);
        l4.setBounds(390,80 , 150, 40);
        add(l4);
        
        b1.setBounds(60,140 , 100, 30);
        add(b1);
        b2.setBounds(60,200 , 100, 30);
        add(b2);
        b3.setBounds(60,260 , 100, 30);
        add(b3);
        b4.setBounds(250,140 , 100,30);
        add(b4);
        b5.setBounds(250,200 , 100,30);
        add(b5);
        b6.setBounds(250,260 , 100,30);
        add(b6);
        b7.setBounds(420,140 , 100, 30);
        add(b7);
        b8.setBounds(420,200 , 100, 30);
        add(b8);
        b9.setBounds(420,260 , 100, 30);
        add(b9);
        bl.setBounds(450,350 , 100, 30);
        add(bl);
        
        bl.addActionListener(this);
        b1.addActionListener(this);
        b4.addActionListener(this);
        b7.addActionListener(this);
        b2.addActionListener(this);
        b5.addActionListener(this);
        b8.addActionListener(this);
        b3.addActionListener(this);
        b6.addActionListener(this);
        b9.addActionListener(this);
        
        setVisible(true);
        setSize(600,450);
        setLocation(400,200);
        
    }
    
    
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==bl){
           new Login();
           setVisible(false);
       }
       if(e.getSource()==b1){
           new addstaff(1);
           setVisible(false);
       }
       if(e.getSource()==b4){
           new addstaff(2);
           setVisible(false);
       }
       if(e.getSource()==b7){
           new addamb();
           setVisible(false);
       }
       if(e.getSource()==b3){
           new removestaff(1);
           setVisible(false);
       }
       if(e.getSource()==b6){
           new removestaff(2);
           setVisible(false);
       }
       if(e.getSource()==b9){
           new removestaff(3);
           setVisible(false);
       }
       if(e.getSource()==b2){
           new viewstaff(1);
           
       }
       if(e.getSource()==b5){
           new viewstaff(2);
           
       }
       if(e.getSource()==b8){
           new viewstaff(3);
           
       }
    }
    
    public static void main(String[] args) {
        new admin();
    }
}
