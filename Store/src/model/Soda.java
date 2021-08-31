package model;

/**
 * @author Amy Miles - almiles
 * CIS 175 - Fall 2021
 * Aug 30, 2021
 */
public class Soda extends Product{
	
	private String form;
	
	
	/**
	 * default no-arg constructor
	 */
	public Soda() {
		
	}
	
	/**
	 * Constructor that inherits fields from super and adds form variable from soda class
	 * @param name
	 * @param manufacturer
	 * @param price
	 * @param count
	 */
	public Soda(String name, String manufacturer, double price, int count, String form) {
		super(name, manufacturer, price, count);
		this.form = form;
	}
	

	/**
	 * @return the form
	 */
	public String getForm() {
		return form;
	}


	/**
	 * @param form the form to set
	 */
	public void setForm(String form) {
		this.form = form;
	}


	@Override
	public String toString() {
		return "Soda [form=" + form + ", getName()=" + getName() + ", getManufacturer()=" + getManufacturer()
				+ ", getPrice()=" + getPrice() + ", getCount()=" + getCount() + "]";
	}






	

	
	
	
	
	
	
	
	
	
	

}
