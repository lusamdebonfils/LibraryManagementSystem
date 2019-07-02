package business;

public class Address {
	private String state;
	private String city;
	private int zipCode;
	private String street;
	
	public Address(String state, String city, String street, int zipCode){
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
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(street+"/n"+ city + ", "+ state + ", " + Integer.toString(zipCode));
		return sb.toString();
	}
	
	
}
