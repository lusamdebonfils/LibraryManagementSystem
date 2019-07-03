package business;
import java.util.*;

import java.io.Serializable;
/*
public class Book extends Publication implements Serializable {
	private int id;
	private String isbn;
	private boolean available;
	public Book(int id, String isbn, String title) {
		super(title);
		this.id = id;
		this.isbn = isbn;
	}
	public void isAvailable(boolean b) {
		available = b;
	}
	@Override
	public String toString() {
		return "id: " + id + ", isbn: " + isbn + ", available: " + available;
	}

}
*/
public class Book {
	private String isbn;
	private String title;
	private Author author;
	private boolean available = false;
	private ArrayList<BookCopy> bookCopies;
	
	public Book(String isbn, String title){
		this.isbn = isbn;
		this.title = title;
		bookCopies = new ArrayList<BookCopy>();
	}
	public boolean isAvailable() {
		return bookCopies.size() > 0;
	}
	
	public void addBookCopy(BookCopy bookCopy) {
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
