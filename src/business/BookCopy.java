package business;

public class BookCopy {
	
	private String copyID;
	private int maxPeriod;
	private Book book;
	
	
	public BookCopy(String copyID, int maxPeriod, Book book){
		this(copyID,book);
		this.maxPeriod = maxPeriod;
	
	}
	BookCopy(String copyID, Book book){
		this.copyID = copyID;
		this.book = book;
	}

	public String getCopyID() {
		return copyID;
	}

	public int getMaxPeriod() {
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
