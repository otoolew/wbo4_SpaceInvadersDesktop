package edu.pitt.is1017.spaceinvaders;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Assignment 3 ERRORS Corrected
 * closeConnection() is not called. (Fixed on lines 96, 131, 161, 182) 
 * The userID is not a string. So, in select query, the userID should not be enclosed within ' '. (Fixed at line 84)
 * Second User() is incomplete. (Need more direction)
 * 
 * An entity which represents one of our space invader aliens.
 
 * @author William O'Toole
 */
public class User {
	// Variables
	private int userID;
	private String lastName;
	private String firstName;
	private String email;
	private String password;
	private boolean loggedIn;
	
	// GETTERS and SETTERS
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public int getUserID() {
		return userID;
	}
	// END OF GETTERS AND SETTERS
	/**
	 * This constructor is only used to create an instance of a user that
	 * already exists in the database.
	 * 
	 * @param receives
	 *            userID interger ID as an argument, retrieves data from the
	 *            database (select from users) for that userID and sets
	 *            appropriate class properties.
	 */
	public User(int uID) {
		userID = uID;		
		DbUtilities db = new DbUtilities();
		ResultSet rs = db.getResultSet("SELECT * FROM users WHERE userID = "+uID+";");	
		try {
			rs.next();
			userID = rs.getInt("userID");
			lastName = rs.getString("lastName");
			firstName = rs.getString("firstName");
			email = rs.getString("email");
			password = rs.getString("password");
		} catch (SQLException e) {
			System.out.println("SQL exception occured" + e);
			e.printStackTrace();
		}
		db.closeConnection();//Assignment 3 Correction
	}

	/**
	 * This constructor receives email and password as arguments and checks them
	 * against database
	 * 
	 * @param receives
	 *            user email as an argument, retrieves data from the database
	 * @param receives
	 *            user password as an argument, retrieves data from the database
	 */
	public User(String em, String pass) {
		loggedIn=false;
		DbUtilities db = new DbUtilities();

		ResultSet rs = db
				.getResultSet("SELECT * FROM users WHERE email ='" + em + "' AND password = MD5('" + pass + "');");
		try {
			rs.next();
			userID = rs.getInt("userID");
			lastName = rs.getString("lastName");
			firstName = rs.getString("firstName");
			email = rs.getString("email");
			password = rs.getString("password");
			loggedIn = true;
			JOptionPane.showMessageDialog(null, 
					"Login Confirmed");
		} catch (SQLException e) {
			System.out.println("SQL exception occured" + e);
			JOptionPane.showMessageDialog(null, 
					"Login Error"+
					"\nPlease Try again");
			loggedIn = false;
		}
		db.closeConnection();//Assignment 3 Correction
	}

	/**
	 * This constructor is only called when you are creating an instance of a
	 * new user registering a new game player (insert into users).
	 * 
	 * @param receives
	 *            user Last Name as an argument, inserts data into database
	 * @param receives
	 *            user First Name as an argument, inserts data into database
	 * @param receives
	 *            user email as an argument, inserts data into database
	 * @param receives
	 *            user password as an argument, inserts data into database
	 */
	public User(String lName, String fName, String em, String pass) {
		DbUtilities db = new DbUtilities();
		String sql = "INSERT INTO alieninvasion.users ";
		sql = sql + "(lastName,firstName,email,password) ";
		sql = sql + "VALUES ";
		sql = sql + "('" + lName + "','" + fName + "','" + em + "'," + "MD5('"+pass+"')" + ");";
		//System.out.println(sql);// Debug
		boolean successfulQuery = db.executeQuery(sql);
		
		if(successfulQuery){
			JOptionPane.showMessageDialog(null, "Registered User " + em);
		}else{
			JOptionPane.showMessageDialog(null, "Registeration Failed!");
		}
		db.closeConnection();//Assignment 3 Correction
	}
	/**
	 * Updates users table with values currently stored in class properties
	 */
	public void saveUserInfo() {
//		UPDATE table_name
//		SET column1=value1,column2=value2,...
//		WHERE some_column=some_value;
		DbUtilities db = new DbUtilities();
		String sql = "UPDATE alieninvasion.users ";
		sql = sql + "SET lastName = '" + lastName + "',firstName = '" + firstName + "',email = '" + email + "',password = MD5('"+password+"')";
		sql = sql + "WHERE userID = '" + userID + "';";		
		//System.out.println(sql);// Debug
		db.executeQuery(sql);
		boolean successfulQuery = db.executeQuery(sql);
		if(successfulQuery){
			JOptionPane.showMessageDialog(null, "User Updated Successfully!");
		}else{
			JOptionPane.showMessageDialog(null, "User Update Failed!");
		}
		db.closeConnection();
	}
	
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append(firstName+"\n");	
		str.append(lastName+"\n");
		str.append(email+"\n");
		str.append(password+"\n");
		str.append("Login State: "+loggedIn);
		return str.toString();
	}
}
