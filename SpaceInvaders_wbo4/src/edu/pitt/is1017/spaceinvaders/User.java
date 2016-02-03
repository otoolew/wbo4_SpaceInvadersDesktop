package edu.pitt.is1017.spaceinvaders;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

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
	 * @param receives
	 *            userID interger ID as an argument, retrieves data from the
	 *            database (select from users) for that userID and sets
	 *            appropriate class properties.
	 */
	public User(int uID) {
		userID = uID;
		boolean found = false;
		DbUtilities db = new DbUtilities();
		ResultSet rs = db.getResultSet("SELECT * FROM users");	
		try {			
			while (rs.next()) {
				int id = rs.getInt("userID"); // gets value of the userID field
				if(id == userID){
					System.out.println(id + " found. ");// Debug
					found = true;
					firstName = rs.getString("lastName"); // gets value of the lastName field
					lastName = rs.getString("firstName"); // gets value of the firstName field
					email = rs.getString("email"); // gets value of the email field
					password = rs.getString("password"); // gets value of the password field
					break;
				}								
			}
		} catch (SQLException e) {
			System.out.println("SQL exception occured" + e);
			e.printStackTrace();
		}
		if(found){
			JOptionPane.showMessageDialog(null, "I found you "+firstName);
		}else{
			JOptionPane.showMessageDialog(null, "User ID NOT FOUND!");
		}
	}

	/**
	 * This constructor receives userID and password as arguments and checks
	 * them against database
	 * 
	 * @param receives
	 *            user email as an argument, retrieves data from the database
	 * @param receives
	 *            user password as an argument, retrieves data from the database
	 */
	public User(String em, String pass) {
		boolean found = false;
		boolean match = false;
		DbUtilities db = new DbUtilities();
		ResultSet rs = db.getResultSet("SELECT * FROM users");	
		try {			
			while (rs.next()) {
				int id = rs.getInt("userID"); // gets value of the userID field
				if(id == userID){
					System.out.println(id + " found. ");// Debug
					found = true;
					firstName = rs.getString("lastName"); // gets value of the lastName field
					lastName = rs.getString("firstName"); // gets value of the firstName field
					email = rs.getString("email"); // gets value of the email field
					password = rs.getString("password"); // gets value of the password field
					break;
				}								
			}
		} catch (SQLException e) {
			System.out.println("SQL exception occured" + e);
			e.printStackTrace();
		}
		if(found){
			JOptionPane.showMessageDialog(null, "I found you "+firstName);
		}else{
			JOptionPane.showMessageDialog(null, "User ID NOT FOUND!");
		}
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
		
		String encryptedPass = null;
		try {
			encryptedPass = encryptSHA256(pass);
		} catch (NoSuchAlgorithmException e) {
			System.out.println("Encryption failed");
			e.printStackTrace();// Debug
		}
		
		DbUtilities db = new DbUtilities();
		String sql = "INSERT INTO alieninvasion.users ";
		sql = sql + "(lastName,firstName,email,password) ";
		sql = sql + "VALUES ";
		sql = sql + "('" + lName + "','" + fName + "','" + em + "','" + encryptedPass + "');";
		//System.out.println(sql);// Debug
		db.executeQuery(sql);
		
		//JOptionPane.showMessageDialog(null, "Registered User " + em);
	}

	/**
	 * @author Referenced Link
	 *         {@link}http://www.mkyong.com/java/java-sha-hashing-example/
	 * @param pass
	 * @return String in Hex Format
	 * @throws NoSuchAlgorithmException
	 */
	public String encryptSHA256(String pass) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(pass.getBytes());
		byte byteData[] = md.digest();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < byteData.length; i++) {
			sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
		}
		System.out.println("Hex format : " + sb.toString());
		return sb.toString();
	}

	public void saveUserInfo() {
		
	}
}
