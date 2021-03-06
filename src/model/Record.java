package model;

import java.io.Serializable;
import java.util.Calendar;

/**
* <b>Description:</b> The abstract class Record in the package model.<br>
* @author VoodLyc & Esarac.
*/

public abstract class Record implements Serializable{

	//Attributes
	private Calendar entryDate;
	private Calendar departureDate;
	private double price;
	
	//Constructor
	
	/**
	 * <b>Description:</b> Creates a new instance of Record.<br>
	 * @param entryDate The entry date of the vehicle in the parking.
	 */
	
	public Record(Calendar entryDate) {
		this.entryDate=entryDate;
	}
	
	//Setters
	
	/**
	 * <b>Description:</b> Sets the value of the attribute departureDate.<br>
	 * @param departureDate the departureDate. 
	 */
	
	public void setDepartureDate(Calendar departureDate) {
		this.departureDate=departureDate;
	}
	
	/**
	 * <b>Description:</b> Sets the value of the attribute price.<br>
	 * @param price the price. 
	 */
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	//Getters
	
	/**
	 * <b>Description:</b> Gets the value of the attribute entryDate.<br>
	 * @return The attribute entryDate.
	 */
	
	public Calendar getEntryDate() {
		return entryDate;
	}
	
	/**
	 * <b>Description:</b> Gets the value of the attribute departureDate.<br>
	 * @return The attribute departureDate.
	 */
	
	public Calendar getDepartureDate() {
		return departureDate;
	}
	
	/**
	 * <b>Description:</b> Gets the value of the attribute price.<br>
	 * @return The attribute price.
	 */
	
	public double getPrice(){
		return price;
	}
	
}