package business;

public class BookCopy {
	
	private String copyID;
	private Period maxPeriod;
	private Book book;
	
	
	public BookCopy(String copyID, Period maxPeriod, Book book){
		this.copyID = copyID;
		this.maxPeriod = maxPeriod;
		book.addBookCopy(this);	
	}

	public String getCopyID() {
		return copyID;
	}

	public Period getDueDate() {
		return maxPeriod;
	}

	public Book getBook() {
		return book;
	}

	@Override
	public String toString() {
		return "BookCopy [copyID=" + copyID + ", maxPeriod=" + maxPeriod + ", book=" + book + "]";
	}
	

	
	

}
