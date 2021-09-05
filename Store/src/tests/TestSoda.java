package tests;
import model.ProBusinessLogic;
import model.Soda;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Amy Miles - almiles
 * CIS 175 - Fall 2021
 * Aug 30, 2021
 * This tests the sale price and tests if a product is in stock
 */
public class TestSoda {

	ProBusinessLogic proLogic = new ProBusinessLogic();
	Soda orangeSoda = new Soda("Orange Crush", "Dr.Pepper", 2.5, 100, "2-liter");
	//variable for testing calculateSalePrice()
	double fifteenPercent = 15;
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateSalePrice() {		
		double salePrice = proLogic.calculateSalePrice(orangeSoda, fifteenPercent);
		assertEquals(2.125, salePrice, 0.00);
	}
	
	@Test
	public void testCheckInStock() {		
		assertTrue(proLogic.checkInStock(orangeSoda));
	}	
	
	@Test 
	public void testOutOfStock() {
		orangeSoda.setCount(0);
		assertFalse(proLogic.checkInStock(orangeSoda));
	}

}
