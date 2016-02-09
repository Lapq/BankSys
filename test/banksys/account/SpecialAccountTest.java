package banksys.account;

import static org.junit.Assert.*;

import org.junit.Test;

import banksys.account.exception.NegativeAmountException;

public class SpecialAccountTest {

	@Test
	public void testSpecialAccount() {
		AbstractAccount account = new SpecialAccount("11111");
		assertEquals("11111", account.getNumber());
	}
	
	@Test
	public void testEarnBonus() throws NegativeAmountException {
		AbstractAccount account = new SpecialAccount("11111");
		account.credit(10.0);
		((SpecialAccount) account).earnBonus();
		assertEquals(10.1, account.getBalance(), 0);
	}
	
	@Test
	public void testGetBonus() throws NegativeAmountException {
		AbstractAccount account = new SpecialAccount("11111");
		account.credit(100.0);
		assertEquals(1.0, ((SpecialAccount) account).getBonus(), 0);
	}
	
	@Test
	public void testCredit() throws NegativeAmountException {
		AbstractAccount account = new SpecialAccount("11111");
		account.credit(100.0);
		assertEquals(100.0, account.getBalance(), 0);
	}
	
	@Test (expected = NegativeAmountException.class)
	public void testNegativeAmount() throws NegativeAmountException {
		AbstractAccount account = new SpecialAccount("11111");
		account.credit(-100.0);
		assertEquals(0, account.getBalance(), 0);
	}
}