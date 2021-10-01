






















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

public class employeedetails extends JFrame implements ActionListener
{
	
	

	JButton btnNewButton;
	JButton btnNewButton_2;
	JButton btnNewButton_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JScrollPane scrollPane;
	 JButton btnNewButton_3;
	 private JButton btnNewButton_4;
	//private JButton btnNewButton_1;
	//private JTextField textField_5;
	
	employeedetails() throws Exception
		{
		setTitle("EMPLOYEE DETAILS");
			System.out.println("gitchyyyy");
		this.getContentPane().setBackground(new Color(255, 255, 255));
		this.setBounds(100, 100, 1083, 690);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.setVisible(true);
		
		  
		btnNewButton = new JButton("SHOW EMPLOYEE DETAILS"); 
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(this);

		btnNewButton.setBounds(651, 8, 212, 47);
		this.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(337, 94, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(337, 247, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(337, 35, 86, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(337, 185, 86, 20);
		getContentPane().add(textField_3);
		
		/*textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(244, 434, 86, 20);
		getContentPane().add(textField_5);*/
		
		JLabel lblNewLabel = new JLabel("EMPLOYEE ID");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setBounds(6, 97, 212, 17);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PHONE NUMBER");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setBounds(6, 249, 264, 18);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NAME");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 37, 156, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("JOB DESCRIPTION");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_3.setBounds(6, 187, 264, 18);
		getContentPane().add(lblNewLabel_3);
		
		/*JLabel lblNewLabel_5 = new JLabel("SERIAL NUMBER");
		lblNewLabel_5.setBounds(33, 437, 83, 14);
		getContentPane().add(lblNewLabel_5);
		*/
		
		btnNewButton_2 = new JButton("SUBMIT");
		btnNewButton_2.setBounds(244, 405, 109, 39);
		getContentPane().add(btnNewButton_2);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(486, 70, 539, 455);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, "", ""},
			},
			new String[] {
				"NAME", "EMPLOYEE ID", "JOB DESCRIPTION", "PHONE NUMBER"
			}
		));
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setPreferredWidth(92);
		scrollPane.setViewportView(table);
		
		btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.setBounds(10, 405, 109, 39);
		getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);
		btnNewButton_2.addActionListener(this);
		btnNewButton_3 = new JButton("BACK");
		btnNewButton_3.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_3.setBounds(135, 482, 89, 23);
		getContentPane().add(btnNewButton_3);
		btnNewButton_3.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnNewButton_4 = new JButton("UPDATE EMPLOYEE");
		btnNewButton_4.setBounds(102, 448, 157, 23);
		getContentPane().add(btnNewButton_4);
		
		btnNewButton_4.addActionListener(this);
		
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
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		}
	
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if(e.getSource()==btnNewButton_2)
			{System.out.println("SUCCESS");
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
				
				int employee_id = Integer.parseInt(textField.getText());
				String phone_number=textField_1.getText();
				String name=textField_2.getText();
				String job_description=textField_3.getText();
				int dis=0;
				
				if(phone_number.equals("")||phone_number.length()>10||!phone_number.matches("[0-9]+"))
				{
					JOptionPane.showMessageDialog(null,"Invalid Mobile Number","Error",JOptionPane.ERROR_MESSAGE);
					this.setVisible(false); 
					new employeedetails();
					dis++;
				}
				if(dis==0)
				{
				/*
				 * STORED PROCEDURE->instead of writing repeated queries again and again,
				 * we create a procedure in database and call it directly using callableStatement.
				 */
				 
				
				java.sql.CallableStatement cst=con.prepareCall("CALL AddingEmployee(?,?,?,?)");
				
				cst.setString(1,name);
				cst.setInt(2,employee_id);
				
				
				cst.setString(3,job_description);
				cst.setString(4,phone_number);
				
		        cst.executeUpdate();
		        JOptionPane.showMessageDialog(null,"DETAILS ADDED SUCCESSFULLY ");
				}
				}
				catch(Exception exp)
				{
					System.out.println(exp.getMessage());
				}
				
				
				
				
			}
			else if(e.getSource()==btnNewButton)
			{System.out.println("SUCCESS");
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
			
				
				
				String query="SELECT* FROM employee";
				
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
				int employee_id = Integer.parseInt(textField.getText());
				//String phone_number=textField_1.getText();
				//String name_=textField_2.getText();
				//String job_description=textField_3.getText();
				
				// serial_no=Integer.parseInt(textField_5.getText());
				String query=String.format("DELETE FROM employee WHERE employee_id = %d",employee_id);

				System.out.println(query);
				st.executeUpdate(query);
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
				new OwnerDisplay();
				
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
				int dis=0;
				int employee_id = Integer.parseInt(textField.getText());
				String phone_number=textField_1.getText();
				String name=textField_2.getText();
				String job_description=textField_3.getText();
				
				if(phone_number.equals("")||phone_number.length()>10||!phone_number.matches("[0-9]+")) {
					JOptionPane.showMessageDialog(null,"Invalid Mobile Number","Error",JOptionPane.ERROR_MESSAGE);
					this.setVisible(false);
					new employeedetails();
					dis++;
				}
				
				 if(dis==0)
				{
			//String query="UPDATE customer SET phone_number =? WHERE customer_id = ?";
			String query=String.format("UPDATE employee SET name =\"%s\",job_description=\"%s\",phone_number=\"%s\" WHERE employee_id = \"%d\" ",name,job_description,phone_number,employee_id);
			
			st.executeUpdate(query);
			JOptionPane.showMessageDialog(null,"DETAILS UPDATED SUCCESSFULLY ");
				}
			
				}
				catch(Exception exp)
				{
					System.out.println(exp.getMessage());
				}
				
				
				
				
			} 
			

}
}
