package business;
import java.util.*;

public interface ControllerInterface {
	void addCheckOutRecord();
	List<LibraryMember> getMembers();
	List<Administrator> getAdmins();
	List<Librarian> getLibrarians();
	List<Book> getBooks();
	void addBook();
	Book editBook();
	void addLibMember(LibraryMember libMember);
	
	
	
}
