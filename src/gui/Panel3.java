package gui;

import javax.swing.JPanel;
//import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Panel3 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Panel3() {
		setLayout(null);
		
		JLabel lblAddNewOrdinaryaccount = new JLabel("Add New OrdinaryAccount");
		lblAddNewOrdinaryaccount.setBounds(161, 5, 127, 14);
		add(lblAddNewOrdinaryaccount);
		
		JButton btnOrdinary = new JButton("Ordinary");
		btnOrdinary.setBounds(47, 61, 89, 23);
		add(btnOrdinary);
		
		JButton btnSpecial = new JButton("Special");
		btnSpecial.setBounds(273, 61, 89, 23);
		add(btnSpecial);
		
		JButton btnSavings = new JButton("Savings");
		btnSavings.setBounds(47, 144, 89, 23);
		add(btnSavings);
		
		JButton btnTax = new JButton("Tax");
		btnTax.setBounds(273, 144, 89, 23);
		add(btnTax);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(161, 228, 89, 23);
		add(btnCancel);

	}
}
