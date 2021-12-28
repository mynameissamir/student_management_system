import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException; 
import java.util.*;

import javax.swing.JFrame;
import javax.swing.*;

public class homepage {
	JFrame f;
	JButton b1,b2,b;
	JLabel jl;
	homepage(){  
		
		 f=new JFrame();  
	
		f.setLayout(null);  
		f.setVisible(true);
		f.setSize(700,700);  
		f.setLocationRelativeTo(null);
		f.getContentPane().setBackground(Color.gray);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 b=new JButton("EXIT");  
		 b1=new JButton("Admin Login");
		 b2=new JButton("Student Login");
		
		 jl=new JLabel("Welcome To Student Management System");
		
		Font  f2  = new Font(Font.SANS_SERIF,  Font.BOLD, 20);
		Font  f1  = new Font(Font.SANS_SERIF,  Font.BOLD, 25);
		
		b.setBorderPainted(false);
		b.setFocusPainted(false);
		
		b1.setBorderPainted(false);
		b1.setFocusPainted(false);
		
		b2.setBorderPainted(false);
		b2.setFocusPainted(false);
		
		
		jl.setFont(f1);
		b.setFont(f2);
		b.setBackground(Color.white);
		
		b1.setFont(f2);
		b1.setBackground(Color.white);
		b1.setForeground(Color.gray);
		
		b2.setFont(f2);
		b2.setBackground(Color.white);
		b2.setForeground(Color.gray);
		
		
		jl.setForeground(Color.cyan);
		b.setBounds(f.getWidth()/2-50,600,80,30);  
		b1.setBounds(f.getWidth()/2-100,300,200,50);
		b2.setBounds(f.getWidth()/2-100,450,200,50);
		jl.setBounds(f.getWidth()/2-250,0,500,100);
		
		f.add(b);  
		f.add(jl);
		f.add(b1);
		f.add(b2);
		
		b1.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
			        admin ad=new admin();
			        f.dispose();
			}  
			}); 
		b2.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
			    newa studr=new newa();
			        f.dispose();
			}  
			});
		b.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
			        
			        f.dispose();
			}  
			}); 

	}
	

	 public static void main(String arg[])
	 {
		 homepage jm1=new homepage();
	
	 }
	
}








/*writer
public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("filename.txt");
      myWriter.write("Files in Java might be tricky, but it is fun enough!");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
*/




/*reader
public static void main(String[] args) {
    try {
      File myObj = new File("filename.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }*/