package business;

public class Librarian extends Person{
	private String role;

	Librarian(String firstName, String lastName, String phone) {
		super(firstName, lastName, phone, null);
		this.role = "librarian";
	}
	
	public String getRole() {
		return role;
	}

}
