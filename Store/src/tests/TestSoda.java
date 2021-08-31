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
	Soda soda = new Soda();
	

		
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateSalePrice() {
		soda.setPrice(3.00);
		double salePrice = proLogic.calculateSalePrice(soda);
		assertEquals(2.43, salePrice, 0.00);
	}
	
	@Test
	public void testCheckInStock() {
		soda.setCount(80);
		assertTrue(proLogic.checkInStock(soda));
	}
	

}
