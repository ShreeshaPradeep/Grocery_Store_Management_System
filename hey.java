import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Label;
import java.awt.Font;
import java.sql.*;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class hey extends JFrame implements ActionListener
{
	JButton btnNewButton;
	JFrame frame;
	JTextField myField1;
	String s;
	JLabel l;
	public static void main(String[] args) throws Exception  
	{
		new log();
	}
	public hey() throws Exception
	{
		
		
		Connection connection=null;
		String databaseName="GROC13";
		final String url="jdbc:mysql://localhost:3306/"+ databaseName;
		final String username="root";
		final String password="shreesha";
			this.setSize(2500,900);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.getContentPane().setLayout(null);
	this.setTitle("GROCERY STORE");
	this.setVisible(true);
	
	btnNewButton = new JButton("hey");
	btnNewButton.setFont(new Font("Castellar", Font.BOLD, 12));
	btnNewButton.setBackground(new Color(255, 255, 255));

	btnNewButton.setBounds(962,334, 116, 34);
	this.getContentPane().add(btnNewButton);
	btnNewButton.addActionListener(this);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	ImageIcon img=new ImageIcon("cart.jpeg");
	//JLabel l = new JLabel("",img,JLabel.CENTER);
	JLabel l = new JLabel("");
	l.setFont(UIManager.getFont("FormattedTextField.font"));
	l.setIcon(new ImageIcon("cart.jpeg"));
	l.setBounds(0,0,3000,830);
	l.setBackground(Color.WHITE);
	this.getContentPane().add(l);
	this.setVisible(true);
	this.setSize(1550,830);
	getContentPane().setLayout(null);
	
	
	
	
	
	
	
	
	}


@Override
public void actionPerformed(ActionEvent e) {
	 //TODO Auto-generated method stub
	
	char pwd = 0;
	String pwd1 ="";
	

	 pwd1=Character.toString(pwd);
		System.out.println(pwd1);
		if(pwd1.equals("3"))
		{
			System.out.println("SUCCESS");
			JOptionPane.showMessageDialog(null,"YOU ARE LOGGED IN SUCCESSFULLY ");
			this.setVisible(false);
			new OwnerDisplay();
		
		}
		else if(pwd1.equals("2"))
		{System.out.println("SUCCESS");
		JOptionPane.showMessageDialog(null,"YOU ARE LOGGED IN SUCCESSFULLY ");
			this.setVisible(false);
			new DisplayEmp();
			
		}
		
		
		else
		{
			JOptionPane.showMessageDialog(null,"Please enter valid Key","Error",JOptionPane.ERROR_MESSAGE);
			try {
				System.out.println("SUCCESS");
				this.setVisible(false);
				new log();
			} catch (Exception e1) 
			{
				e1.printStackTrace();
			}
		}
	
	}
	

}


