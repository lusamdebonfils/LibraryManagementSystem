package business;

import java.io.Serializable;

public class Address implements Serializable {
	private String state;
	private String city;
	private String zipCode;
	private String street;
	
	public Address(String state, String city, String street, String zipCode){
		setState(state);
		setCity(city);
		setStreet(street);
		setZipCode(zipCode);
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(street+"/n"+ city + ", "+ state + ", " + zipCode);
		return sb.toString();
	}
	
	
}
