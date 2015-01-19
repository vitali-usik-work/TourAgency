package by.bntu.touragency.model;

import java.io.Serializable;
import java.sql.Date;

/**
 * Class for building Car
 *
 */
public class Tour implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private double cost;
	private String transport;
	private Date date_from;
	private Date date_to;
	private String country;
	private int hotel;
	private String type_of_trip;
	private int free_places;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}

	/**
	 * @return the transport
	 */
	public String getTransport() {
		return transport;
	}

	/**
	 * @param transport the transport to set
	 */
	public void setTransport(String transport) {
		this.transport = transport;
	}

	/**
	 * @return the date_from
	 */
	public Date getDate_from() {
		return date_from;
	}

	/**
	 * @param date_from the date_from to set
	 */
	public void setDate_from(Date date_from) {
		this.date_from = date_from;
	}

	/**
	 * @return the date_to
	 */
	public Date getDate_to() {
		return date_to;
	}

	/**
	 * @param date_to the date_to to set
	 */
	public void setDate_to(Date date_to) {
		this.date_to = date_to;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the hotel
	 */
	public int getHotel() {
		return hotel;
	}

	/**
	 * @param hotel the hotel to set
	 */
	public void setHotel(int hotel) {
		this.hotel = hotel;
	}

	/**
	 * @return the type_of_trip
	 */
	public String getType_of_trip() {
		return type_of_trip;
	}

	/**
	 * @param type_of_trip the type_of_trip to set
	 */
	public void setType_of_trip(String type_of_trip) {
		this.type_of_trip = type_of_trip;
	}

	/**
	 * @return the free_places
	 */
	public int getFree_places() {
		return free_places;
	}

	/**
	 * @param free_places the free_places to set
	 */
	public void setFree_places(int free_places) {
		this.free_places = free_places;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 
	 */
	public Tour() {
	}
	
	
}