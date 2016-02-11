package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowBalance extends JPanel {
	private static final long serialVersionUID = 1L;

	private int flag = 10;
	private OkAction okaction;

	public ShowBalance(String s1, String s2) {
		okaction = new OkAction();
		setLayout(null);
		
		JLabel lblAccountNumber = new JLabel("Account number:");
		lblAccountNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblAccountNumber.setBounds(25, 58, 158, 19);
		add(lblAccountNumber);
		
		JLabel lblBalance = new JLabel("Balance:");
		lblBalance.setHorizontalAlignment(SwingConstants.LEFT);
		lblBalance.setBounds(25, 137, 158, 19);
		add(lblBalance);
		
		JLabel number = new JLabel(s1);
		number.setFont(new Font("Tahoma", Font.BOLD, 11));
		number.setBounds(25, 92, 149, 19);
		add(number);
		
		JLabel balance = new JLabel(s2);
		balance.setFont(new Font("Tahoma", Font.BOLD, 11));
		balance.setBounds(25, 188, 149, 19);
		add(balance);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(169, 242, 89, 23);
		btnOk.addActionListener(okaction);
		add(btnOk);

	}
	
	private class OkAction implements ActionListener{
		
		@Override
		public void actionPerformed (ActionEvent e){
			flag = 1;
		}
	}
	
	public int getFlag(){
		return flag;
	}

}
