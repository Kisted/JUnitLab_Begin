package csc131.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;
//import org.junit.rules.ExpectedException;

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
	public void deductInvalidAmount() {
		
		double balance;
		int issuingstore;
		GiftCard card;
		
		issuingstore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingstore, balance);
		
		assertEquals("deduct():Invalid Number","Invalid Transaction",card.deduct(-1337));
	}
	
	@Test
	public void deductValidAmountWCardBalance() {
		
		double balance;
		int issuingstore;
		GiftCard card;
		
		issuingstore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingstore, balance);
		
		assertEquals("deduct():Invalid Number","Remaining Balance: " + String.format("%6.2f",63.00),card.deduct(37));
		
	}
	
	@Test
	public void deductValidAmountWAmountDue() {
		
		double balance;
		int issuingstore;
		GiftCard card;
		
		issuingstore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingstore, balance);
		
		assertEquals("deduct():Invalid Number","Amount Due: "+ String.format("%6.2f",37.00),card.deduct(137));
		
	}
	
	@Test
	public void constructor_Illegal_Balance() {	
		assertThrows(IllegalArgumentException.class, () -> {new GiftCard(1, -100.00);});
	}
	
	@Test
	public void constructor_IncorrectID_Low(){
		assertThrows(IllegalArgumentException.class, () -> {new GiftCard(-1, 100.00);});
		
		
	}
	
	@Test
	public void constructor_IncorrectID_High(){

	    assertThrows(IllegalArgumentException.class, () -> {new GiftCard(10000, 100.00);});

	}
}
