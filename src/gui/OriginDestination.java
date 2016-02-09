package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class OriginDestination extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public OriginDestination() {
		setLayout(null);
		
		JLabel lblEnterTheOrigin = new JLabel("Enter the origin account number");
		lblEnterTheOrigin.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterTheOrigin.setBounds(42, 11, 168, 14);
		add(lblEnterTheOrigin);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(33, 36, 177, 20);
		add(textField);
		
		JButton button = new JButton("OK");
		button.setBounds(257, 211, 54, 23);
		add(button);
		
		JButton button_1 = new JButton("Cancel");
		button_1.setBounds(179, 255, 89, 23);
		add(button_1);
		
		JButton button_2 = new JButton("1");
		button_2.setBounds(138, 84, 39, 23);
		add(button_2);
		
		JButton button_3 = new JButton("2");
		button_3.setBounds(206, 84, 39, 23);
		add(button_3);
		
		JButton button_4 = new JButton("3");
		button_4.setBounds(272, 84, 39, 23);
		add(button_4);
		
		JButton button_5 = new JButton("4");
		button_5.setBounds(138, 128, 39, 23);
		add(button_5);
		
		JButton button_6 = new JButton("5");
		button_6.setBounds(206, 128, 39, 23);
		add(button_6);
		
		JButton button_7 = new JButton("6");
		button_7.setBounds(272, 128, 39, 23);
		add(button_7);
		
		JButton button_8 = new JButton("7");
		button_8.setBounds(138, 171, 39, 23);
		add(button_8);
		
		JButton button_9 = new JButton("8");
		button_9.setBounds(206, 171, 39, 23);
		add(button_9);
		
		JButton button_10 = new JButton("9");
		button_10.setBounds(272, 171, 39, 23);
		add(button_10);
		
		JButton button_11 = new JButton("<-");
		button_11.setBounds(138, 211, 58, 23);
		add(button_11);
		
		JButton button_12 = new JButton("0");
		button_12.setBounds(206, 211, 39, 23);
		add(button_12);
		
		JLabel lblEnterTheDestination = new JLabel("Enter the destination account number");
		lblEnterTheDestination.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterTheDestination.setBounds(239, 11, 188, 14);
		add(lblEnterTheDestination);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(239, 36, 177, 20);
		add(textField_1);

	}

}
