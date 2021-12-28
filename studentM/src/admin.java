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

public class admin {
	
	JFrame f1; 
	JPasswordField value; 
	JLabel jl1,jl2;
	JButton bu,back,close;
	String user="",pass="",un="admin",pw="admin123";
	
	JTextField text;
	admin(){  

		f1=new JFrame();
		f1.setLayout(null);  
		f1.setVisible(true);
		f1.setSize(500,500);  
		
		Font  fo  = new Font(Font.SANS_SERIF,  Font.BOLD, 20);
		
			value= new JPasswordField();
			value.setBounds(f1.getWidth()/2, 200,150, 50);
			value.setFont(fo);
			
			text = new JTextField();
			text.setBounds(f1.getWidth()/2,100,150,50);
			text.setFont(fo);
			

			bu=new JButton("LOGIN");
			bu.setBounds(f1.getWidth()/2-100,300,200, 50);
			bu.setBorderPainted(false);
			bu.setFocusPainted(false);
			bu.setFont(fo);
			bu.setBackground(Color.CYAN);
			
			jl1=new JLabel("USERNAME:");
			jl1.setBounds(f1.getWidth()/2-150,100,150,50);
			jl1.setFont(fo);
			
			jl2=new JLabel("PASSWORD:");
			jl2.setBounds(f1.getWidth()/2-150,200,150,50);
			jl2.setFont(fo);
			
			
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
			
			pass=new String(value.getPassword());  
	

			f1.add(value);
			f1.add(bu);
			f1.add(text);
			f1.add(jl1);
			f1.add(jl2);
			f1.add(back);
			f1.add(close);
			
			f1.setLocationRelativeTo(null);
			f1.getContentPane().setBackground(Color.gray);
			f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			bu.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
				        
					 
					user+= "" + text.getText();  
	                  pass+= ""   
	                   + new String(value.getPassword());   
	                
	                    
	                 
	                    if((user).equals(un) && (pass).equals(pw))
	                    {
	                    	admin1 ad=new admin1();
                    		f1.dispose();
	   	                 
	                    }
	                    else 
	                    {
	                    	  JOptionPane.showMessageDialog(f1,"Invalid Username or Password");  
	                    }
	                    	
	                   
				}  
				}); 
			  

			back.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
			new homepage();
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
	
new admin();
	}

}
