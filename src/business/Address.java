package business;

public class Address {
	private String state;
	private String city;
	private int zipCode;
	private String street;
	private Person person;
	
	Address(String state, String city, String street, int zipCode, Person person){
		this.state = state;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		person.setAddress(this);
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

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
	
}
