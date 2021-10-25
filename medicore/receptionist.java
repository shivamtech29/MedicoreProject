
package medicore;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.text.ParseException;
import java.util.*;

public class receptionist extends JFrame implements ActionListener {
    
    JRadioButton r1,r2;
    JButton b1,b2,b3;
    
    public receptionist(){
        super("MEDICORE - SHIVAM AGARWAL");
        setLayout(null);
        
        Color c= new Color(80,240,200);
        getContentPane().setBackground(Color.cyan);
        pack();
        
        r1 = new JRadioButton("Patient");
        r2 = new JRadioButton("Appointment");
        b1 = new JButton("Registration");
        b2 = new JButton("View Info");
        b3 = new JButton("Logout");
        
        r1.setBounds(50,20,120,30);
        r2.setBounds(50,60,120,30);
        ButtonGroup bg=new ButtonGroup();    
        bg.add(r1);
        bg.add(r2);
        add(r1);
        add(r2);
        b1.setBounds(180,20,120,30);
        add(b1);
        b2.setBounds(180,60,120,30);
        add(b2);
        b3.setBounds(125,120,90,30);
        add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.setBackground(Color.black);
        r1.setForeground(Color.white);
        r1.setBackground(Color.black);
        r2.setForeground(Color.white);
        r2.setBackground(Color.black);
        
        setVisible(true);
        setSize(350,250);
        setLocation(400,200);
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b3){
           new Login();
           setVisible(false);
       }
        if(e.getSource()==b1){
           if(r1.isSelected()){
               new Pregister();
               setVisible(false);
           }
           else if(r2.isSelected()){
               new Aregister();
               setVisible(false);
           }
       }
        if(e.getSource()==b2){
           if(r1.isSelected()){
               new Pview();
               
           }
           else if(r2.isSelected()){
               new Aview();
               
           }
           
       }
    }
    public static void main(String[] args) throws ParseException {
        new receptionist();
        
    }
}
