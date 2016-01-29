package edu.pitt.is1017.spaceinvaders;

import java.sql.*;

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
		DbUtilities db = new DbUtilities();
		ResultSet rs = db.getResultSet("SELECT userID FROM users WHERE userID = " + uID);
		try {

			while (rs.next()) {
				if (rs.getInt("userID") == uID) {
					lastName = rs.getString("lastName");
					firstName = rs.getString("firstName");
					email = rs.getString("email");
					password = rs.getString("password");
					break;
				}
				System.out.println(lastName + " " + firstName + " " + password);
			}
		} catch (SQLException e) {
			e.printStackTrace();
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
		sql = sql + "('" + lName + "','" + fName + "','" + fName + "','" + pass + "');";
		System.out.println(sql);
		db.executeQuery(sql);
	}

	public void saveUserInfo() {

	}
}
