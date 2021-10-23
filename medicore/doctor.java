
package medicore;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.text.ParseException;
import java.util.*;

public class doctor extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JTextField t1,t2,t3,t4,t5,t6;
    JButton b1,b2,b3;
    
    public doctor(){
        super("MEDICORE - SHIVAM AGARWAL");
        setLayout(null);
        
        Color c= new Color(80,240,200);
        getContentPane().setBackground(Color.cyan);
        pack();
        
        l1 = new JLabel("Hello DOCTOR");
        l2 = new JLabel("Bill No. :");
        l3 = new JLabel("Patient ID :");
        l4 = new JLabel("Charges Applicable :");
        l5 = new JLabel("Fee :");
        l6 = new JLabel("Services :");
        l7 = new JLabel("Other :");
        l8 = new JLabel("Description :");
        l9 = new JLabel("");
        l10 = new JLabel("");
        
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t4 = new JTextField(10);
        t5 = new JTextField(10);
        t6 = new JTextField(100);
        t3.setText("0");
        t4.setText("0");
        t5.setText("0");
        
        b3 = new JButton("Calculate");
        b2 = new JButton("LOGOUT");
        b1 = new JButton("Finalize");
        
        l1.setBounds(20,20,150,30);
        add(l1);
        l10.setBounds(150,20,150,30);
        add(l10);
        l2.setBounds(50,70,150,30);
        add(l2);
        l3.setBounds(50,110,150,30);
        add(l3);
        l4.setBounds(50,150,150,30);
        add(l4);
        l5.setBounds(50,190,100,30);
        add(l5);
        l6.setBounds(280,190,100,30);
        add(l6);
        l7.setBounds(50,220,100,30);
        add(l7);
        l8.setBounds(280,220,120,30);
        add(l8);
        
        t1.setBounds(220,70,150,30);
        add(t1);
        t2.setBounds(220,110,150,30);
        add(t2);
        t3.setBounds(150,190,100,30);
        add(t3);
        t4.setBounds(380,190,100,30);
        add(t4);
        t5.setBounds(150,230,100,30);
        add(t5);
        t6.setBounds(380,230,100,30);
        add(t6);
        l9.setBounds(220,290,100,30);
        add(l9);
        b1.setBounds(50,290,100,30);
        add(b1);
        b2.setBounds(420,290,100,30);
        add(b2);
        b3.setBounds(300,290,100,30);
        add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        setVisible(true);
        setSize(550,400);
        setLocation(400,200);
        
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b2){
           new Login();
           setVisible(false);
       }
       if(e.getSource()==b1){
           //code to ADD TO DATABASE
           if(!l9.getText().equals("")&&!l9.getText().equals("0.0")){
           JFrame f= new JFrame();
           JOptionPane.showMessageDialog(f, "Bill Added");}
       }
       if(e.getSource()==b3){
           String a1=t3.getText();
           String a2=t4.getText();
           String a3=t5.getText();
           int z1=Integer.parseInt(a1);
           int z2=Integer.parseInt(a2);
           int z3=Integer.parseInt(a3);
           int z=z1+z2+z3;
           String zs=String.valueOf(z);
           l9.setText(zs+".0");
       }
       
    }
    public static void main(String[] args) throws ParseException {
        new doctor();
        
    }
}
