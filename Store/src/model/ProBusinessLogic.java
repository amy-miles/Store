package model;



/**
 * @author Amy Miles - almiles
 * CIS 175 - Fall 2021
 * Aug 30, 2021
 * this class contains methods to calculate the Sale Price and check if an item is in stock
 */
public class ProBusinessLogic {
	
	public double calculateSalePrice(Product product) {
		double price = 0.0;
	    price = product.getPrice() * .9;
		return price * .90;
	}
	
	public boolean checkInStock(Product product) {
		int count = product.getCount();
		if (count >= 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	
	

}
