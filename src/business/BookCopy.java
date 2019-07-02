package business;

public class BookCopy {
	
	private String copyID;
<<<<<<< HEAD
	private Period maxPeriod;
	private Book book;
	
	
	public BookCopy(String copyID, Period maxPeriod, Book book){
		this.copyID = copyID;
		this.maxPeriod = maxPeriod;
=======
	//private Date dueDate;
	private Book book;
	
	
	BookCopy(String copyID, Book book){
		this.copyID = copyID;
		//this.dueDate = dueDate;
>>>>>>> 9a812e202188309ee93e970305499cdce01e0885
		book.addBookCopy(this);	
	}

	public String getCopyID() {
		return copyID;
	}

<<<<<<< HEAD
	public Period getDueDate() {
		return maxPeriod;
	}

=======

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
>>>>>>> 9a812e202188309ee93e970305499cdce01e0885
	public Book getBook() {
		return book;
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		return "BookCopy [copyID=" + copyID + ", maxPeriod=" + maxPeriod + ", book=" + book + "]";
=======
		return "BookCopy [copyID=" + copyID + ", book=" + book + "]";
>>>>>>> 9a812e202188309ee93e970305499cdce01e0885
	}
	

	
	

}
