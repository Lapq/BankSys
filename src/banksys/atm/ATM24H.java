package banksys.atm;

import java.io.IOException;
import javax.swing.JPanel;

import banksys.account.AbstractAccount;
import banksys.account.OrdinaryAccount;
import banksys.account.SavingsAccount;
import banksys.account.SpecialAccount;
import banksys.account.TaxAccount;
import banksys.control.BankController;
import banksys.control.exception.BankTransactionException;
import banksys.persistence.Persistence;
import gui.Panel;
import gui.Panel2;
import gui.Panel3;
import gui.GenericNumberPanel;
import gui.Success;
import gui.ShowBalance;
import gui.GoodBye;
import gui.ErrorScreen;
import gui.SystemWindow;

public class ATM24H {

	private static SystemWindow window;
	private static boolean loop = true;
	private static ErrorScreen erscrn;
	private static GenericNumberPanel gnp;
	private static Success success;
	private static ShowBalance showbalance;
	private static GoodBye goodbye;
	private static BankController bank;
	
	public static void main(String[] args) {
		window = new SystemWindow();
		window.setVisible(true);
		while (loop)
		{
			looper();
		}
	}
	
	public static void looper()
	{
		try {
			bank = new BankController(new Persistence());
		} catch (IOException e) {
			e.printStackTrace();
		}
		switch (mainMenu()) {
		case 1:
			AbstractAccount account = null;
			switch (addAccountMenu()) {
			case 1:
				gnp = new GenericNumberPanel("Enter the ordinary account number");
				ShowPanel(gnp);
				while (gnp.getFlag() == 10) {System.out.println("");/*waiting*/}
				if (gnp.getFlag() == 0)	account = new OrdinaryAccount(gnp.getString());
				else if (gnp.getFlag() == 1)	return;
				break;
			case 2:
				gnp = new GenericNumberPanel("Enter the special account number");
				ShowPanel(gnp);
				while (gnp.getFlag() == 10) {System.out.println("");/*waiting*/}
				if (gnp.getFlag() == 0)	account = new SpecialAccount(gnp.getString());
				else if (gnp.getFlag() == 1)	return;
				break;
			case 3:
				gnp = new GenericNumberPanel("Enter the savings account number");
				ShowPanel(gnp);
				while (gnp.getFlag() == 10) {System.out.println("");/*waiting*/}
				if (gnp.getFlag() == 0)	account = new SavingsAccount(gnp.getString());
				else if (gnp.getFlag() == 1)	return;
				break;
			case 4:
				gnp = new GenericNumberPanel("Enter the Tax account number");
				ShowPanel(gnp);
				while (gnp.getFlag() == 10) {System.out.println("");/*waiting*/}
				if (gnp.getFlag() == 0)	account = new TaxAccount(gnp.getString());
				else if (gnp.getFlag() == 1)	return;
				break;

			default:
				System.out.println("Invalid option!");
				break;
			}

			if (account != null) {
				try {
					bank.addAccount(account);
					success = new Success();
					ShowPanel(success);
					
					while (success.getFlag() == 10) {System.out.println("");/*waiting*/}
					if (success.getFlag() == 1){
						loop = false;
						ShowBye();
					}
				} catch (BankTransactionException bte) {
					ShowError(bte.getMessage());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			break;
		case 2:
			gnp = new GenericNumberPanel("Enter the account number");
			ShowPanel(gnp);
			while (gnp.getFlag() == 10) {System.out.println(""); /*waiting*/}
			if (gnp.getFlag() == 1)	return;
			String number = gnp.getString();

			gnp = new GenericNumberPanel("Enter the amount to be credited");
			ShowPanel(gnp);
			while (gnp.getFlag() == 10) {System.out.println(""); /*waiting*/}
			if (gnp.getFlag() == 1)	return;
			double amount = Double.parseDouble(gnp.getString());

			try {
				bank.doCredit(number, amount);
				success = new Success();
				ShowPanel(success);
				
				while (success.getFlag() == 10) {System.out.println("");/*waiting*/}
				if (success.getFlag() == 1){
					loop = false;
					ShowBye();
				}
			}
			catch (BankTransactionException bte) {
				ShowError(bte.getMessage());
			} catch (IOException e) {
				e.printStackTrace();
			}

			break;
		case 3:			
			gnp = new GenericNumberPanel("Enter the account number");
			ShowPanel(gnp);
			while (gnp.getFlag() == 10) {System.out.println(""); /*waiting*/}
			if (gnp.getFlag() == 1)	return;
			number = gnp.getString();

			gnp = new GenericNumberPanel("Enter the amount to be debited");
			ShowPanel(gnp);
			while (gnp.getFlag() == 10) {System.out.println(""); /*waiting*/}
			if (gnp.getFlag() == 1)	return;
			amount = Double.parseDouble(gnp.getString());
			
			try {
				bank.doDebit(number, amount);
				success = new Success();
				ShowPanel(success);
				
				while (success.getFlag() == 10) {System.out.println("");/*waiting*/}
				if (success.getFlag() == 1){
					loop = false;
					ShowBye();
				}
			} catch (BankTransactionException bte) {
				ShowError(bte.getMessage());
			} catch (IOException e) {
				e.printStackTrace();
			}

			break;
		case 4:
			gnp = new GenericNumberPanel("Enter the origin account number");
			ShowPanel(gnp);
			while (gnp.getFlag() == 10) {System.out.println(""); /*waiting*/}
			if (gnp.getFlag() == 1)	return;
			String fromnumber = gnp.getString();
			
			gnp = new GenericNumberPanel("Enter the destination account number");
			ShowPanel(gnp);
			while (gnp.getFlag() == 10) {System.out.println(""); /*waiting*/}
			if (gnp.getFlag() == 1)	return;
			String tonumber = gnp.getString();
			
			gnp = new GenericNumberPanel("Enter the amount to be transferred");
			ShowPanel(gnp);
			while (gnp.getFlag() == 10) {System.out.println(""); /*waiting*/}
			if (gnp.getFlag() == 1)	return;
			amount = Double.parseDouble(gnp.getString());
			
			try {
				bank.doTransfer(fromnumber, tonumber, amount);
				success = new Success();
				ShowPanel(success);
				
				while (success.getFlag() == 10) {System.out.println("");/*waiting*/}
				if (success.getFlag() == 1){
					loop = false;
					ShowBye();
				}
			} catch (BankTransactionException bte) {
				ShowError(bte.getMessage());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;
		case 5:
			gnp = new GenericNumberPanel("Enter the account number");
			ShowPanel(gnp);
			while (gnp.getFlag() == 10) {System.out.println(""); /*waiting*/}
			if (gnp.getFlag() == 1)	return;
			number = gnp.getString();
			
			try {
				showbalance = new ShowBalance (number, Double.toString(bank.getBalance(number)));
				ShowPanel(showbalance);
				while (showbalance.getFlag() == 10) {System.out.println("");/*waiting*/}
			} catch (BankTransactionException bte) {
				ShowError(bte.getMessage());
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		case 6:
			gnp = new GenericNumberPanel("Enter the account number");
			ShowPanel(gnp);
			while (gnp.getFlag() == 10) {System.out.println(""); /*waiting*/}
			if (gnp.getFlag() == 1)	return;
			number = gnp.getString();
			
			try {
				bank.removeAccount(number);
				success = new Success();
				ShowPanel(success);
				
				while (success.getFlag() == 10) {System.out.println("");/*waiting*/}
				if (success.getFlag() == 1){
					loop = false;
					ShowBye();
				}
			} catch (BankTransactionException bte) {
				ShowError(bte.getMessage());
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		case 7:
			gnp = new GenericNumberPanel("Enter the account number");
			ShowPanel(gnp);
			while (gnp.getFlag() == 10) {System.out.println(""); /*waiting*/}
			if (gnp.getFlag() == 1)	return;
			number = gnp.getString();
			try {
				bank.doEarnInterest(number);
				success = new Success();
				ShowPanel(success);
				
				while (success.getFlag() == 10) {System.out.println("");/*waiting*/}
				if (success.getFlag() == 1){
					loop = false;
					ShowBye();
				}
			} catch (BankTransactionException bte) {
				ShowError(bte.getMessage());
			} catch (IOException e) {
				e.printStackTrace();
			}

			break;
		case 8:
			gnp = new GenericNumberPanel("Enter the account number");
			ShowPanel(gnp);
			while (gnp.getFlag() == 10) {System.out.println(""); /*waiting*/}
			if (gnp.getFlag() == 1)	return;
			number = gnp.getString();
			try {
				bank.doEarnBonus(number);
				success = new Success();
				ShowPanel(success);
				
				while (success.getFlag() == 10) {System.out.println("");/*waiting*/}
				if (success.getFlag() == 1){
					loop = false;
					ShowBye();
				}
			} catch (BankTransactionException bte) {
				ShowError(bte.getMessage());
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;

		case 9:
			loop = false;
			ShowBye();
			break;

		default:
			break;
		}
	}

	private static int mainMenu() {
		Panel panel = new Panel();
		panel.setVisible(true);
		window.setContentPane(panel);
		window.revalidate();

		while (panel.getFlag() != 1) {System.out.println("");/*waiting*/}
		panel.setVisible(false);
		window.remove(panel);
		Panel2 panel2 = new Panel2();
		panel2.setVisible(true);
		window.setContentPane(panel2);
		window.revalidate();
		
		while (panel2.getOption() == 10) {System.out.println("");/*waiting*/}
		
		return panel2.getOption();
	}

	private static int addAccountMenu() {
		
		Panel3 panel3 = new Panel3();
		panel3.setVisible(true);
		window.setContentPane(panel3);
		window.revalidate();
		while (panel3.getOption() == 10) {System.out.println("");/*waiting*/}
		return panel3.getOption();
	}
	
	private static void ShowBye()
	{
		goodbye = new GoodBye();
		goodbye.setVisible(true);
		window.setContentPane(goodbye);
		window.revalidate();
		while (goodbye.getFlag() == 0) {System.out.println("");}
		window.setEnabled(false);
		window.dispose();
	}
	
	private static void ShowPanel(JPanel panel){
		panel.setVisible(true);
		window.setContentPane(panel);
		window.revalidate();
	}
		
	private static void ShowError(String msg){
		erscrn = new ErrorScreen(msg);
		erscrn.setVisible(true);
		window.setContentPane(erscrn);
		window.revalidate();
		while (erscrn.getFlag() == 10) {System.out.println("");/*waiting*/}
	}
}
