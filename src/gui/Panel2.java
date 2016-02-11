package gui;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Panel2 extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private int option;
	private NewAccAction newAccAction;
	private DoCrdAction doCrdAction;
	private DoDbtAction doDbtAction;
	private DoTrsfAction doTrsfAction;
	private ShowBlcAction showBlcAction;
	private RmvAccAction rmvAccAction;
	private EarnIntrAction earnIntrAction;
	private EarnBnsAction earnBnsAction;
	private ExitAction exitAction;


	/**
	 * Create the panel.
	 */
	public Panel2() {
		newAccAction = new NewAccAction();
		doCrdAction = new DoCrdAction();
		doDbtAction = new DoDbtAction();
		doTrsfAction = new DoTrsfAction();
		showBlcAction = new ShowBlcAction();
		rmvAccAction = new RmvAccAction();
		earnIntrAction = new EarnIntrAction();
		earnBnsAction = new EarnBnsAction();
		exitAction = new ExitAction();

		setLayout(null);
		
		JButton btnNewAccount = new JButton("Add New Account");
		btnNewAccount.setBounds(44, 46, 159, 23);
		btnNewAccount.addActionListener(newAccAction);
		add(btnNewAccount);
		
		JButton btnDoCredit = new JButton("Do Credit");
		btnDoCredit.setBounds(255, 46, 155, 23);
		btnDoCredit.addActionListener(doCrdAction);
		add(btnDoCredit);
		
		JButton btnDoDebit = new JButton("Do Debit");
		btnDoDebit.setBounds(44, 105, 159, 23);
		btnDoDebit.addActionListener(doDbtAction);
		add(btnDoDebit);
		
		JButton btnDoTransfer = new JButton("Do Transfer");
		btnDoTransfer.setBounds(255, 105, 155, 23);
		btnDoTransfer.addActionListener(doTrsfAction);
		add(btnDoTransfer);
		
		JButton btnShowBalance = new JButton("Show Balance");
		btnShowBalance.setBounds(44, 165, 159, 23);
		btnShowBalance.addActionListener(showBlcAction);
		add(btnShowBalance);
		
		JButton btnRemoveAccount = new JButton("Remove Account");
		btnRemoveAccount.setBounds(255, 165, 155, 23);
		btnRemoveAccount.addActionListener(rmvAccAction);
		add(btnRemoveAccount);
		
		JButton btnEarnInterest = new JButton("Earn Interest");
		btnEarnInterest.setBounds(44, 222, 159, 23);
		btnEarnInterest.addActionListener(earnIntrAction);
		add(btnEarnInterest);
		
		JButton btnEarnBonus = new JButton("Earn Bonus");
		btnEarnBonus.setBounds(255, 222, 155, 23);
		btnEarnBonus.addActionListener(earnBnsAction);
		add(btnEarnBonus);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(198, 266, 51, 23);
		btnExit.addActionListener(exitAction);
		add(btnExit);
	}
	
	private class NewAccAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			option = 1;
		}
	}
	private class DoCrdAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			option = 2;
		}
	}
	private class DoDbtAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			option = 3;
		}
	}
	private class DoTrsfAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			option = 4;
		}
	}
	private class ShowBlcAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			option = 5;
		}
	}
	private class RmvAccAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			option = 6;
		}
	}
	private class EarnIntrAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			option = 7;
		}
	}
	private class EarnBnsAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			option = 8;
		}
	}
	private class ExitAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			option = 9;
		}
	}
	
	public int getOption()
	{
		return this.option;
	}
}
