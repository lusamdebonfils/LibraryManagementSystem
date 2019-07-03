package business;
import java.util.*;

import exception.MemberException;

public interface ControllerInterface {
	void addCheckOutRecord();
	List<LibraryMember> getMembers();
	List<Administrator> getAdmins();
	List<Librarian> getLibrarians();
	List<Book> getBooks();
	boolean addBook(Book book);
	boolean addBookCopy(BookCopy bookCopy);
	boolean addLibMember(String firstName, String lastName, String phone, 
	String memeberID, String street, String city, String state, String zip) throws MemberException;
	LibraryMember editLibMember(String MemberID) throws MemberException;
	List<String> getMemberIDs();

	
}
