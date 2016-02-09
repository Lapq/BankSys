package gui;

import javax.swing.JPanel;
//import javax.swing.JRadioButton;
//import javax.swing.SwingConstants;
import javax.swing.JButton;
//import java.awt.FlowLayout;

public class Panel2 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Panel2() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("Add New OrdinaryAccount");
		btnNewButton.setBounds(44, 46, 159, 23);
		add(btnNewButton);
		
		JButton btnDoCredit = new JButton("Do Credit");
		btnDoCredit.setBounds(295, 46, 77, 23);
		add(btnDoCredit);
		
		JButton btnDoDebit = new JButton("Do Debit");
		btnDoDebit.setBounds(87, 105, 73, 23);
		add(btnDoDebit);
		
		JButton btnDoTransfer = new JButton("Do Transfer");
		btnDoTransfer.setBounds(295, 105, 89, 23);
		add(btnDoTransfer);
		
		JButton btnShowBalance = new JButton("Show Balance");
		btnShowBalance.setBounds(73, 165, 99, 23);
		add(btnShowBalance);
		
		JButton btnRemoveOrdinaryaccount = new JButton("Remove OrdinaryAccount");
		btnRemoveOrdinaryaccount.setBounds(255, 165, 155, 23);
		add(btnRemoveOrdinaryaccount);
		
		JButton btnEarnIterest = new JButton("Earn Interest");
		btnEarnIterest.setBounds(73, 222, 97, 23);
		add(btnEarnIterest);
		
		JButton btnEarnBonus = new JButton("Earn Bonus");
		btnEarnBonus.setBounds(285, 222, 87, 23);
		add(btnEarnBonus);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(198, 266, 51, 23);
		add(btnExit);

	}

}
