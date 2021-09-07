package model;

/**
 * @author Amy Miles - almiles
 * CIS 175 - Fall 2021
 * Aug 30, 2021
 * 
 */
public class Soup extends Product {
	
	private double sizeInOunces;


	/**
	 * Constructor for Soup class that inherits the fields from the super class, product
	 * @param name accepts a String argument
	 * @param manufacturer accepts a String argument
	 * @param price accepts a double argument
	 * @param count accepts an int argument
	 * @param sizeInOunces accepts a double argument
	 */
	public Soup(String name, String manufacturer, double price, int count, double sizeInOunces) {
		super(name, manufacturer, price, count);
		this.sizeInOunces = sizeInOunces;
	}

	/**
	 * @return the sizeInOunces
	 */
	public double getSizeInOunces() {
		return sizeInOunces;
	}

	/**
	 * @param sizeInOunces the sizeInOunces to set
	 */
	public void setSizeInOunces(double sizeInOunces) {
		this.sizeInOunces = sizeInOunces;
	}

	@Override
	public String toString() {
		return "Soup [sizeInOunces=" + sizeInOunces + ", getName()=" + getName() + ", getManufacturer()="
				+ getManufacturer() + ", getPrice()=" + getPrice() + ", getCount()=" + getCount() + "]";
	}
	
	

	
	
	

}
