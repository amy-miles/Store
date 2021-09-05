package model;



/**
 * @author Amy Miles - almiles
 * CIS 175 - Fall 2021
 * Aug 30, 2021
 * this class contains methods to calculate the Sale Price and check if an item is in stock
 */
public class ProBusinessLogic {	
	
	/**
	 * this method takes a product and a discount in the form "10" or "15" and calculates the salePrice
	 * @param product
	 * @param percent
	 * @return ssalePrice
	 */
	public double calculateSalePrice(Product product, double percent) {
		double price = 0.0;
		price = product.getPrice();	    
	    double discount = price * (percent / 100);
	    double salePrice = price - discount;
		return salePrice;
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
