package dataaccess;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;

import business.Author;
import business.Book;
import business.LibraryMember;
import business.User;

public class DataAccessFacade implements DataAccess {
	
	public static final String OUTPUT_DIR = System.getProperty("user.dir") 
			+ "\\src\\dataaccess\\storage";
	public static final String DATE_PATTERN = "MM/dd/yyyy";
	
	
	public static void loadUserMap(List<User> userList) {
		HashMap<String, User> users = new HashMap<>();
		userList.forEach((user) -> {
			users.put(user.getUserID() ,user);
			});
		saveToStorage(StorageType.USERS, users);
	}
	
	public static void loadAuthorsMap(List<Author> authorsList) {
		HashMap<String, Author> authors = new HashMap<>();
		authorsList.forEach((author) -> {
			authors.put(author.getAuthorCredentials() ,author);
			});
		saveToStorage(StorageType.AUTHORS, authors);
	}
	
	public static void loadMembersMap(List<LibraryMember> memberList) {
		HashMap<String, LibraryMember> members = new HashMap<>();
		memberList.forEach((member) -> {
			members.put(member.getMemeberID() , member);
			});
		saveToStorage(StorageType.MEMBERS, members);
	}
	
	public static void loadBooksMap(List<Book> bookList) {
		HashMap<String, Book> books = new HashMap<>();
		bookList.forEach((book) -> {
			books.put(book.getIsbn() , book);
			});
		saveToStorage(StorageType.BOOKS, books);
	}
	
	
	public HashMap<String,User> getUsersFromDB() {
		return (HashMap<String, User>) readFromStorage(StorageType.USERS);
	}
	
	public HashMap<String,Author> getAuthorsFromDB() {
		return (HashMap<String, Author>) readFromStorage(StorageType.AUTHORS);
	}
	public HashMap<String,LibraryMember> getMembersFromDB() {
		return (HashMap<String, LibraryMember>) readFromStorage(StorageType.MEMBERS);
	}
	public HashMap<String, Book> getBooksFromDB() {
		return (HashMap<String, Book>) readFromStorage(StorageType.BOOKS);
	}

	enum StorageType {
		BOOKS, MEMBERS, USERS, AUTHORS;
	}
	
	static void saveToStorage(StorageType type, Object ob) {
		ObjectOutputStream out = null;
		try {
			Path path = FileSystems.getDefault().getPath(OUTPUT_DIR, type.toString());
			out = new ObjectOutputStream(Files.newOutputStream(path));
			out.writeObject(ob);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (Exception e) {
				}
			}
		}
	}

	static Object readFromStorage(StorageType type) {
		ObjectInputStream in = null;
		Object retVal = null;
		try {
			Path path = FileSystems.getDefault().getPath(OUTPUT_DIR, type.toString());
			in = new ObjectInputStream(Files.newInputStream(path));
			retVal = in.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (Exception e) {
				}
			}
		}
		return retVal;
	}
	
}
