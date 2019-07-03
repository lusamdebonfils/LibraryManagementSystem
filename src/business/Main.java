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
			System.out.println("Testing for user before Login : "+ controller.currentUserType);
			DataAccessFacade.loadUserMap(testUsers);
			System.out.println("Enter both user name and password to authenticate");
			System.out.print("UserID : ");
			String uid = input.next();
			System.out.println("password : ");
			String pwd = input.next();
			controller.login(uid, pwd);
			System.out.println("Testing for user After Login : "+ controller.currentUserType);
			
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	List<User> testUsers = Arrays.asList(
			new User("lusam","Luswata Samuel" ,"12345", UserType.ADMIN),
			new User("niyo","Niyoshuti Moses" ,"12345", UserType.LIBRARAIN),
			new User("kedi","Kedi Emmanuel" ,"12345", UserType.ADMIN));
	
	Set<LibraryMember> listOfMembers = new HashSet<>(Arrays.asList(
			new LibraryMember("Samuel", "Luswata", "0752816800", "610096"),
			new LibraryMember("Zinash", "Negga", "0773927100", "610095"),
			new LibraryMember("Kedi", "Edgar", "0776621606", "610132"),
			new LibraryMember("Niyonshuti", "Moses", "0782242462", "108886")
			));
	
	public static void main(String[] args) {
		new Main();
	}
	
	

}
