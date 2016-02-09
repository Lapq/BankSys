package banksys.account;

import static org.junit.Assert.*;

import org.junit.Test;
import banksys.account.exception.InsufficientFundsException;
import banksys.account.exception.NegativeAmountException;

public class AbstractAccountTest {

	@Test
	public void testAccount() {
		AbstractAccount account = new OrdinaryAccount("11111");
		assertEquals("11111", account.getNumber());
	}

	@Test
	public void testCredit() throws NegativeAmountException {
		AbstractAccount account = new OrdinaryAccount("11111");
		double amount = 1.2;
		account.credit(amount);
		assertEquals(amount, account.getBalance(), 0);
	}
	
	@Test (expected = NegativeAmountException.class)
	public void testNegativeAmount() throws NegativeAmountException {
		AbstractAccount account = new OrdinaryAccount("11111");
		double amount = -1.5;
		account.credit(amount);
		assertEquals(0, account.getBalance(), 0);
	}

	@Test
	public void testDebit() throws NegativeAmountException, InsufficientFundsException {
		AbstractAccount account = new OrdinaryAccount("11111");
		double creditAmount = 3.0;
		double debitAmount = 1.0;
		account.credit(creditAmount);
		account.debit(debitAmount);
		assertEquals(2, account.getBalance(), 0);
	}
	
	@Test (expected = NegativeAmountException.class)
	public void testNegativeDebit() throws NegativeAmountException, InsufficientFundsException {
		AbstractAccount account = new OrdinaryAccount("11111");
		double amount = -1.0;
		account.debit(amount);
		assertEquals(0, account.getBalance(), 0);
	}
	
	@Test (expected = InsufficientFundsException.class)
	public void testInsufficientFunds() throws NegativeAmountException, InsufficientFundsException {
		AbstractAccount account = new OrdinaryAccount("11111");
		double amount = 1;
		account.debit(amount);
		assertEquals(0, account.getBalance(), 0);
	}

	@Test
	public void testGetNumber() {
		AbstractAccount account = new OrdinaryAccount("11111");
		assertEquals("11111", account.getNumber());
	}

	@Test
	public void testGetBalance() {
		AbstractAccount account = new OrdinaryAccount("11111");
		assertEquals(0, account.getBalance(), 0);
	}
}