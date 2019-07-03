package business;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import dataaccess.DataAccessFacade;
import exception.UserException;

public class SystemController implements ControllerInterface {
	
	
	public UserType currentUserType;
	
	public void login(String uid, String password) throws UserException {
		//Do validation from here and compare with usersList from DB
		if(uid == null || password == null || uid.isEmpty() || password.isEmpty()) {
			throw new UserException("Password and Username cannot be empty");
		}
		DataAccessFacade db = new DataAccessFacade();
		HashMap<String, User> usersList = db.getUsersFromDB();

		if (!usersList.containsKey(uid)) {
			throw new UserException("ID " + uid + " not found.");
		}

		String storedPassword = usersList.get(uid).getUserPassword();

		if (!storedPassword.equals(password)) {
			throw new UserException("Password incorrect.");
		}
		currentUserType = usersList.get(uid).getType();
		//If user is admin show Admin section else show librarian section
		
	}
	
	

	@Override
	public void addCheckOutRecord() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<LibraryMember> getMembers() {
		// TODO Auto-generated method stub
		//CheckDB and store things here
		return null;
	}

	@Override
	public List<Administrator> getAdmins() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Librarian> getLibrarians() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addLibMember(LibraryMember libMember) {
		// TODO Auto-generated method stub
		if(getMembers().add(libMember)) {
			return true;
		}
		return false;
		
	}

	@Override
	public boolean editLibMember(LibraryMember libMember) {
		if(getMembers().contains(libMember)) {
			getMembers().add(libMember);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean addBook() {
		
		return false;
	}

	@Override
	public boolean addBookCopy() {
		
		getBooks().forEach((book)->{
			
		});
		return false;
	}
	
	
	
	

}
