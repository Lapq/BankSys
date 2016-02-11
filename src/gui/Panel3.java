package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel3 extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private int option;
	private OrdinaryAction ordinaryAction;
	private SpecialAction specialAction;
	private SavingsAction savingsAction;
	private TaxAction taxAction;
	private CancelAction cancelAction;

	/**
	 * Create the panel.
	 */
	public Panel3() {
		
		ordinaryAction = new OrdinaryAction();
		specialAction = new SpecialAction();
		savingsAction = new SavingsAction();
		taxAction = new TaxAction();
		cancelAction = new CancelAction();
		
		setLayout(null);
		
		JLabel lblAddNewOrdinaryaccount = new JLabel("Add New OrdinaryAccount");
		lblAddNewOrdinaryaccount.setBounds(161, 5, 127, 14);
		add(lblAddNewOrdinaryaccount);
		
		JButton btnOrdinary = new JButton("Ordinary");
		btnOrdinary.setBounds(47, 61, 89, 23);
		btnOrdinary.addActionListener(ordinaryAction);
		add(btnOrdinary);
		
		JButton btnSpecial = new JButton("Special");
		btnSpecial.setBounds(273, 61, 89, 23);
		btnSpecial.addActionListener(specialAction);
		add(btnSpecial);
		
		JButton btnSavings = new JButton("Savings");
		btnSavings.setBounds(47, 144, 89, 23);
		btnSavings.addActionListener(savingsAction);
		add(btnSavings);
		
		JButton btnTax = new JButton("Tax");
		btnTax.setBounds(273, 144, 89, 23);
		btnTax.addActionListener(taxAction);
		add(btnTax);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(161, 228, 89, 23);
		btnCancel.addActionListener(cancelAction);
		add(btnCancel);

	}
	
	private class OrdinaryAction implements ActionListener{
		@Override
		public void actionPerformed (ActionEvent e)
		{
			option = 1;
		}
	}
	private class SpecialAction implements ActionListener{
		@Override
		public void actionPerformed (ActionEvent e)
		{
			option = 2;
		}
	}
	private class SavingsAction implements ActionListener{
		@Override
		public void actionPerformed (ActionEvent e)
		{
			option = 3;
		}
	}
	private class TaxAction implements ActionListener{
		@Override
		public void actionPerformed (ActionEvent e)
		{
			option = 4;
		}
	}
	private class CancelAction implements ActionListener{
		@Override
		public void actionPerformed (ActionEvent e)
		{
			option = 5;
		}
	}
	
	public int getOption(){
		return this.option;
	}
}
