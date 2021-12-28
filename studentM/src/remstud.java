
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.sql.*;
public class remstud{
	JFrame f1; 
	JLabel jl1,jl2,jl;
	JButton bu,bu1,back,close;
	JTextField jf,jf1,jf2;
	String sn="sameer";
	remstud(){
		
		
		f1=new JFrame();  

		f1.setLayout(null);  
		f1.setVisible(true);
		f1.setSize(700,500);  
	
		Font  fo  = new Font(Font.SANS_SERIF, Font.BOLD, 20);
		
		
		bu=new JButton("Enter ID");
		bu.setBounds(60,250,250, 50);
		bu.setBorderPainted(false);
		bu.setFocusPainted(false);
		bu.setFont(fo);
		bu.setBackground(Color.CYAN);
		
		
		bu1=new JButton("Enter Rollno");
		bu1.setBounds(360,250,250, 50);
		bu1.setBorderPainted(false);
		bu1.setFocusPainted(false);
		bu1.setFont(fo);
		bu1.setBackground(Color.CYAN);
		
		
		jl=new JLabel("Enter ID");
		jl.setBounds(150,50,250,50);
		jl.setFont(fo);
		
		jf=new JTextField();
		jf.setBounds(60,120,250, 50);
		jf.setFont(fo);
		
		jl1=new JLabel("OR");
		jl1.setBounds(320,180,250,50);
		jl1.setFont(fo);
		
		jl2=new JLabel("Enter rollno");
		jl2.setBounds(440,50,250,50);
		jl2.setFont(fo);
		
		jf1=new JTextField();
		jf1.setBounds(360,120,250, 50);
		jf1.setFont(fo);
		
		
		
		
		
		
		back=new JButton("<-BACK");
		back.setBounds(30,400,200,50);
		back.setBorderPainted(false);
		back.setFocusPainted(false);
		back.setFont(fo);
		back.setBackground(Color.lightGray);
		
		close=new JButton("CLOSE~");
		close.setBounds(460,400,200,50);
		close.setBorderPainted(false);
		close.setFocusPainted(false);
		close.setFont(fo);
		close.setBackground(Color.LIGHT_GRAY);
		
		f1.add(back);
		f1.add(close);
		f1.add(bu);
		f1.add(bu1);
		f1.add(jf);
		f1.add(jf1);
	
		f1.add(jl);
		f1.add(jl1);
		f1.add(jl2);
		
		
		f1.setLocationRelativeTo(null);
		f1.getContentPane().setBackground(Color.gray);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		
		
		
		bu.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			
			String sql ="DELETE FROM sinfo WHERE id ="+ "'"+jf.getText()+"'";
			//String sql="insert into sinfo values(3,'hitesh',5,70)";
			PreparedStatement stmt=c.prepareStatement(sql);
			stmt.execute();
			
			JOptionPane.showMessageDialog(f1,"STUDENT INFORMATION REMOVED");  
			
			//if(!c.isClosed())
	
			
		}
		catch(Exception el)
		{
			el.printStackTrace();
		}
				
				
			}  
			}); 
		

		back.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
		new admin1();
		f1.dispose();
				
			}  
			}); 
		
		

		
		bu1.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			
			String sql ="DELETE FROM sinfo WHERE rollno ="+ "'"+jf1.getText()+"'";
			//String sql="insert into sinfo values(3,'hitesh',5,70)";
			PreparedStatement stmt=c.prepareStatement(sql);
			stmt.execute();
			
			JOptionPane.showMessageDialog(f1,"STUDENT INFORMATION REMOVED");  
			
			//if(!c.isClosed())
	
			
		}
		catch(Exception el)
		{
			el.printStackTrace();
		}
				
				
			}  
			}); 
		
		close.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				f1.dispose();
				
			}  
			}); 

	
	}
	
	public static void main(String ar[])
	{
		new remstud();
	}
	

}
