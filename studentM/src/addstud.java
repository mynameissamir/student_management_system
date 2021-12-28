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
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.sql.*;

public class addstud {
	
	JFrame f1; 
	JLabel id,name,rollno,score,grade;
	JButton bu,bu1,bu3,bu4,bu5,back,close;
	JTextField jf,jf1,jf2,jf3,jf4,jf5;

	addstud(){
		
		f1=new JFrame();  

		f1.setLayout(null);  
		f1.setVisible(true);
		f1.setSize(700,700);  
	
		Font  fo  = new Font(Font.SANS_SERIF,  Font.BOLD, 20);

	id=new JLabel("ENTER ID:");
	id.setBounds(100, 150,200,50);
	id.setFont(fo);
	
	name=new JLabel("ENTER NAME:");
	name.setBounds(100, 220,200,50);
	name.setFont(fo);
	
	rollno=new JLabel("ENTER ROLLNO:");
	rollno.setBounds(100, 290,200,50);
	rollno.setFont(fo);
	
	score=new JLabel("ENTER SCORE:");
	score.setBounds(100, 360,200,50);
	score.setFont(fo);
	
	grade=new JLabel("ENTER GRADE:");
	grade.setBounds(100, 430,200,50);
	grade.setFont(fo);
	
	jf=new JTextField();
	jf.setBounds(300,150,250, 50);
	jf.setFont(fo);
	
	jf1=new JTextField();
	jf1.setBounds(300,220,250, 50);
	jf1.setFont(fo);
	
	
	jf2=new JTextField();
	jf2.setBounds(300,290,250, 50);
	jf2.setFont(fo);
	
	
	jf3=new JTextField();
	jf3.setBounds(300,360,250, 50);
	jf3.setFont(fo);
	
	
	jf4=new JTextField();
	jf4.setBounds(300,430,250, 50);
	jf4.setFont(fo);
	
	
	bu=new JButton("ADD");
	bu.setBounds(f1.getWidth()/2-150,520,250, 50);
	bu.setBorderPainted(false);
	bu.setFocusPainted(false);
	bu.setFont(fo);
	bu.setBackground(Color.CYAN);
	
	
	back=new JButton("<-BACK");
	back.setBounds(40,610,200,50);
	back.setBorderPainted(false);
	back.setFocusPainted(false);
	back.setFont(fo);
	back.setBackground(Color.lightGray);
	
	close=new JButton("CLOSE~");
	close.setBounds(460,610,200,50);
	close.setBorderPainted(false);
	close.setFocusPainted(false);
	close.setFont(fo);
	close.setBackground(Color.LIGHT_GRAY);
	
	
	

	f1.add(id);
	f1.add(name);
	f1.add(score);
	f1.add(grade);
	f1.add(rollno);
	f1.add(jf);
	f1.add(jf1);
	f1.add(jf2);
	f1.add(jf3);
	f1.add(jf4);
	f1.add(bu);
	f1.add(back);
	f1.add(close);
	
	f1.setLocationRelativeTo(null);
	f1.getContentPane().setBackground(Color.gray);
	f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	
	
	
	bu.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		
		//String sql ="Select * from sinfo where id='"+jf.getText()+"'";
		
		String sql="insert into sinfo values('"+jf.getText()+"','"+jf1.getText()+"','"+jf2.getText()+"','"+jf3.getText()+"','"+jf4.getText()+"')";
		PreparedStatement stmt=c.prepareStatement(sql);
		stmt.execute();
	
		JOptionPane.showMessageDialog(f1,"STUDENT INFORMATION ADDED");  

		
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
	
	close.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
			f1.dispose();
			
		}  
		}); 
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	public static void main(String[] ar)
	{
		new addstud();
	}

}