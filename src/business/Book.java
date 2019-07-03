package business;
import java.util.*;
import java.io.Serializable;

public class Book implements Serializable {
	private String isbn;
	private String title;
	private Author author;
	private boolean available = false;
	private ArrayList<BookCopy> bookCopies;
	private int maxDays;
	
	public Book(String isbn, String title, int maxDays){
		this.maxDays = maxDays;
		this.isbn = isbn;
		this.title = title;
		bookCopies = new ArrayList<BookCopy>();
	}
	public boolean isAvailable() {
		return available;
	}
	
	public void addBookCopy(BookCopy bookCopy) {
		available = true;
		bookCopies.add(bookCopy);
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
}
