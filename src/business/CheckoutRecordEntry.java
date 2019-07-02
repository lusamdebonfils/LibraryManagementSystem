package business;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import dataaccess.DataAccessFacade;

public class CheckoutRecordEntry implements Serializable {
	
	private BookCopy bookCopy;
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	
	public CheckoutRecordEntry(BookCopy bookCopy, LocalDate checkoutDate, LocalDate dueDate){ 
		this.bookCopy = bookCopy;
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
	}
	
	
	public String toString() {
		return "[" + "checkoutdate:" + 
	        checkoutDate.format(DateTimeFormatter.ofPattern(DataAccessFacade.DATE_PATTERN)) +
	        ", dueDate: " + dueDate.format(DateTimeFormatter.ofPattern(DataAccessFacade.DATE_PATTERN)) +
	        ", publication: " + bookCopy + "]";
	}
}
