
package medicore;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.ParseException;
import java.util.*;

public class viewstaff extends JFrame{
    static JTable table;
    String[] cols1 = {"ID","Name","Type","Qualification","Specialization","DOB","DOJ","Experience","Gender"};
    String[] cols2 = {"VehicleID","Driver","Capacity"};
    String from;
    int t0;
    String a,b,c,d,e,f,g,h,i,j;
    
    public viewstaff(int t){
        t0=t;
        showdata();
        
    }
    
    
    public void showdata(){
        JFrame frm = new JFrame();
        
        Color c4= new Color(80,240,200);
        frm.getContentPane().setBackground(Color.cyan);
        frm.pack();
        
        try{
                
                conn c1 = new conn();
                
                DefaultTableModel model = new DefaultTableModel();
                
                String str="";
                if(t0==1){
                    model.setColumnIdentifiers(cols1);
                    String ab = "Receptionist";
                    str = "select * from staff where Type='"+ab+"'";
                }
                else if(t0==2){
                    model.setColumnIdentifiers(cols1);
                    String ab = "Doctor";
                    str = "select * from staff where Type='"+ab+"'";
                }
                else{
                    model.setColumnIdentifiers(cols2);
                    str = "select * from ambulance";
                }
                table = new JTable();
                table.setModel(model);
                table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                table.setFillsViewportHeight(true);
                
                ResultSet rs = c1.s.executeQuery(str);
                if(t0!=3){
                    while(rs.next()){
                        a=rs.getString(1);
                        b=rs.getString(2);
                        c=rs.getString(3);
                        d=rs.getString(4);
                        e=rs.getString(5);
                        f=rs.getString(6);
                        g=rs.getString(7);
                        h=rs.getString(8);
                        i=rs.getString(9);
                        j=rs.getString(10);
                        model.addRow(new Object[]{a,c,d,e,f,g,h,i,j});
                    }
                }
                else{
                    while(rs.next()){
                        a=rs.getString(1);
                        b=rs.getString(2);
                        c=rs.getString(3);
                        model.addRow(new Object[]{a,b,c});
                    }
                
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
    
    public static void main(String[] args) throws ParseException {
        new viewstaff(1);
    }
}
