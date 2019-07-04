package business;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import dataaccess.DataAccess;
import dataaccess.DataAccessFacade;
import exception.UserException;

public class Main {
	
	public Main() {
		SystemController controller = new SystemController();
		Scanner input = new Scanner(System.in);
		try {
			/*
			System.out.println("Testing for user before Login : "+ controller.currentUserType);
			DataAccessFacade.loadUserMap(testUsers);
			System.out.println("Enter both user name and password to authenticate");
			System.out.print("UserID : ");
			String uid = input.next();
			System.out.println("password : ");
			String pwd = input.next();
			controller.login(uid, pwd);
			System.out.println("Testing for user After Login : "+ controller.currentUserType);
			*/
			/*
			DataAccessFacade.loadMembersMap(listOfMembers);
			LibraryMember bula = new LibraryMember("Brian", "Musoyisoyi", "077826622", "6183636");
			Address bulaAddress = new Address("Mbarara", "Kampala", "Main Street", "256");
			controller.addLibMember(bula.getFirstName(), bula.getLastName(), bula.getPhone(),
					bula.getMemeberID(), bulaAddress.getStreet(), bulaAddress.getCity(), bulaAddress.getState(), bulaAddress.getZipCode());
			
			controller.getMemberIDs().forEach((e)->{
				System.out.println(e);
			});
			controller.getMembers().forEach((e)->{
				System.out.println(e.getFirstName());
			});
			*/
			//controller.savetoBookList(books);
			controller.getBooks().get(0).getBookCopies().forEach((e)->{
				System.out.println(e.getCopyID());
			});
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	List<User> testUsers = Arrays.asList(
			new User("lusam","Luswata Samuel" ,"12345", UserType.ADMIN),
			new User("niyo","Niyoshuti Moses" ,"12345", UserType.LIBRARAIN),
			new User("zebro","Zinash Negga Zebro" ,"12345", UserType.LIBRARAIN),
			new User("kedi","Kedi Emmanuel" ,"12345", UserType.BOTH));
	
	List<LibraryMember> listOfMembers = new ArrayList<>(Arrays.asList(
			new LibraryMember("Samuel", "Luswata", "0752816800", "610096"),
			new LibraryMember("Zinash", "Negga", "0773927100", "610095"),
			new LibraryMember("Kedi", "Edgar", "0776621606", "610132"),
			new LibraryMember("Niyonshuti", "Moses", "0782242462", "108886")
			));
	

	 Book b1 = new Book("HSUWYET3638", "Intro To JAVA", 21);
	 Book b2 = new Book("JU274DHFY44", "Intro To ALGO", 7);
	 Book b3 = new Book("DBVUDU38WNF", "Intro To DS", 21);
	 Book b4 = new Book("BVYDHEY37DB", "Intro To SOFTWARE", 7);
	 Book b5 = new Book("E03DBFYEJND", "Intro To PROGRAMMING", 21);
	 Book b6 = new Book("DGEEICNIENBD", "Intro To MPP", 7);
	 BookCopy bc1 =  new BookCopy("281736", b1);
	BookCopy bc2 = 	new BookCopy("46764", b1);
	BookCopy bc3 = 	new BookCopy("45345", b1);
	BookCopy bc4 = 	new BookCopy("3464", b2);
	BookCopy bc5 = 	new BookCopy("34677", b2);
	BookCopy bc6 = 	new BookCopy("78964", b2);
	BookCopy bc7 = 	new BookCopy("3346", b3);
	BookCopy bc8 = 	new BookCopy("23467", b3);
	BookCopy bc9 = 	new BookCopy("34689", b3);
	BookCopy bc10 = new BookCopy("372824", b4);
	BookCopy bc11 = new BookCopy("35678", b4);
	BookCopy bc12 = new BookCopy("98765", b4);
	BookCopy bc13 = new BookCopy("346742", b5);
	BookCopy bc14 = new BookCopy("35790", b5);
	BookCopy bc15 = new BookCopy("96434", b5);
	BookCopy bc16 = new BookCopy("46764", b6);
	BookCopy bc17 = new BookCopy("345790", b6);
	BookCopy bc18 = new BookCopy("64223", b6);
		
	 List<Book> books = Arrays.asList(b1, b2, b3, b4, b5);
	 
	 
	 
	public static void main(String[] args) {
		new Main();
	}
	
	

}
