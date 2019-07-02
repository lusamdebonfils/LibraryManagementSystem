package business;

import java.io.Serializable;
import java.time.LocalDate;

public class LibraryMember extends Person implements Serializable {
	
	private CheckoutRecord record;
	
	public LibraryMember(String firstName, String lastName, String phone, String memeberID) {
		super(firstName, lastName, phone);
		record = new CheckoutRecord();
		this.memeberID =  memeberID;
	}
	
	private String memeberID;
	
	public void checkout(BookCopy bookCopy, LocalDate checkoutDate, LocalDate dueDate) {
		CheckoutRecordEntry entry = new CheckoutRecordEntry(bookCopy, checkoutDate, dueDate);
		record.addEntry(entry);
	}

	
	public String toString() {
		return "Checkout record for library member " + memeberID + ": " + record;
	}
	
	private static final long serialVersionUID = -2226197306790714013L;
}
