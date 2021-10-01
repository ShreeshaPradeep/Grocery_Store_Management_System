














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

public class customerdetails extends JFrame implements ActionListener
{
	
	

	JButton btnNewButton;
	JButton btnNewButton_2;
	JButton btnNewButton_1;
	JButton btnNewButton_4;
	JButton btnNewButton_3;
	JButton btnNewButton_5;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	 JButton btnNewButton_6;
	 private JButton btnNewButton_7;
	
	/*private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;*/
	
	customerdetails() throws Exception
		{
		setTitle("ADD CUSTOMER DETAILS");
			//System.out.println("gitchyyyy");
		this.getContentPane().setBackground(new Color(255, 255, 255));
		this.setBounds(100, 100, 1126, 585);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.setVisible(true);
		  
		btnNewButton = new JButton("SHOW CUSTOMER DETAILS"); 
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(this);

		btnNewButton.setBounds(677, 25, 301, 47);
		this.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(444, 76, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(444, 152, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(444, 227, 86, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		/*textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(244, 295, 86, 20);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(244, 372, 86, 20);
		getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(244, 434, 86, 20);
		getContentPane().add(textField_5);*/
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 76, 328, 20);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CUSTOMER ID");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 148, 301, 29);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PHONE NUMBER");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 223, 318, 29);
		getContentPane().add(lblNewLabel_2);
		
		/*JLabel lblNewLabel_3 = new JLabel("CUSTOMER ID");
		lblNewLabel_3.setBounds(33, 375, 83, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CASH");
		lblNewLabel_4.setBounds(33, 226, 46, 14);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("SERIAL NUMBER");
		lblNewLabel_5.setBounds(33, 437, 83, 14);
		getContentPane().add(lblNewLabel_5);
		*/
		
		btnNewButton_2 = new JButton("ADD CUSTOMER DETAIL");
		btnNewButton_2.setBounds(10, 397, 224, 43);
		getContentPane().add(btnNewButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(557, 136, 657, 179);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, "", null, null},
			},
			new String[] {
				"NAME", "CUSTOMER ID", "PHONE NUMBER", "PRODUCT ID", "NO'S"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(146);
		table.getColumnModel().getColumn(1).setPreferredWidth(153);
		table.getColumnModel().getColumn(2).setPreferredWidth(180);
		scrollPane.setViewportView(table);
		
		 btnNewButton_1 = new JButton("DELETE CUSTOMER DETAIL");
		btnNewButton_1.setBounds(387, 397, 248, 43);
		getContentPane().add(btnNewButton_1);
		
		 btnNewButton_3 = new JButton("PRODUCT DETAILS");
		btnNewButton_3.setBounds(10, 459, 224, 43);
		getContentPane().add(btnNewButton_3);
		
		 btnNewButton_4 = new JButton("PAYMENT DETAILS");
		btnNewButton_4.setBounds(10, 513, 224, 43);
		getContentPane().add(btnNewButton_4);
		btnNewButton_1.addActionListener(this);
		btnNewButton_2.addActionListener(this);
		btnNewButton_3.addActionListener(this);
		btnNewButton_4.addActionListener(this);
		
		 btnNewButton_5 = new JButton("UPDATE CUSTOMER CELL-NO");
		btnNewButton_5.setBounds(387, 459, 248, 43);
		getContentPane().add(btnNewButton_5);
		
		btnNewButton_5.addActionListener(this);
		btnNewButton_6 = new JButton("BACK TO LOGIN");
		btnNewButton_6.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_6.setBounds(222, 622, 224, 23);
		getContentPane().add(btnNewButton_6);
		
		btnNewButton_6.addActionListener(this);
		
		
		btnNewButton_7 = new JButton("BUYS");
		btnNewButton_7.setBounds(385, 513, 250, 43);
		getContentPane().add(btnNewButton_7);
		btnNewButton_7.addActionListener(this);
		
		
		ImageIcon img=new ImageIcon("cart.jpeg");
		//JLabel l = new JLabel("",img,JLabel.CENTER);
		JLabel l = new JLabel("");
		l.setIcon(new ImageIcon("cart.jpeg"));
		l.setBounds(0,0,1550,830);
		l.setBackground(Color.WHITE);
		this.getContentPane().add(l);
		this.setSize(1550,830);
		getContentPane().setLayout(null);
		
	
		
		
		
		
		
		}
	
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if(e.getSource()==btnNewButton_2)
			{
				System.out.println("Fuck you");
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
				String name = textField.getText();
				int customer_id=Integer.parseInt(textField_1.getText());
				String phone_number=textField_2.getText();
				
				/*String employee_id=textField_3.getText();
				String customer_id=textField_4.getText();
				int serial_no=Integer.parseInt(textField_5.getText());*/
				int dis=0;
				if(phone_number.equals("")||phone_number.length()>10||!phone_number.matches("[0-9]+")) {
					JOptionPane.showMessageDialog(null,"Invalid Mobile Number","Error",JOptionPane.ERROR_MESSAGE);
					this.setVisible(false);
					new customerdetails();
					dis++;
				}
				if(dis==0)
				{
				String query=String.format("Insert into customer values('%s','%d','%s')",name,customer_id,phone_number);
				System.out.println(query);
				st.executeUpdate(query);
				
							JOptionPane.showMessageDialog(null,"DETAILS ADDED SUCCESSFULLY ");
							
				}
				}
				catch(Exception exp)
				{
					System.out.println(exp.getMessage());
				}
				
				
				
				
			}	
			else if(e.getSource()==btnNewButton)
			{
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
			
				
				
				String query="SELECT* FROM customer";
				
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
				
				int customer_id=Integer.parseInt(textField_1.getText());
				
				/*String employee_id=textField_3.getText();
				String customer_id=textField_4.getText();
				int serial_no=Integer.parseInt(textField_5.getText());*/
				System.out.println("herhdhhrrdhhdr");
				String query=String.format("DELETE FROM customer WHERE customer_id ='%d'",customer_id);
			
				st.execute(query);
				System.out.println(query);
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
				new productdetails();
				
				}
				catch(Exception exp)
				{
					System.out.println(exp.getMessage());
				}
				
				
			}
			else if(e.getSource()==btnNewButton_5)
			{
				System.out.println(" SUCCESS");
				try
				{
					Connection connection=null;
					String databaseName="GROC13";
					final String url="jdbc:mysql://localhost:3306/"+ databaseName;
					final String uname="root";
					final String pass="shreesha";
				//String query="";
					int customer_id=Integer.parseInt(textField_1.getText());
					String phone_number=textField_2.getText();
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,uname,pass);
				Statement st=con.createStatement();
				int dis=0;
				if(phone_number.equals("")||phone_number.length()>10||!phone_number.matches("[0-9]+")) {
					JOptionPane.showMessageDialog(null,"Invalid Mobile Number","Error",JOptionPane.ERROR_MESSAGE);
					this.setVisible(false);
					new customerdetails();
					dis++;
				}
				if(dis==0)
				{
				//String query="UPDATE customer SET phone_number =? WHERE customer_id = ?";
				String query=String.format("UPDATE customer SET phone_number =\"%s\" WHERE customer_id = \"%d\" ",phone_number,customer_id);
				
				st.executeUpdate(query);
				JOptionPane.showMessageDialog(null,"DETAILS UPDATED SUCCESSFULLY ");
				}
				
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
				
				new log();
				
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



