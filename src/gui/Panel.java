package gui;

import javax.swing.JPanel;
//import javax.swing.JLabel;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
//import com.jgoodies.forms.layout.FormSpecs;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class Panel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private StartAction startAction;
	private int flag;
	/**
	 * Create the panel.
	 */
	public Panel() {
		startAction = new StartAction();
		setLayout(null);
		
		JButton btnStart = new JButton("Start");
		btnStart.setBounds(178, 255, 89, 23);
		btnStart.addActionListener(startAction);
		add(btnStart);
		
		JLabel lblWelcomeTo = new JLabel("WELCOME TO");
		lblWelcomeTo.setFont(new Font("Arial", Font.BOLD, 48));
		lblWelcomeTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeTo.setBounds(10, 11, 430, 87);
		add(lblWelcomeTo);
		
		JLabel lblOurBank = new JLabel("OUR BANK");
		lblOurBank.setFont(new Font("Arial", Font.BOLD, 47));
		lblOurBank.setHorizontalAlignment(SwingConstants.CENTER);
		lblOurBank.setBounds(10, 109, 430, 59);
		add(lblOurBank);
		
		JLabel lblAutomatedTellerMachine = new JLabel("Automated Teller Machine");
		lblAutomatedTellerMachine.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAutomatedTellerMachine.setHorizontalAlignment(SwingConstants.CENTER);
		lblAutomatedTellerMachine.setBounds(10, 179, 430, 51);
		add(lblAutomatedTellerMachine);
		System.out.println("teste");

	}
	
	private class StartAction implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			flag = 1;
		}
	}
	
	public int getFlag(){
		return flag;
	}
}
