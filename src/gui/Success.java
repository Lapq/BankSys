package gui;

import javax.swing.JPanel;
//import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Success extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Success() {
		setLayout(null);
		
		JLabel lblOperationWasSuccessful = new JLabel("Operation was successful!");
		lblOperationWasSuccessful.setHorizontalAlignment(SwingConstants.CENTER);
		lblOperationWasSuccessful.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblOperationWasSuccessful.setBounds(120, 94, 209, 27);
		add(lblOperationWasSuccessful);
		
		JLabel lblDoYouWish = new JLabel("Do you wish to do another operation?");
		lblDoYouWish.setBounds(130, 132, 190, 19);
		add(lblDoYouWish);
		
		JButton btnNewButton = new JButton("Yes");
		btnNewButton.setBounds(120, 197, 89, 23);
		add(btnNewButton);
		
		JButton btnNo = new JButton("No");
		btnNo.setBounds(240, 197, 89, 23);
		add(btnNo);

	}

}
