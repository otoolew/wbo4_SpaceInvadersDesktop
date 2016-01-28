package edu.pitt.is1017.spaceinvaders;
/**
 * An entity which represents one of our space invader aliens.
 * 
 * @author William O'Toole
 */
public class User {
	private int userID;
	private String lastName;
	private String firstName;
	private String email;
	private String password;
	private boolean loggedIn = false;
	
	/** 
	 * This constructor is only used to create an instance of a user that 
	 * already exists in the database.
	 * 
	 * @param receives userID interger ID as an argument, retrieves data from the database 
	 * (select from users) for that userID and sets appropriate class properties.
	 */
	public User(int uID) {
		
	}
	
	/** 
	 * This constructor receives userID and password as arguments and checks them against database
	 * 
	 * @param receives user email as an argument, retrieves data from the database 
	 * @param receives user password as an argument, retrieves data from the database
	 */
	public User(String em, String pass) {
		
	}
	
	/** 
	 * This constructor is only called when you are creating an instance of a new user
	 * registering a new game player (insert into users).
	 * 
	 * @param receives user Last Name as an argument, inserts data into database
	 * @param receives user First Name as an argument, inserts data into database
	 * @param receives user email as an argument, inserts data into database
	 * @param receives user password as an argument, inserts data into database
	 */
	public User(String lName, String fName, String em, String pass) {

	}
	
	public void saveUserInfo(){
		
	}
}
