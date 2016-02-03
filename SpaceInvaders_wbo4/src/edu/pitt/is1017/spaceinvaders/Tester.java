package edu.pitt.is1017.spaceinvaders;

import java.security.*;
import java.sql.*;

public class Tester {

	public static void main(String[] args) {
		DbUtilities db = new DbUtilities();
<<<<<<< HEAD
		
		
		//MessageDigest md = MessageDigest.getInstance("SHA");
		
		//String firstName = "Harry", lastName = "Black", email = "hb4@pitt.edu", password = "test321";
		//password = md.getInstance(password);
		
//		String sql = "INSERT INTO alieninvasion.users ";
//		sql = sql +"(lastName,firstName,email,password) ";
//		sql = sql +"VALUES ";
//		sql = sql +"('"+lastName+"','"+firstName+"','"+email+"','"+password+"');";
//		System.out.println(sql);
//		         ("SELECT * FROM users");
		
		
// ============SELECT QUERY TEST======================================================	
		
		ResultSet rs = db.getResultSet("SELECT * FROM users");	
		try {			
			while (rs.next()) {
				int id = rs.getInt("userID"); // gets value of the userID field
				String firstName = rs.getString("lastName"); // gets value of the lastName field
				String lastNames = rs.getString("firstName"); // gets value of the firstName field
				String email = rs.getString("email"); // gets value of the email field
				String password = rs.getString("password"); // gets value of the password field
				System.out.println(id + " " + firstName + " " + lastNames + " " + email + " " + password);				
			}			
		} catch (SQLException e) {
			System.out.println("SQL exception occured" + e);
			e.printStackTrace();
		}
		
// ==========END SELECT QUERY TEST=======================================================			
		
			
			
//			INSERT INTO table_name ( field1, field2,...fieldN )
//			VALUES
//			( value1, value2,...valueN );
//			String sql = “INSERT INTO alieninvasion.users “;
//			sql = sql + “(lastName,firstName, email, password) ”;
//			sql = sql + “ VALUES ”;
//			sql = sql + “(‘Doe’, ‘John’, ‘john.doe@pitt.edu’, ‘test123’); “;
//			String query = “SELECT * FROM books.booklist”;
//			Statement statement = connection.createStatement();
//			ResultSet rs = statement.executeQuery (query);
//			while(rs.next()){
//				rs.getInt(“bookId”); // gets value of the bookId field
//				rs.getString(“isbn”); // gets value of the isbn field
//				rs.getString(2); // gets value of the title field
//				rs.getString(3); // gets value of the author field
//			}
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 try {
//	         Connection con = DriverManager.getConnection
//	         ("jdbc:derby://localhost:1527/testDb","username",
//	         "password");
//	         Statement stmt = con.createStatement();
//	         ResultSet rs = stmt.executeQuery
//	         ("SELECT * FROM employee");
//	         System.out.println("id  name    job");
//	         while (rs.next()) {
//	            int id = rs.getInt("id");
//	            String name = rs.getString("name");
//	            String job = rs.getString("job");
//	            System.out.println(id+"   "+name+"    "+job);
//	         }
//	      }
//	      catch(SQLException e){
//	         System.out.println("SQL exception occured" + e);
//	      }
=======

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
>>>>>>> origin/master
	}
}
