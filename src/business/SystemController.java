package business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SystemController implements ControllerInterface {
	
	Set<LibraryMember> listOfMembers = new HashSet<>(Arrays.asList(
			new LibraryMember("Samuel", "Luswata", "0752816800", "610096"),
			new LibraryMember("Zinash", "Negga", "0773927100", "610095"),
			new LibraryMember("Kedi", "Edgar", "0776621606", "610132"),
			new LibraryMember("Niyonshuti", "Moses", "0782242462", "108886")
			));
	List<LibraryMember> admins = Arrays.asList(
			new LibraryMember("Samuel", "Luswata", "0752816800", "610096"),
			new LibraryMember("Zinash", "Negga", "0773927100", "610095"),
			new LibraryMember("Kedi", "Edgar", "0776621606", "610132"),
			new LibraryMember("Niyonshuti", "Moses", "0782242462", "108886")
			);
	List<LibraryMember> librarians = Arrays.asList(
			new LibraryMember("Samuel", "Luswata", "0752816800", "610096"),
			new LibraryMember("Zinash", "Negga", "0773927100", "610095"),
			new LibraryMember("Kedi", "Edgar", "0776621606", "610132"),
			new LibraryMember("Niyonshuti", "Moses", "0782242462", "108886")
			);
	List<LibraryMember> books = Arrays.asList(
			new LibraryMember("Samuel", "Luswata", "0752816800", "610096"),
			new LibraryMember("Zinash", "Negga", "0773927100", "610095"),
			new LibraryMember("Kedi", "Edgar", "0776621606", "610132"),
			new LibraryMember("Niyonshuti", "Moses", "0782242462", "108886")
			);
	
	

	@Override
	public void addCheckOutRecord() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<LibraryMember> getMembers() {
		// TODO Auto-generated method stub
		//CheckDB and store things here
		return listOfMembers;
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
	public void addBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Book editBook() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addLibMember(LibraryMember libMember) {
		// TODO Auto-generated method stub
		if(listOfMembers.add(libMember)) {
			return true;
		}
		return false;
		
	}

	@Override
	public boolean editLibMember(LibraryMember libMember) {
		if(getMembers().contains(libMember)) {
			listOfMembers.add(libMember);
			return true;
		}
		
		return false;
	}
	
	
	
	

}
