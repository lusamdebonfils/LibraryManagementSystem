package business;
import java.util.*;

import exception.BookException;
import exception.InvalidArgumentException;
import exception.MemberException;

public interface ControllerInterface {
	void addCheckOutRecord();
	List<LibraryMember> getMembers();
	List<Book> getBooks();
	boolean addBook(String isbn, String title, int maxDays, Author author ) throws BookException,InvalidArgumentException;
	void addBookCopy(String id, String isdn) throws BookException,InvalidArgumentException;
	boolean addLibMember(String firstName, String lastName, String phone, 
			String memeberID, String street, String city, String state, String zip) throws MemberException;
	LibraryMember editLibMember(String MemberID) throws MemberException;
	List<String> getMemberIDs();

	
}
