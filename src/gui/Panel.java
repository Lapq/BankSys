package gui;

import javax.swing.JPanel;
//import javax.swing.JLabel;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
//import com.jgoodies.forms.layout.FormSpecs;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Panel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtAutomatedTellerMachine;

	/**
	 * Create the panel.
	 */
	public Panel() {
		setLayout(null);
		
		JTextArea txtrWelcomeTo = new JTextArea();
		txtrWelcomeTo.setFont(new Font("Monospaced", Font.BOLD, 74));
		txtrWelcomeTo.setText("WELCOME TO "
				+ "OUR BANK");
		txtrWelcomeTo.setBounds(0, 0, 450, 188);
		txtrWelcomeTo.setLineWrap(true);
		add(txtrWelcomeTo);
		
		txtAutomatedTellerMachine = new JTextField();
		txtAutomatedTellerMachine.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtAutomatedTellerMachine.setHorizontalAlignment(SwingConstants.CENTER);
		txtAutomatedTellerMachine.setText("Automated Teller Machine");
		txtAutomatedTellerMachine.setBounds(0, 199, 450, 41);
		add(txtAutomatedTellerMachine);
		txtAutomatedTellerMachine.setColumns(10);

	}
}
