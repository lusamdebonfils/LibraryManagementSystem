package business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import dataaccess.DataAccessFacade;
import exception.MemberException;
import exception.UserException;

public class SystemController implements ControllerInterface {
	
	
	public UserType currentUserType;
	DataAccessFacade db = new DataAccessFacade();
	
	public void login(String uid, String password) throws UserException {
		//Do validation from here and compare with usersList from DB
		if(uid == null || password == null || uid.isEmpty() || password.isEmpty()) {
			throw new UserException("Password and Username cannot be empty");
		}
		
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
		//To be done by Mr Kedi
	}

	@Override
	public List<LibraryMember> getMembers() {
		HashMap<String,LibraryMember> membersSet =  (HashMap<String, LibraryMember>) db.getMembersFromDB();
		List<LibraryMember> members = new ArrayList<>();
		membersSet.forEach((k,v)->{
			members.add(v);
		});
		return members;
	}
	@Override
	public List<String> getMemberIDs() {
		List<String> memberIDs = new ArrayList<>();
		List<LibraryMember> members = getMembers();
		members.forEach((k)->{
			memberIDs.add(k.getMemeberID());
		});
		return memberIDs;
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
		List<Book> books = (List<Book>) db.getBooksFromDB().values();
		return books;
	}

	@Override
	public boolean addLibMember(String firstName, String lastName, String phone, String memeberID, String street, String city, String state, String zip) throws MemberException {
		
		LibraryMember libMember = new LibraryMember(firstName, lastName, phone, memeberID);
		Address address = new Address(state, city, street, zip);
		libMember.setAddress(address);
		List<LibraryMember> newList = getMembers();
		if(!newList.contains(libMember)) {
			newList.add(libMember);
			savetoMemberList(newList);
			return true;
		}else {
			throw new MemberException("Member exists");
		}
	
	}
	public void savetoMemberList(List<LibraryMember> list) {
		DataAccessFacade.loadMembersMap(list);
	}

	@Override
	public LibraryMember editLibMember(String MemberID) throws MemberException {
		List<String> newListIds = getMemberIDs();
		if(newListIds.contains(MemberID)) {
			List<LibraryMember> newList = getMembers();
			int index = newListIds.indexOf(MemberID);
			LibraryMember removed = newList.get(index);
			newList.remove(index);
			savetoMemberList(newList);
			return removed;
		}else {
			throw new MemberException("Membber ID Not Found");
		}
	}

	@Override
	public boolean addBook(Book book) {
		
		return false;
	}

	@Override
	public boolean addBookCopy(BookCopy copy) {
		
		getBooks().forEach((book)->{
			
		});
		return false;
	}
	
	
	
	

}
