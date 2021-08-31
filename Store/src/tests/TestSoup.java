package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Soup;

/**
 * @author Amy Miles - almiles
 * CIS 175 - Fall 2021
 * Aug 30, 2021
 */
public class TestSoup {

	
	Soup soup = new Soup("Double Noodles", "Capbell's", 1.50, 300, 16.0);
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test//soup does not have a no-arg constructor, fields cannot be null
	public void testHasName() {
		assertNotNull(soup.getName());
	}


}
