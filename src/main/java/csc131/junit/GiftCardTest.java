package csc131.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GiftCardTest{
	
	@Test
	public void getIssuingStore() {
		
		double balance;
		GiftCard card;
		int issuingStore;
		
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		
		assertEquals("getIssuingStore()", issuingStore, card.getIssuingStore());
		
		//assertEquals("getBalance()",balance, card.getBalance(), .001);
		
	}
	
	@Test
	//tests the getBalance() function
	public void getBalance() {
		
		double balance;
		int issuingstore;
		GiftCard card;
		
		issuingstore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingstore, balance);
		
		assertEquals("getBalance()",balance, card.getBalance(), .001);
		
	}
	
	@Test
	public void deduct() {
		
		double balance;
		int issuingstore;
		GiftCard card;
		
		issuingstore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingstore, balance);
		
		assertEquals("deduct()","Invalid Transaction",card.deduct(-1337));
	}
}