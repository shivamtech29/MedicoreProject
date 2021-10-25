
package medicore;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.text.ParseException;

import java.text.*;

public class Aregister extends JFrame implements ActionListener {
    
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1,b2;
    JComboBox cb;
    
    public Aregister(){
        super("MEDICORE - SHIVAM AGARWAL");
        setLayout(null);
        
        Color c= new Color(80,240,200);
        getContentPane().setBackground(Color.cyan);
        pack();
        
        l1 = new JLabel("ID");
        l2 = new JLabel("Type Of Issue");
        l3 = new JLabel("Details if any");
        t1 = new JTextField();
        String[] types = {"Normal","Consultancy","Emergency"};
        cb = new JComboBox(types);
        t2 = new JTextField();
        b1 = new JButton("Register");
        b2 = new JButton("RETURN");
        
        l1.setBounds(30,30,100,30);
        add(l1);
        l2.setBounds(30,70,150,30);
        add(l2);
        l3.setBounds(30,110,150,30);
        add(l3);
        t1.setBounds(190,30,150,30);
        add(t1);
        cb.setBounds(190,70,150,30);
        add(cb);
        t2.setBounds(190,110,150,30);
        add(t2);
        b2.setBounds(40,150,100,30);
        b1.setBounds(200,150,100,30);
        add(b1);
        add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setBackground(Color.black);
        
        setVisible(true);
        setSize(450,250);
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
               SimpleDateFormat formDate = new SimpleDateFormat("dd/MM/yyyy");
               String s3 = formDate.format(System.currentTimeMillis());
               
               String str = "select count(*) from appointment where Date='"+s3+"'";
               ResultSet rs = c1.s.executeQuery(str);
      
               rs.next();
               int count = rs.getInt(1);
               
               String s2 = s3.substring(0, 2) + s3.substring(3,5) + (count+1);
               
               String s4 = (String)cb.getSelectedItem();
               String s5 = t2.getText();
               String s6="0";
               String str1 = "INSERT INTO appointment values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s6+"')";
               c1.s.executeUpdate(str1);
               
               String msg = "Token : " + s2;
               JFrame f= new JFrame();
               JOptionPane.showMessageDialog(f, msg);
               
           }
           catch(Exception e1){
               System.out.print(e1);
           }
           
        }
    }
    public static void main(String[] args) throws ParseException {
        new Aregister();
        
    }
}
