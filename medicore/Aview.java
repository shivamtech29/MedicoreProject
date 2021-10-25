       
package medicore;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.text.ParseException;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import static medicore.Pview.table;

public class Aview extends JFrame implements ActionListener{
    JFrame frm = new JFrame();
    static JTable table;
    JPanel j1;
    JButton b1;
    JTextField t1;
    JLabel l1;
    String[] cols2 = {"ID","Token","Issue","Description","BillAmt","Details"};
    String a,b,c,d,e,f;
    
    public Aview(){
        l1 = new JLabel("Enter Date :");
        t1 = new JTextField(10);
        b1 = new JButton("Fetch");
        l1.setBounds(10,10,80,30);
        t1.setBounds(100,10,80,30);
        b1.setBounds(300,10,80,30);
        b1.addActionListener(this);
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        
        showdata();
        
    }
    
    public void showdata(){
        
        
        JPanel j1;
        j1 = new JPanel();
        
        frm.add(j1,BorderLayout.NORTH);
        j1.add(l1);
        j1.add(t1);
        j1.add(b1);
        
        try{
                
                conn c1 = new conn();
                
                DefaultTableModel model = new DefaultTableModel();
                
                String str;
                String dt = t1.getText();
                model.setColumnIdentifiers(cols2);
                str = "select * from appointment where Date='"+dt+"'";
                
                table = new JTable();
                table.setModel(model);
                table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                table.setFillsViewportHeight(true);
                
                ResultSet rs = c1.s.executeQuery(str);
                
                while(rs.next()){
                    a=rs.getString(1);
                    
                    b=rs.getString(2);
                    c=rs.getString(3);
                    d=rs.getString(4);
                    e=rs.getString(5);
                    f=rs.getString(6);
                    model.addRow(new Object[]{a,b,c,d,e,f});
                }
            }
                
            
            catch(Exception e1){
                System.out.println(e);
            }
        
        JScrollPane scroll = new JScrollPane(table);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                
        frm.add(scroll);
        frm.setVisible(true);
        frm.setSize(600,500);
        frm.setLocation(500,200);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e5){
        if(e5.getSource()==b1){
            showdata();
        }
    }
    
    public static void main(String[] args) throws ParseException {
        new Aview();
    }
}
