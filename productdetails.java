

















import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class productdetails extends JFrame implements ActionListener
{
	
	

	JButton btnNewButton;
	JButton btnNewButton_2;
	JButton btnNewButton_1;
	JButton btnNewButton_6;
	JButton btnNewButton_7;
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	private JScrollPane scrollPane;
	private JTextField textField_8;
	 JButton btnNewButton_3;
	 JButton btnNewButton_4;
	 private JTextField textField_2;
	  JButton btnNewButton_5;
	  private JTextField textField_5;
	  private JButton btnNewButton_8;
	//private JButton btnNewButton_1;
	
	productdetails() throws Exception
		{
		setTitle("ADD PRODUCT DETAILS");
			System.out.println("gitchyyyy");
		this.getContentPane().setBackground(new Color(255, 255, 255));
		this.setBounds(100, 100, 1130, 711);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.setVisible(true);
		
		  
		btnNewButton = new JButton("SHOW PRODUCT DETAILS"); 
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(this);

		btnNewButton.setBounds(746, 15, 212, 47);
		this.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(356, 29, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(356, 114, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(356, 252, 86, 20);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(356, 181, 86, 20);
		getContentPane().add(textField_4);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setBounds(33, 29, 134, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PRODUCT ID");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setBounds(33, 114, 195, 17);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("QUANTITY");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_2.setBounds(33, 250, 167, 17);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PRICE");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_3.setBounds(33, 181, 134, 18);
		getContentPane().add(lblNewLabel_3);
		
		
		btnNewButton_2 = new JButton(" SUBMIT PRODUCT DETAILS");
		btnNewButton_2.setBounds(268, 499, 223, 47);
		getContentPane().add(btnNewButton_2);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(505, 68, 743, 516);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"NAME", "PRODUCT ID", "PRICE", "QUANTITY", "IN STOCK"
			}
		));
		scrollPane.setViewportView(table);
		
		btnNewButton_1 = new JButton("DELETE PRODUCT DETAILS");
		btnNewButton_1.setBounds(10, 499, 218, 47);
		getContentPane().add(btnNewButton_1);
		
		textField_8 = new JTextField();
		textField_8.setBounds(356, 396, 86, 20);
		getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("EMPLOYEE ID");
		lblNewLabel_8.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_8.setBounds(33, 396, 223, 20);
		getContentPane().add(lblNewLabel_8);
		
		btnNewButton_3 = new JButton("CUSTOMER DETAILS");
		btnNewButton_3.setBounds(10, 643, 223, 47);
		getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("PAYMENT DETAILS");
		btnNewButton_4.setBounds(263, 563, 228, 47);
		getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel_4 = new JLabel("IN STOCK");
		lblNewLabel_4.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_4.setBounds(33, 318, 167, 16);
		getContentPane().add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(356, 320, 86, 19);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		btnNewButton_1.addActionListener(this);
		btnNewButton_2.addActionListener(this);
		btnNewButton_3.addActionListener(this);
		btnNewButton_4.addActionListener(this);
		
		btnNewButton_5 = new JButton("BACK TO LOGIN");
		btnNewButton_5.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_5.setBounds(10, 732, 190, 23);
		getContentPane().add(btnNewButton_5);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnNewButton_5.addActionListener(this);
		
		btnNewButton_6 = new JButton("UPDATE IN-STOCK");
		btnNewButton_6.setBounds(10, 563, 218, 47);
		getContentPane().add(btnNewButton_6);
		btnNewButton_6.addActionListener(this);
		
		textField_5 = new JTextField();
		textField_5.setBounds(518, 29, 96, 19);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		 btnNewButton_7 = new JButton("search");
		btnNewButton_7.setBounds(642, 28, 85, 21);
		getContentPane().add(btnNewButton_7);
		btnNewButton_7.addActionListener(this);
		
		btnNewButton_8 = new JButton("BUYS");
		btnNewButton_8.setBounds(268, 638, 223, 52);
		getContentPane().add(btnNewButton_8);
		btnNewButton_8.addActionListener(this);
		
		Connection connection=null;
		String databaseName="GROC13";
		final String url="jdbc:mysql://localhost:3306/"+ databaseName;
		final String uname="root";
		final String pass="shreesha";
		//String query="";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		
		ImageIcon img=new ImageIcon("cart.jpeg");
		//JLabel l = new JLabel("",img,JLabel.CENTER);
		JLabel l = new JLabel("");
		l.setFont(new Font("Arial Black", Font.BOLD, 11));
		l.setIcon(new ImageIcon("cart.jpeg"));
		l.setBounds(0,0,1550,830);
		l.setBackground(Color.WHITE);
		this.getContentPane().add(l);
		this.setVisible(true);
		this.setSize(1550,830);
		getContentPane().setLayout(null);
		
	
		
		
		
		 
		
		
		}
	
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if(e.getSource()==btnNewButton_2)
			{
				System.out.println("SUCCESS");
				
				try
				{
				String url ="jdbc:mysql://localhost:3306/GROC13";
				String uname ="root";
				String pass="shreesha";
				//String query="";
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,uname,pass);
				Statement st=con.createStatement();
				String name = textField.getText();
				int  product_id=Integer.parseInt(textField_1.getText());
				
				String quantity=textField_3.getText();
				String price=textField_4.getText();
				int in_stock=Integer.parseInt(textField_2.getText());
				
				int employee_id=Integer.parseInt(textField_8.getText());
				String query=String.format("Insert into product values('%s','%d','%s','%s','%d','%d')",name,product_id,price,quantity,in_stock,employee_id);
				System.out.println(query);
				st.executeUpdate(query);
				JOptionPane.showMessageDialog(null,"DETAILS ADDED SUCCESSFULLY ");
				}
				catch(Exception exp)
				{
					System.out.println(exp.getMessage());
				}
				
				
				
				
			}	

			else if(e.getSource()==btnNewButton)
			{
				System.out.println("SUCCESS");
				try
				{
					
					Connection connection=null;
					String databaseName="GROC13";
					final String url="jdbc:mysql://localhost:3306/"+ databaseName;
					final String uname="root";
					final String pass="shreesha";
				//String query="";
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,uname,pass);
				Statement st=con.createStatement();
			
				
				
				String query="SELECT name,product_id,price,quantity,in_stock FROM PRODUCT";
				
				PreparedStatement pst = con.prepareStatement(query);
				
				ResultSet rs =  pst.executeQuery();
				
				table.setModel(DbUtils.resultSetToTableModel(rs));
				
				ResultSet rs1=st.executeQuery(query);
			 
			      System.out.println(query);
				
				}
				catch(Exception exp)
				{
					System.out.println("hrhfuihfihfuihfuifh");
					System.out.println(exp.getMessage());
				}
				
				
			}
			else if(e.getSource()==btnNewButton_1)
			{
				System.out.println("SUCCESS");
				try
				{
					
					Connection connection=null;
					String databaseName="GROC13";
					final String url="jdbc:mysql://localhost:3306/"+ databaseName;
					final String uname="root";
					final String pass="shreesha";
				//String query="";
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,uname,pass);
				Statement st=con.createStatement();
				int  product_id=Integer.parseInt(textField_1.getText());
				
				
				String query=String.format("DELETE FROM PRODUCT WHERE product_id='%d'",product_id);

				
				PreparedStatement pst = con.prepareStatement(query);
				
				//ResultSet rs =  pst.executeQuery();
				
				//table.setModel(DbUtils.resultSetToTableModel(rs));
				
				st.executeUpdate(query);
			 
			      System.out.println(query);
			      JOptionPane.showMessageDialog(null,"DETAILS DELETED SUCCESSFULLY ");
				
				}
				catch(Exception exp)
				{
					System.out.println("hrhfuihfihfuihfuifh");
					System.out.println(exp.getMessage());
				}
				
				
			}
			else if(e.getSource()==btnNewButton_3)
			{
				System.out.println("SUCCESS");
				try
				{
					Connection connection=null;
					String databaseName="GROC13";
					final String url="jdbc:mysql://localhost:3306/"+ databaseName;
					final String uname="root";
					final String pass="shreesha";
				//String query="";
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,uname,pass);
				Statement st=con.createStatement();
				this.setVisible(false);
				new customerdetails();
				}
				catch(Exception exp)
				{
					System.out.println(exp.getMessage());
				}
				
				
				
				
			}	
			else if(e.getSource()==btnNewButton_4)
			{
				System.out.println("SUCCESS");
				try
				{
					Connection connection=null;
					String databaseName="GROC13";
					final String url="jdbc:mysql://localhost:3306/"+ databaseName;
					final String uname="root";
					final String pass="shreesha";
				//String query="";
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,uname,pass);
				Statement st=con.createStatement();
				this.setVisible(false);
				new displaypayment();
				}
				catch(Exception exp)
				{
					System.out.println(exp.getMessage());
				}
				
				
				
				

		}
			
			else if(e.getSource()==btnNewButton_5)
			{
				System.out.println("SUCCESS");
				try
				{
					Connection connection=null;
					String databaseName="GROC13";
					final String url="jdbc:mysql://localhost:3306/"+ databaseName;
					final String uname="root";
					final String pass="shreesha";
				//String query="";
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,uname,pass);
				Statement st=con.createStatement();
				this.setVisible(false);
				new log();
				}
				catch(Exception exp)
				{
					System.out.println(exp.getMessage());
				}
				
				
				
				
			}	
			
			else if(e.getSource()==btnNewButton_6)
			{
				System.out.println("SUCCESS");
				try
				{
					Connection connection=null;
					String databaseName="GROC13";
					final String url="jdbc:mysql://localhost:3306/"+ databaseName;
					final String uname="root";
					final String pass="shreesha";
					int in_stock=Integer.parseInt(textField_2.getText());
					int  product_id=Integer.parseInt(textField_1.getText());
				//String query="";
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,uname,pass);
				Statement st=con.createStatement();
                String query=String.format("UPDATE product SET in_stock =\"%d\" WHERE product_id = \"%d\" ",in_stock,product_id);
				
				st.executeUpdate(query);
				JOptionPane.showMessageDialog(null,"DETAILS UPDATED SUCCESSFULLY ");
				
				
				}
				catch(Exception exp)
				{
					System.out.println(exp.getMessage());
				}
				
				
				
				
			}	
			
			else if(e.getSource()==btnNewButton_7)
			{
				System.out.println("SUCCESS");
				try
				{
					Connection connection=null;
					String databaseName="GROC13";
					final String url="jdbc:mysql://localhost:3306/"+ databaseName;
					final String uname="root";
					final String pass="shreesha";
					
					String name = textField_5.getText();
					
				//String query="";
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,uname,pass);
				Statement st=con.createStatement();
				
				
				String query=String.format("SELECT name,product_id,quantity,price,in_stock FROM product WHERE name = '%s' ",name);
                PreparedStatement pst = con.prepareStatement(query);
				
				ResultSet rs =  pst.executeQuery();
				int cnt=0;
				
				table.setModel(DbUtils.resultSetToTableModel(rs));
				
				ResultSet rs1=st.executeQuery(query);
			 
			      System.out.println(query);
				
				//System.out.println(rs.getInt(1));
				
				
				while(rs1.next())
				{
					
					cnt++;
				}
				if(cnt==0)
				{
					JOptionPane.showMessageDialog(null,"No Records Found","Ooops!",JOptionPane.INFORMATION_MESSAGE);
					this.setVisible(false);
					new productdetails();
				}
				else
				{
					JOptionPane.showMessageDialog(null,"DETAILS SEARCHED SUCCESSFULLY","Success",JOptionPane.INFORMATION_MESSAGE);
				}
				}
				catch(Exception exp)
				{
					System.out.println(exp.getMessage());
				}
				
				
				
				
			}	
			
			else if(e.getSource()==btnNewButton_8)
			{
				System.out.println("SUCCESS");
				try
				{
					Connection connection=null;
					String databaseName="GROC13";
					final String url="jdbc:mysql://localhost:3306/"+ databaseName;
					final String uname="root";
					final String pass="shreesha";
				//String query="";
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,uname,pass);
				Statement st=con.createStatement();
				this.setVisible(false);
				new Buys();
				}
				catch(Exception exp)
				{
					System.out.println(exp.getMessage());
				}
				
				
				
				

		}
			
}
}


