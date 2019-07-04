package business;

import java.io.Serializable;

public class BookCopy implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String copyID;
	private Book book;
	
	BookCopy(String copyID, Book book){
		this.copyID = copyID;
		this.book = book;
		this.book.addBookCopy(this); 
	}

	public String getCopyID() {
		return copyID;
	}

	public void setCopyID(String copyID) {
		this.copyID = copyID;
	}

	public Book getBook() {
		return book;
	}
	

}
