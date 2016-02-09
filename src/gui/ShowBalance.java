package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ShowBalance extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public ShowBalance() {
		setLayout(null);
		
		JLabel lblOrdinaryAccountNumber = new JLabel("Ordinary account number:");
		lblOrdinaryAccountNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblOrdinaryAccountNumber.setBounds(25, 58, 158, 19);
		add(lblOrdinaryAccountNumber);
		
		JLabel lblBalance = new JLabel("Balance:");
		lblBalance.setHorizontalAlignment(SwingConstants.LEFT);
		lblBalance.setBounds(25, 137, 158, 19);
		add(lblBalance);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(25, 92, 149, 19);
		add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(25, 188, 149, 19);
		add(label_1);

	}

}
