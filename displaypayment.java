









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
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

public class displaypayment extends JFrame implements ActionListener
{
	
	

	JButton btnNewButton;
	JButton btnNewButton_2;
	private JTextField textField;
	JButton btnNewButton_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	private JScrollPane scrollPane;
	 JButton btnNewButton_3;
	 JButton btnNewButton_4;
	 JButton btnNewButton_5;
	  JButton btnNewButton_6;
	  private JButton btnNewButton_7;
	//private JButton btnNewButton_1;
	
	displaypayment() throws Exception
		{
		setTitle("ADD PAYMENT DETAILS");
			System.out.println("gitchyyyy");
		this.getContentPane().setBackground(new Color(255, 255, 255));
		this.setBounds(100, 100, 929, 713);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.setVisible(true);
		
		  
		btnNewButton = new JButton("SHOW PAYMENT DETAILS"); 
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(this);

		btnNewButton.setBounds(555, 97, 202, 47);
		this.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(313, 70, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(313, 147, 86, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(313, 222, 86, 20);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(313, 299, 86, 20);
		getContentPane().add(textField_4);
		
		JLabel lblNewLabel = new JLabel("BILL NUMBER");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setBounds(33, 73, 216, 17);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("EMPLOYEE ID");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(33, 225, 216, 17);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CUSTOMER ID");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_3.setBounds(33, 302, 237, 17);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CASH");
		lblNewLabel_4.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_4.setBounds(33, 153, 162, 14);
		getContentPane().add(lblNewLabel_4);
		
		
		btnNewButton_2 = new JButton("SUBMIT");
		btnNewButton_2.setBounds(242, 399, 173, 47);
		getContentPane().add(btnNewButton_2);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(426, 202, 502, 151);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"BILL NUMBER", "DATE", "AMOUNT", "EMPLOEE ID", "CUSTOMER ID"
			}
		));
		scrollPane.setViewportView(table);
		
		btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.setBounds(10, 399, 173, 47);
		getContentPane().add(btnNewButton_1);
		
		btnNewButton_3 = new JButton("CUSTOMER DETAILS");
		btnNewButton_3.setBounds(10, 467, 173, 49);
		getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("PRODUCT DETAILS");
		btnNewButton_4.setBounds(242, 467, 172, 49);
		getContentPane().add(btnNewButton_4);
		btnNewButton_1.addActionListener(this);
		btnNewButton_2.addActionListener(this);
		btnNewButton_3.addActionListener(this);
		btnNewButton_4.addActionListener(this);
		
		btnNewButton_5 = new JButton("BACK TO LOGIN");
		btnNewButton_5.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_5.setBounds(10, 585, 173, 23);
		getContentPane().add(btnNewButton_5);
		btnNewButton_5.addActionListener(this);
		
		btnNewButton_6 = new JButton("REWARD DETAILS");
		btnNewButton_6.setBounds(243, 531, 172, 49);
		getContentPane().add(btnNewButton_6);
		btnNewButton_6.addActionListener(this);
		
		btnNewButton_7 = new JButton("BUYS");
		btnNewButton_7.setBounds(10, 527, 173, 47);
		getContentPane().add(btnNewButton_7);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnNewButton_7.addActionListener(this);
		
		String url ="jdbc:mysql://localhost:3306/GROC13";
		String uname ="root";
		String pass="shreesha";
		//String query="";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		
		ImageIcon img=new ImageIcon("cart.jpeg");
		//JLabel l = new JLabel("",img,JLabel.CENTER);
		JLabel l = new JLabel("");
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
					Connection connection=null;
					String databaseName="GROC13";
					final String url="jdbc:mysql://localhost:3306/"+ databaseName;
					final String uname="root";
					final String pass="shreesha";
				//String query="";
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,uname,pass);
				Statement st=con.createStatement();
				
			 int bill_number = Integer.parseInt(textField.getText());
				//String date=textField_1.getText();
			 long millis = System.currentTimeMillis();
			 java.sql.Date date = new java.sql.Date(millis);
			 String date1=""+date+"";
				String amount=textField_2.getText();
				int employee_id=Integer.parseInt(textField_3.getText());
				int customer_id=Integer.parseInt(textField_4.getText());
				
				String query=String.format("Insert into payment values('%d','%s','%s','%d','%d')",bill_number,date1,amount,employee_id,customer_id);
				System.out.println(query);
				int x=st.executeUpdate(query);
			
				JOptionPane.showMessageDialog(null,"DETAILS ADDED SUCCESSFULLY ");
				}
				catch(Exception exp)
				{
					System.out.println(exp.getMessage());
				}
				
				
				
				
			}	
			else if(e.getSource()==btnNewButton)
			{ System.out.println("SUCCESS");
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
			
				
				
				String query="SELECT* FROM payment";
				
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
				
				
				int bill_number=Integer.parseInt(textField.getText());
				
								
				
				String query=String.format("DELETE FROM payment WHERE bill_number ='%d' ",bill_number);
				System.out.println(query);
				int x=st.executeUpdate(query);
				JOptionPane.showMessageDialog(null,"DETAILS DELETED SUCCESSFULLY ");
				}
				catch(Exception exp)
				{
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
				new productdetails();
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
				//String query="";
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,uname,pass);
				Statement st=con.createStatement();
				this.setVisible(false);
				new reward();
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

