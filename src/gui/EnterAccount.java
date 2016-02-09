package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class EnterAccount extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public EnterAccount() {
		setLayout(null);
		
		JLabel lblEnterTheAccount = new JLabel("Enter the account number");
		lblEnterTheAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterTheAccount.setBounds(146, 11, 168, 14);
		add(lblEnterTheAccount);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(137, 36, 177, 20);
		add(textField);
		
		JButton button = new JButton("OK");
		button.setBounds(256, 211, 54, 23);
		add(button);
		
		JButton button_1 = new JButton("Cancel");
		button_1.setBounds(178, 255, 89, 23);
		add(button_1);
		
		JButton button_2 = new JButton("1");
		button_2.setBounds(137, 84, 39, 23);
		add(button_2);
		
		JButton button_3 = new JButton("2");
		button_3.setBounds(205, 84, 39, 23);
		add(button_3);
		
		JButton button_4 = new JButton("3");
		button_4.setBounds(271, 84, 39, 23);
		add(button_4);
		
		JButton button_5 = new JButton("4");
		button_5.setBounds(137, 128, 39, 23);
		add(button_5);
		
		JButton button_6 = new JButton("5");
		button_6.setBounds(205, 128, 39, 23);
		add(button_6);
		
		JButton button_7 = new JButton("6");
		button_7.setBounds(271, 128, 39, 23);
		add(button_7);
		
		JButton button_8 = new JButton("7");
		button_8.setBounds(137, 171, 39, 23);
		add(button_8);
		
		JButton button_9 = new JButton("8");
		button_9.setBounds(205, 171, 39, 23);
		add(button_9);
		
		JButton button_10 = new JButton("9");
		button_10.setBounds(271, 171, 39, 23);
		add(button_10);
		
		JButton button_11 = new JButton("<-");
		button_11.setBounds(137, 211, 58, 23);
		add(button_11);
		
		JButton button_12 = new JButton("0");
		button_12.setBounds(205, 211, 39, 23);
		add(button_12);

	}
}
