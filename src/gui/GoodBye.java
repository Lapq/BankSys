package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class GoodBye extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public GoodBye() {
		setLayout(null);
		
		JLabel lblGoodByeAnd = new JLabel("Good bye and have a nice day!");
		lblGoodByeAnd.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGoodByeAnd.setHorizontalAlignment(SwingConstants.CENTER);
		lblGoodByeAnd.setBounds(103, 128, 247, 23);
		add(lblGoodByeAnd);

	}

}
