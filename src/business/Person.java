package business;
import java.util.*;

public abstract class Person {
	
	private String firstName;
	private String lastName;
	private String phone;
	//private Address address;
	private List<Address> addresses;
	
	Person(String firstName, String lastName, String phone){
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		//address = new Address();
		//this.addresses = address;
		addresses = new ArrayList<Address>();
	}
	
	public void setAddress(Address address) {
		//this.address = address;
		addresses.add(address);
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Address> getAddress() {
		return addresses;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + ", address=" + addresses
				+ "]";
	}

	
	

}
