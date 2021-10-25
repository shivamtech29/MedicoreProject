      
package medicore;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.text.ParseException;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import static medicore.viewstaff.table;

public class Pview extends JFrame {
    static JTable table;
    
    String[] cols2 = {"ID","Name","DOB","Address","Phone"};
    String a,b,c,d,e;
    
    public Pview(){
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
                
                model.setColumnIdentifiers(cols2);
                str = "select * from patientreg";
                
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
                    model.addRow(new Object[]{a,b,c,d,e});
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
        new Pview();
    }
}
