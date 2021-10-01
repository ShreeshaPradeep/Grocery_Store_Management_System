

























import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;

public class DisplayEmp extends JFrame implements ActionListener
{
	
	
	JButton btnNewButton;
	JButton btnNewButton_1;
	JButton btnNewButton_2;
	 JButton btnNewButton_3;
	 JButton btnNewButton_4;
	 JButton btnNewButton_5;

		DisplayEmp()
		{
			System.out.println("gitchyyyy");
		this.getContentPane().setBackground(new Color(255, 255, 255));
		this.setBounds(100, 100, 608, 585);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.setVisible(true);
		
		  
		btnNewButton = new JButton("PAYMENT DETAILS"); 
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(this);

		btnNewButton.setBounds(478, 381, 169, 70);
		this.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("CUSTOMER DETAILS");
		btnNewButton_1.setBounds(478, 171, 169, 70);
		this.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("PRODUCT DETAILS");
		btnNewButton_2.setBounds(902, 171, 169, 70);
		this.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("REWARD DETAILS");
		btnNewButton_3.setBounds(902, 381, 169, 70);
		getContentPane().add(btnNewButton_3);
		btnNewButton_1.addActionListener(this);
		btnNewButton_2.addActionListener(this);
		btnNewButton_3.addActionListener(this);
		
		 btnNewButton_4 = new JButton("BACK TO LOGIN");
		btnNewButton_4.setBounds(703, 468, 156, 21);
		getContentPane().add(btnNewButton_4);
		btnNewButton_4.addActionListener(this);
		
		 btnNewButton_5 = new JButton("BUYS");
		btnNewButton_5.setBounds(690, 274, 169, 70);
		getContentPane().add(btnNewButton_5);
		btnNewButton_5.addActionListener(this);
		
		JLabel l = new JLabel("");
		l.setFont(UIManager.getFont("FormattedTextField.font"));
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
				try {System.out.println("SUCCESS");
					this.setVisible(false);
					new displaypayment();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
			}
		else if(e.getSource()==btnNewButton_1)
		{
			try {System.out.println("SUCCESS");
				this.setVisible(false);
				new customerdetails();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
		}
		else if(e.getSource()==btnNewButton_2)
		{
			try {System.out.println("SUCCESS");
				this.setVisible(false);
				new productdetails();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}		
		}
		else if(e.getSource()==btnNewButton_3)
		{
			try {System.out.println("SUCCESS");
				this.setVisible(false);
				new reward();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}		
		}
		else if(e.getSource()==btnNewButton_4)
		{
			try {System.out.println("SUCCESS");
				this.setVisible(false);
				new log();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}		
		}
		else if(e.getSource()==btnNewButton_5)
		{
			try {System.out.println("SUCCESS");
				this.setVisible(false);
				new Buys();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}		
		}
		
		
}
}
