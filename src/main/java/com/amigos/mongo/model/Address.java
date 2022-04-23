package com.amigos.mongo.model;

public class Address {
	private String country;
	private String city;
	private String pin;
	/**
	 * 
	 */
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param country
	 * @param city
	 * @param pin
	 */
	public Address(String country, String city, String pin) {
		super();
		this.country = country;
		this.city = city;
		this.pin = pin;
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
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the pin
	 */
	public String getPin() {
		return pin;
	}
	/**
	 * @param pin the pin to set
	 */
	public void setPin(String pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [country=" + country + ", city=" + city + ", pin=" + pin + "]";
	}
	
}
