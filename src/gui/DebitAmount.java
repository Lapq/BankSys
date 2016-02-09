package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DebitAmount extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public DebitAmount() {
		setLayout(null);
		
		JLabel lblEnterTheAmount = new JLabel("Enter the amount to be debited");
		lblEnterTheAmount.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterTheAmount.setBounds(148, 11, 168, 14);
		add(lblEnterTheAmount);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(139, 36, 177, 20);
		add(textField);
		
		JButton button = new JButton("OK");
		button.setBounds(258, 211, 54, 23);
		add(button);
		
		JButton button_1 = new JButton("Cancel");
		button_1.setBounds(180, 255, 89, 23);
		add(button_1);
		
		JButton button_2 = new JButton("1");
		button_2.setBounds(139, 84, 39, 23);
		add(button_2);
		
		JButton button_3 = new JButton("2");
		button_3.setBounds(207, 84, 39, 23);
		add(button_3);
		
		JButton button_4 = new JButton("3");
		button_4.setBounds(273, 84, 39, 23);
		add(button_4);
		
		JButton button_5 = new JButton("4");
		button_5.setBounds(139, 128, 39, 23);
		add(button_5);
		
		JButton button_6 = new JButton("5");
		button_6.setBounds(207, 128, 39, 23);
		add(button_6);
		
		JButton button_7 = new JButton("6");
		button_7.setBounds(273, 128, 39, 23);
		add(button_7);
		
		JButton button_8 = new JButton("7");
		button_8.setBounds(139, 171, 39, 23);
		add(button_8);
		
		JButton button_9 = new JButton("8");
		button_9.setBounds(207, 171, 39, 23);
		add(button_9);
		
		JButton button_10 = new JButton("9");
		button_10.setBounds(273, 171, 39, 23);
		add(button_10);
		
		JButton button_11 = new JButton("<-");
		button_11.setBounds(139, 211, 58, 23);
		add(button_11);
		
		JButton button_12 = new JButton("0");
		button_12.setBounds(207, 211, 39, 23);
		add(button_12);

	}

}
