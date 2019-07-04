package business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import dataaccess.DataAccessFacade;
import exception.BookException;
import exception.InvalidArgumentException;
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
	private void savetoMemberList(List<LibraryMember> list) {
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
			throw new MemberException("Member ID Not Found");
		}
	}
	
	@Override
	public List<Book> getBooks() {
		HashMap<String,Book> booksList =  (HashMap<String, Book>) db.getBooksFromDB();
		List<Book> books = new ArrayList<>();
		booksList.forEach((k,v)->{
			books.add(v);
		});
		return books;
	}

	@Override
	public boolean addBook(String isbn, String title, int maxDays, Author author ) throws BookException, InvalidArgumentException {
		if(isbn == null || title == null || author == null) throw new InvalidArgumentException("Invalid entry || Enter all fields");
		Book toBeAdded = new Book(isbn,title,maxDays);
		toBeAdded.setAuthor(author);
		List<Book> tempList = getBooks();
		if(!tempList.contains(toBeAdded)) {
			tempList.add(toBeAdded);
			savetoBookList(tempList);
			return true;
		}else {
			throw new BookException("Book Already exists");
		}
	}

	public void savetoBookList(List<Book> tempList) {
		DataAccessFacade.loadBooksMap(tempList);
		
	}

	@Override
	public void addBookCopy(String id, String isdn) throws BookException,InvalidArgumentException{
		if(id == null || isdn == null || id.isEmpty() || isdn.isEmpty()) throw new InvalidArgumentException();
		List<Book> tempList = getBooks();
		tempList.forEach((book)->{
			if(book.getIsbn().equals(isdn)) {
				BookCopy newCopy = new BookCopy(id,book);
				book.addBookCopy(newCopy);
			}
		});

	}
	
	@SuppressWarnings("unchecked")
	public List<CheckoutRecordEntry> searchEntry(String memberID) throws MemberException{
		if(getMemberIDs().contains(memberID)) {
			int index = getMemberIDs().indexOf(memberID);
			return (List<CheckoutRecordEntry>) getMembers().get(index).getRecord();
		}
		throw new MemberException("Member not in DB!!!!");
	}
	
	public String bookLookUp(String isdn) throws InvalidArgumentException {
		if(isdn == null || isdn.isEmpty()) throw new InvalidArgumentException("Fields cannnot be empty");
		StringBuilder sb = new StringBuilder();
		List<Book> tempList = getBooks();
		tempList.forEach((book)->{
			if(book.getIsbn().equals(isdn)) {
				sb.append("Book Title : "+book.getTitle()+"\n"+"ISBN : "+book.getIsbn()+"\n"+"Author : "+book.getAuthor()+"\n"+"Total Copies :"+book.getBookCopies().size());
			}
		});
		return sb.toString();
	}

	

}
