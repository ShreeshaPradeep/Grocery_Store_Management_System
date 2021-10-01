


















import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;

public class OwnerDisplay extends JFrame implements ActionListener {
	JButton btnNewButton_1;
	JButton btnNewButton_2;
	JButton btnNewButton_3;
	JButton btnNewButton_4;
	JButton btnNewButton_5;
	JButton btnNewButton_6; 
	 JButton btnNewButton;

OwnerDisplay()

	{



		
		this.getContentPane().setBackground(new Color(255, 255, 255));
		this.setBounds(100, 100, 608, 585);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.setVisible(true);
		
		 btnNewButton_1 = new JButton("EMPLOYEE DETAILS ");
		 btnNewButton_1.setBackground(new Color(255, 255, 224));
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(219, 127, 204, 70);
		this.getContentPane().add(btnNewButton_1);
		
		 btnNewButton_2 = new JButton("CUSTOMER DETAILS");
		 btnNewButton_2.setBackground(new Color(255, 255, 224));
		btnNewButton_2.addActionListener(this);
		btnNewButton_2.setBounds(664, 127, 204, 70);
		this.getContentPane().add(btnNewButton_2);
		
		 btnNewButton_3 = new JButton("PAYMENT DETAILS");
		 btnNewButton_3.setBackground(new Color(255, 255, 224));
		btnNewButton_3.addActionListener(this);
		btnNewButton_3.setBounds(219, 352, 204, 70);
		this.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("BUYS");
		btnNewButton_4.setBackground(new Color(250, 250, 210));
		btnNewButton_4.addActionListener(this);
		btnNewButton_4.setBounds(664, 355, 204, 65);
		this.getContentPane().add(btnNewButton_4);
		
		 btnNewButton_5 = new JButton("PRODUCT DETAILS");
		 btnNewButton_5.setBackground(new Color(255, 255, 224));
		btnNewButton_5.addActionListener(this);
		btnNewButton_5.setBounds(1089, 127, 204, 70);
		getContentPane().add(btnNewButton_5);
		
		 btnNewButton_6 = new JButton("REWARD DETAILS");
		 btnNewButton_6.setBackground(new Color(255, 255, 224));
		 btnNewButton_6.addActionListener(this);
		btnNewButton_6.setBounds(1089, 362, 204, 70);
		getContentPane().add(btnNewButton_6);
		
		btnNewButton = new JButton("BACK TO LOGIN");
		btnNewButton.setBounds(664, 457, 204, 21);
		getContentPane().add(btnNewButton);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 btnNewButton.addActionListener(this);
		
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
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==btnNewButton_1)
	{
		System.out.println("SUCCESS");
		try {
			this.setVisible(false);
			new employeedetails();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
	}
else if(e.getSource()==btnNewButton_2)
{
	System.out.println("SUCCESS");
	try {
		this.setVisible(false);
		new customerdetails();
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}	
}
else if(e.getSource()==btnNewButton_3)
{
	System.out.println("SUCCESS");
	try {
		this.setVisible(false);
		new displaypayment();
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}		
}

else if(e.getSource()==btnNewButton_5)
{
	System.out.println("SUCCESS");
	try {
		this.setVisible(false);
		new productdetails();
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}		
}
else if(e.getSource()==btnNewButton_6)
{
	System.out.println("SUCCESS");
	try {
		this.setVisible(false);
		new Reward1();
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}		
}
	
else if(e.getSource()==btnNewButton)
{
	System.out.println("SUCCESS");
	try {
		this.setVisible(false);
		new log();
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}		
}

else if(e.getSource()==btnNewButton_4)
{
	System.out.println("SUCCESS");
	try {
		this.setVisible(false);
		new Buys();
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}		
}
}
}
