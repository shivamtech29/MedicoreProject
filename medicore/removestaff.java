
package medicore;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class removestaff extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5;
    JTextField t1;
    JButton b1,b2;
    
    public removestaff(int t){
        super("MEDICORE - SHIVAM AGARWAL");
        setLayout(null);
        
        Color c= new Color(80,240,200);
        getContentPane().setBackground(Color.cyan);
        pack();
        
        l1 = new JLabel("ID FOR REMOVAL");
        l2 = new JLabel("NAME");
        l3 = new JLabel("1");
        l4 = new JLabel("ASSOCIATION");
        l5 = new JLabel("2");
        
        t1 = new JTextField();
        b1 = new JButton("REMOVE NOW");
        b1.addActionListener(this);
        b2 = new JButton("RETURN");
        b2.addActionListener(this);
        
        l1.setBounds(60,20,150,40);
        add(l1);
        t1.setBounds(210,22,150,30);
        add(t1);
        l2.setBounds(30,70,100,40);
        add(l2);
        l3.setBounds(140,70,100,40);
        add(l3);
        l4.setBounds(260,70,100,40);
        add(l4);
        l5.setBounds(370,70,100,40);
        add(l5);
        b1.setBounds(320,140,120,40);
        add(b1);
        b2.setBounds(50,140,100,40);
        add(b2);
        
        
        
        setVisible(true);
        setSize(500,300);
        setLocation(400,200);
        
    }
    
    
    
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==b2){
           new admin();
           setVisible(false);
       }
       if(e.getSource()==b1){
           //code to remove by id
           JFrame f= new JFrame();
           JOptionPane.showMessageDialog(f, "REMOVED SUCCESSFULLY");
       }
    }
    
    public static void main(String[] args) {
        new removestaff(0);
    }
}
