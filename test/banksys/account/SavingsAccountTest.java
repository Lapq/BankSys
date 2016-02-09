package banksys.account;

import static org.junit.Assert.*;

import org.junit.Test;

import banksys.account.exception.NegativeAmountException;

public class SavingsAccountTest {

	@Test
	public void testSavingsAccount() {
		AbstractAccount account = new SavingsAccount("11111");
		assertEquals("11111", account.getNumber());
	}

	@Test
	public void testEarnInterest() throws NegativeAmountException {
		AbstractAccount account = new SavingsAccount("11111");
		double amount = 100.0;
		account.credit(amount);
		((SavingsAccount) account).earnInterest();
		assertEquals(100.1, account.getBalance(), 0);
	}
}