package business;

public class Administrator extends Person{
	private String role;

	Administrator(String firstName, String lastName, String phone) {
		super(firstName, lastName, phone);
		this.role = "admin";
	}
	
	public String getRole() {
		return role;
	}

}