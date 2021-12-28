import java.awt.*; 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.sql.*;
public class admin1 {
	JFrame f1; 
	JLabel jl1,jl2;
	JButton bu,bu1,bu2,back,close,bu3;
String sn="sameer";
	admin1(){
		
		
		f1=new JFrame();  

		f1.setLayout(null);  
		f1.setVisible(true);
		f1.setSize(500,600);  
	
		Font  fo  = new Font(Font.SANS_SERIF,  Font.BOLD, 20);
		
		bu=new JButton("ADD STUDENT");
		bu.setBounds(f1.getWidth()/2-125,100,250, 50);
		bu.setBorderPainted(false);
		bu.setFocusPainted(false);
		bu.setFont(fo);
		bu.setBackground(Color.white);
		

		
		bu2=new JButton("REMOVE STUDENT");
		bu2.setBounds(f1.getWidth()/2-125,300,250, 50);
		bu2.setBorderPainted(false);
		bu2.setFocusPainted(false);
		bu2.setFont(fo);
		bu2.setBackground(Color.white);
		
	
		
		
		back=new JButton("<-BACK");
		back.setBounds(10,410,120,50);
		back.setBorderPainted(false);
		back.setFocusPainted(false);
		back.setFont(fo);
		back.setBackground(Color.lightGray);
		
		close=new JButton("CLOSE~");
		close.setBounds(360,410,120,50);
		close.setBorderPainted(false);
		close.setFocusPainted(false);
		close.setFont(fo);
		close.setBackground(Color.LIGHT_GRAY);


	f1.add(bu);

	f1.add(bu2);
	f1.add(back);
	f1.add(close);
	
	f1.setLocationRelativeTo(null);
	f1.getContentPane().setBackground(Color.gray);
	f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	bu.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
/*	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		Statement stmt=c.createStatement();
		String sql ="Select * from sinfo where name='"+sn+"'";
		//String sql="insert into sinfo values(3,'hitesh',5,70)";
		ResultSet rs=stmt.executeQuery(sql);
	
		
		//if(!c.isClosed())
	while(rs.next())
	{
		
		System.out.print(rs.getString("rollno")+" "+rs.getString("id"));	
		
	}
		c.close();
	}
	catch(Exception el)
	{
		el.printStackTrace();
	}
			
	*/
			new addstud();
			f1.dispose();
			
			
		}  
		}); 
	
	
	
	bu2.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
			
			new remstud();
			f1.dispose();
			}  
			}); 
	


	back.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
	new admin();
	f1.dispose();
			
		}  
		}); 
	
	close.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
			f1.dispose();
			
		}  
		}); 
	
	}
	public static void main(String[] args) {
		new admin1();

	}

}
