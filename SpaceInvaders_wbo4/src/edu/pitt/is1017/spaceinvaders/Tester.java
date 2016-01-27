package edu.pitt.is1017.spaceinvaders;

public class Tester {

	public static void main(String[] args) {
		DbUtilities db = new DbUtilities();
		
		String firstName = "Bill", lastName = "O'Toole", email = "wbo4@pitt.edu";
		
		String query = "INSERT userID FROM users";
		
		String sql = "INSERT INTO alieninvasion.users ";
		sql = sql + "(lastName,firstName, email, password)";
		sql = sql + "VALUES";
//		sql = sql + “(‘Doe’, ‘John’, ‘john.doe@pitt.edu’, ‘test123’); “;
		// Query Successful
		// Just a little change
		db.executeQuery(query);
	
		
		
	}

}
