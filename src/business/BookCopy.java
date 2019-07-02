package business;
import java.util.*;

public class BookCopy {
	
	private String copyID;
	//private Date dueDate;
	private Book book;
	
	
	BookCopy(String copyID, Book book){
		this.copyID = copyID;
		//this.dueDate = dueDate;
		book.addBookCopy(this);	
	}


	public String getCopyID() {
		return copyID;
	}


	public void setCopyID(String copyID) {
		this.copyID = copyID;
	}

/*
	public Date getDueDate() {
		return dueDate;
	}


	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

*/
	public Book getBook() {
		return book;
	}


	public void setBook(Book book) {
		this.book = book;
	}


	@Override
	public String toString() {
		return "BookCopy [copyID=" + copyID + ", book=" + book + "]";
	}
	
	

}
