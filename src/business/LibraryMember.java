package business;


import java.io.Serializable;
import java.util.*;

public class LibraryMember extends Person implements Serializable {
	
	
	private List<CheckoutRecordEntry> record;
	
	
	public LibraryMember(String firstName, String lastName, String phone, String memeberID) {
		super(firstName, lastName, phone, null);
		record = new LinkedList<>();
		this.memeberID =  memeberID;
	}
	
	private String memeberID;
	
	public String getMemeberID() {
		return memeberID;
	}

	public void addCheckout(CheckoutRecordEntry entry) {
		record.add(entry);
	}

	public List<CheckoutRecordEntry> getEntries() {
		return record;
	}
	
	private static final long serialVersionUID = -2226197306790714013L;
}
