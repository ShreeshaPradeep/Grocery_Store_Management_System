













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

public class log extends JFrame implements ActionListener
{
	JButton btnNewButton;
	JButton btnNewButton_1 ;
	JFrame frame;
	JTextField myField1;
	String s;
	JLabel l;
	private JPasswordField passwordField;
	public static void main(String[] args) throws Exception  
	{
		new log();
	}
	public log() throws Exception
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
	
	btnNewButton = new JButton("submit");
	btnNewButton.setFont(new Font("Castellar", Font.BOLD, 12));
	btnNewButton.setBackground(new Color(255, 255, 255));

	btnNewButton.setBounds(962,334, 116, 34);
	this.getContentPane().add(btnNewButton);
	btnNewButton.addActionListener(this);
	
	Label label_1 = new Label("ENTER KEY");
	label_1.setAlignment(Label.CENTER);
	//label_1.setBackground(Color.WHITE);
	label_1.setFont(new Font("Gill Sans MT Ext Condensed Bold", Font.BOLD, 15));
	label_1.setBounds(599, 256, 153, 45);
	label_1.setBackground(new Color(255, 255, 255));
	
	passwordField = new JPasswordField();
	passwordField.setBounds(910, 265, 202, 36);
	getContentPane().add(passwordField);
	

	 btnNewButton_1 = new JButton("go to hey");
	btnNewButton_1.setBounds(443, 395, 89, 23);
	getContentPane().add(btnNewButton_1);
	btnNewButton_1.addActionListener(this);
	
	JLabel lblNewLabel = new JLabel("ASP GROCERY STORE ");
	
	lblNewLabel.setFont(new Font("Kristen ITC", Font.BOLD, 60));
	lblNewLabel.setBackground(new Color(255, 255, 255));
	lblNewLabel.setForeground(SystemColor.textText);
	lblNewLabel.setBounds(411, 20, 1005, 55);
	getContentPane().add(lblNewLabel);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	this.getContentPane().add(label_1);
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
	char[] pswd =passwordField.getPassword();
	if(e.getSource()==btnNewButton)
	{
	 for(int i=0;i<pswd.length;i++)
	 {
		 pwd=pswd[i];
		 
	 }
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
	
	else if(e.getSource()==btnNewButton_1) {
		try {System.out.println("SUCCESS");
		this.setVisible(false);
		new hey();
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}		
		
		
	}
	}
}

