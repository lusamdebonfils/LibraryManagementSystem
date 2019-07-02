package business;

import java.io.Serializable;
import java.time.LocalDate;

public class LibraryMember extends Person implements Serializable {
	private CheckoutRecord record = new CheckoutRecord();
	public LibraryMember(String firstName, String lastName, String phone, String memeberID) {
		super(firstName, lastName, phone);
		this.memeberID =  memeberID;
	}
	
	private String memeberID;
	
	public void checkout(LendableCopy copy, LocalDate checkoutDate, LocalDate dueDate) {
		CheckoutRecordEntry entry = new CheckoutRecordEntry(copy, checkoutDate, dueDate);
		record.addEntry(entry);
		
	}
	
	public String toString() {
		return "Checkout record for library member " + memeberID + ": " + record;
	}
	
	private static final long serialVersionUID = -2226197306790714013L;
}
