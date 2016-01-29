package edu.pitt.is1017.spaceinvaders;

import java.security.*;
import java.sql.*;

public class Tester {

	public static void main(String[] args) {
		DbUtilities db = new DbUtilities();

		// MessageDigest md = MessageDigest.getInstance("SHA");

		String firstName = "Harry", lastName = "Black", email = "hb4@pitt.edu", password = "test321";
		// password = md.getInstance(password);

		String sql = "INSERT INTO alieninvasion.users ";
		sql = sql + "(lastName,firstName,email,password) ";
		sql = sql + "VALUES ";
		sql = sql + "('" + lastName + "','" + firstName + "','" + email + "','" + password + "');";
		System.out.println(sql);

		db.executeQuery(sql);
		// ResultSet rs = db.getResultSet(sql);
		// try {
		// while(rs.next()){
		// rs.getInt("userID");
		// rs.getString("lastName");
		// rs.getString("firstName");
		// rs.getString("email");
		// rs.getString("password");
		// }
		// rs.last();
		// rs.getRow();
		// System.out.println(rs.getRow());
		//

		// INSERT INTO table_name ( field1, field2,...fieldN )
		// VALUES
		// ( value1, value2,...valueN );
		// String sql = “INSERT INTO alieninvasion.users “;
		// sql = sql + “(lastName,firstName, email, password) ”;
		// sql = sql + “ VALUES ”;
		// sql = sql + “(‘Doe’, ‘John’, ‘john.doe@pitt.edu’, ‘test123’); “;
		// String query = “SELECT * FROM books.booklist”;
		// Statement statement = connection.createStatement();
		// ResultSet rs = statement.executeQuery (query);
		// while(rs.next()){
		// rs.getInt(“bookId”); // gets value of the bookId field
		// rs.getString(“isbn”); // gets value of the isbn field
		// rs.getString(2); // gets value of the title field
		// rs.getString(3); // gets value of the author field
		// }
		//
		// } catch (SQLException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}

}
