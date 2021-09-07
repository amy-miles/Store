package model;

/**
 * @author Amy Miles - almiles
 * CIS 175 - Fall 2021
 * Aug 30, 2021
 * this class is the super class for the products. 
 */
public class Product {

	private String name;
	private String manufacturer;
	private double price;
	private int count;
	
	/**
	 * default no-arg constructor
	 */
	public Product() {
		
	}	
	
	/**
	 * Constructor with params
	 * @param name accepts a String argument
	 * @param manufacturer accepts a String argument
	 * @param price accepts a double argument
	 * @param count accepts an int argument
	 */
	public Product(String name, String manufacturer, double price, int count) {
		this.name = name;
		this.manufacturer = manufacturer;
		this.price = price;
		this.count = count;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", manufacturer=" + manufacturer + ", price=" + price + ", count=" + count
				+ "]";
	}
	
	
	
	
	
	
}
