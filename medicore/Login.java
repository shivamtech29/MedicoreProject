
package medicore;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;


public class Login extends JFrame implements ActionListener {
    
    
    
    JLabel l1,l2,l3,l4;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;
    GridBagLayout gbl;
    GridBagConstraints gbc;
    Font f1,f2;
    JComboBox cb;
    
    
    public Login(){
        
        super("MEDICORE - SHIVAM AGARWAL");
        
        setLayout(null);
        f1 = new Font("Times New Roman",Font.BOLD,20);
        f2 = new Font("Arial",Font.BOLD,20);
        
        /*gbl = new GridBagLayout();
        gbc = new GridBagConstraints();*/
        
        Color c= new Color(80,240,200);
        getContentPane().setBackground(Color.cyan);
        pack();
        
        String[] types = {"Admin","Receptionist","Doctor"};
        cb = new JComboBox(types);
        
        l1 = new JLabel("MEDICORE HOSPITAL MANAGEMENT");
        l1.setFont(f1);
        l2 = new JLabel("USERNAME :");
        l2.setFont(f2);
        l3 = new JLabel("PASSWORD :");
        l3.setFont(f2);
        l4 = new JLabel("TYPE OF LOGIN :");
        l4.setFont(f2);
        t1 = new JTextField(15);
        t2 = new JPasswordField(15);
        cb.setFont(f2);
        
        b1 = new JButton("ENTER SYSTEM NOW");
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        b2 = new JButton("CLEAR");
        b2.setForeground(Color.white);
        b2.setBackground(Color.black);
        
        l1.setBounds(100, 30, 400, 40);
        add(l1);
        l2.setBounds(70, 90, 150, 40);
        add(l2);
        l3.setBounds(70, 140, 150, 40);
        add(l3);
        l4.setBounds(70, 190, 200, 40);
        add(l4);
        t1.setBounds(300, 90, 180, 30);
        add(t1);
        t2.setBounds(300, 140, 180, 30);
        add(t2);
        cb.setBounds(300, 190, 180, 30);
        add(cb);
        b1.setBounds(80, 240, 200, 30);
        add(b1);
        b2.setBounds(80, 300, 100, 30);
        add(b2);
        
        b2.addActionListener(this);
        b1.addActionListener(this);

        
        setVisible(true);
        setSize(600,400);
        setLocation(400,200);
        
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b2){
            t1.setText("");
            t2.setText("");
            
        }
        if(e.getSource()==b1){
            
            try{
                conn c1 = new conn();
                String s1 = t1.getText();
                String s2 = new String(t2.getPassword());
                String s3 = (String)cb.getSelectedItem();
                String str = "select * from staff where ID='"+s1+"' and Password='"+s2+"' and Type = '"+s3+"'";
                ResultSet rs = c1.s.executeQuery(str);
                
                if(rs.next()){
                    if(s3.equals("Admin")){
                        setVisible(false);
                        new admin();
                    }
                    if(s3.equals("Doctor")){
                        setVisible(false);
                        new doctor();
                    }
                    if(s3.equals("Receptionist")){
                        setVisible(false);
                        new receptionist();
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid Credentials");
                }
            }
            catch(Exception e1){
                System.out.print(e1);
            }
            
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }

}
