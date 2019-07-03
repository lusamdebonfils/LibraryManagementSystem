package business;
import java.util.*;

public interface ControllerInterface {
	void addCheckOutRecord();
	Set<LibraryMember> getMembers();
	List<Administrator> getAdmins();
	List<Librarian> getLibrarians();
	List<Book> getBooks();
	void addBook();
	Book editBook();
	boolean addLibMember(LibraryMember libMember);
	boolean editLibMember(LibraryMember libMember);

	
}
