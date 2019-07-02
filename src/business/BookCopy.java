package business;

public class BookCopy {
	
	private String copyID;
	private Period maxPeriod;
	private Book book;
	
	
	public BookCopy(String copyID, Period maxPeriod, Book book){
		this.copyID = copyID;
		this.maxPeriod = maxPeriod;
	
	}
	BookCopy(String copyID, Book book){
		this.copyID = copyID;
		//this.dueDate = dueDate;
		book.addBookCopy(this);	
	}

	public String getCopyID() {
		return copyID;
	}

	public Period getDueDate() {
		return maxPeriod;
	}
	public void setCopyID(String copyID) {
		this.copyID = copyID;
	}

	public Book getBook() {
		return book;
	}

	@Override
	public String toString() {
		return "BookCopy [copyID=" + copyID + ", maxPeriod=" + maxPeriod + ", book=" + book + "]";

	}
	

	
	

}
