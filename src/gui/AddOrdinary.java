package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
//import java.awt.Component;
//import javax.swing.Box;
//import java.awt.Dimension;
//import java.awt.BorderLayout;
import javax.swing.SwingConstants;
//import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AddOrdinary extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public AddOrdinary() {
		setLayout(null);
		
		JLabel lblEnterTheOrdinary = new JLabel("Enter the ordinary account number");
		lblEnterTheOrdinary.setBounds(136, 11, 168, 14);
		lblEnterTheOrdinary.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblEnterTheOrdinary);
		
		textField = new JTextField();
		textField.setBounds(127, 36, 177, 20);
		add(textField);
		textField.setColumns(10);
		
		JButton btnEnter = new JButton("OK");
		btnEnter.setBounds(246, 211, 54, 23);
		add(btnEnter);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(168, 255, 89, 23);
		add(btnCancel);
		
		JButton button = new JButton("1");
		button.setBounds(127, 84, 39, 23);
		add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setBounds(195, 84, 39, 23);
		add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.setBounds(261, 84, 39, 23);
		add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.setBounds(127, 128, 39, 23);
		add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.setBounds(195, 128, 39, 23);
		add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.setBounds(261, 128, 39, 23);
		add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.setBounds(127, 171, 39, 23);
		add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.setBounds(195, 171, 39, 23);
		add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.setBounds(261, 171, 39, 23);
		add(button_8);
		
		JButton button_9 = new JButton("<-");
		button_9.setBounds(127, 211, 58, 23);
		add(button_9);
		
		JButton button_10 = new JButton("0");
		button_10.setBounds(195, 211, 39, 23);
		add(button_10);

	}
}
