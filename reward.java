

















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

public class reward extends JFrame implements ActionListener
{
	
	

	JButton btnNewButton;
	JButton btnNewButton_1;
	private JTable table;
	private JTextField textField;
	private JButton btnNewButton_2;
	/*private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;*/
	
	reward() throws Exception
		{
		setTitle("REWARD DETAILS");
			System.out.println("gitchyyyy");
		this.getContentPane().setBackground(new Color(255,255,255));
		this.setBounds(100, 100, 608, 585);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.setVisible(true);
		
		  
		btnNewButton = new JButton("SHOW REWARD DETAILS"); 
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(this);

		btnNewButton.setBounds(184, 11, 212, 47);
		this.getContentPane().add(btnNewButton);
		String url ="jdbc:mysql://localhost:3306/GROC13";
		String uname ="root";
		String pass="shreesha";
		//String query="";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		
		btnNewButton_1 = new JButton("SEARCH");
		btnNewButton_1.setBounds(937, 54, 89, 23);
		getContentPane().add(btnNewButton_1);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnNewButton_1.addActionListener(this);
		

		textField = new JTextField();
		textField.setBounds(740, 55, 153, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CUSTOMER ID");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setBounds(507, 58, 191, 19);
		getContentPane().add(lblNewLabel);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(45, 160, 521, 179);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"REWARDS", "BILL NUMBER", "CUSTOMER_ID"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(146);
		table.getColumnModel().getColumn(1).setPreferredWidth(153);
		scrollPane.setViewportView(table);
		
		btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnNewButton_2.setBounds(788, 132, 89, 23);
		getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(this);
		
		
		
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
			if(e.getSource()==btnNewButton)
			{
				
			try
			{
				
				System.out.println("SUCCESS");
				Connection connection=null;
				String databaseName="GROC13";
				final String url="jdbc:mysql://localhost:3306/"+ databaseName;
				final String uname="root";
				final String pass="shreesha";
			//String query="";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass);
			Statement st=con.createStatement();
		
			
			
			String query="SELECT * FROM reward";
			
			PreparedStatement pst = con.prepareStatement(query);
			
			ResultSet rs =  pst.executeQuery();
			
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
			ResultSet rs1=st.executeQuery(query);
		 
		      System.out.println(query);
			
			
			
			
			}
			catch (Exception exp)
			{
				
			}
			}

			else if(e.getSource()==btnNewButton_1)
			{
				
			try
			{
				System.out.println("SUCCESS");
				Connection connection=null;
				String databaseName="GROC13";
				final String url="jdbc:mysql://localhost:3306/"+ databaseName;
				final String uname="root";
				final String pass="shreesha";
			//String query="";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass);
			Statement st=con.createStatement();
		int customer_id=Integer.parseInt(textField.getText());
			
			
			String query=String.format("SELECT * FROM reward WHERE customer_id='%d'",customer_id);
			
			PreparedStatement pst = con.prepareStatement(query);
			
			ResultSet rs =  pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			int cnt=0;
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
			
			}
			else
			{
				JOptionPane.showMessageDialog(null,"DETAILS SEARCHED SUCCESSFULLY","Success",JOptionPane.INFORMATION_MESSAGE);
			}
			}
				
			catch (Exception exp)
			{
				
				
			}
		
}
			else if(e.getSource()==btnNewButton_2)
			{
				try
				{

					System.out.println("SUCCESS");
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
			
			
			
			
			
			
			
			
			}
}
