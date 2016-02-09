package banksys.account;

import static org.junit.Assert.*;

import org.junit.Test;

import banksys.account.exception.InsufficientFundsException;
import banksys.account.exception.NegativeAmountException;

public class TaxAccountTest {

	@Test
	public void testTaxAccount() {
		AbstractAccount account = new TaxAccount("11111");
		assertEquals("11111", account.getNumber());
	}
	
	@Test
	public void testDebit() throws NegativeAmountException, InsufficientFundsException {
		AbstractAccount account = new TaxAccount("11111");
		double creditAmount = 100.0;
		double debitAmount = 50.0;
		account.credit(creditAmount);
		account.debit(debitAmount);
		assertEquals(49.95, account.getBalance(), 0);
	}
	
	@Test (expected = NegativeAmountException.class)
	public void testNegativeAmmount() throws NegativeAmountException, InsufficientFundsException {
		AbstractAccount account = new TaxAccount("11111");
		double amount = -10.0;
		account.debit(amount);
		assertEquals(0, account.getBalance(), 0);
	}
	
	@Test (expected = InsufficientFundsException.class)
	public void testInsufficientFunds() throws NegativeAmountException, InsufficientFundsException {
		AbstractAccount account = new TaxAccount("11111");
		double amount = 10.0;
		account.debit(amount);
		assertEquals(0, account.getBalance(), 0);
	}
}