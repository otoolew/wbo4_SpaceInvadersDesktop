package edu.pitt.is1017.spaceinvaders;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

/**
 * ScoreTracker UML
 *-user:User
 *-currentScore:int
 *-highestScore:int
 *-gameID:String
 *+ScoreTracker(user:User)
 *+recordScore(point:int)
 *+recordFinalScore();
 * @author Jack
 */
public class ScoreTracker {
	private User user;
	private int currentScore;
	private int highestScore;
	private String gameID;
	
	/**
	 * Receives a user object (logged in user) as an argument and sets the corresponding class property 
	 * Initializes currentScore to zero 
	 * Initializes gameID to a UUID - universally unique identifier (https://docs.oracle.com/javase/7/docs/api/java/util/UUID.html)
	 * Retrieves the value of the highest score for any game that the user has ever played (QUERY)
	 * @param player
	 */
	public ScoreTracker(User player){
		this.user = player;
		currentScore = 0;
		highestScore = getHighestScore();
		gameID = UUID.randomUUID().toString();
	}
	
	/**
	 * @return currentScore
	 */
	public int getCurrentScore() {
		return currentScore;
	}
	/**
	 * @param currentScore
	 */
	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}
	/** 
	 * @return highestScore
	 */
	public int getHighestScore() {
		int result = 0;
		int scoreTemp = 0;
		DbUtilities db = new DbUtilities();
		ResultSet rs = db.getResultSet("SELECT * FROM alieninvasion.finalscores WHERE fk_userID = "+user.getUserID()+";");
			
		try {
			while (rs.next()) {
				scoreTemp = rs.getInt("scoreValue");
				if (scoreTemp > highestScore) {
					highestScore = scoreTemp;
				}
			}
		} catch (SQLException e) {
			System.out.println("SQL exception occured" + e);
			e.printStackTrace();
		}
		db.closeConnection();
		System.out.println(result);
		return result;
	}
	/**
	 * @param highestScore
	 */
	public void setHighestScore(int highestScore) {
		this.highestScore = highestScore;
	}
	
	/**
	 * You must call this method every time you fire at the alien ships.
	 * point parameter must be either -1 or 1.  
	 * In other words, every time you fire, if you hit an alien ship, add one point to the score.  
	 * If you miss, subtract one point.
	 * 
	 * Every time you call recordScore() must:
	 * Update currentScore property (add or subtract 1 point)
	 * INSERT currentScore into runningscores table
	 * @param point
	 */
	public void recordScore(int point){
		int scoreType;
		if(point==-1){
			scoreType = 0;
		}else{
			scoreType = 1;
		}
		//String date = Calendar.time;
		DbUtilities db = new DbUtilities();
		String sql = "INSERT INTO alieninvasion.runningscores ";
		sql = sql + "(gameID,scoreType,scoreValue,fk_userID,dateTimeEntered) ";
		sql = sql + "VALUES ";
		sql = sql + "('"+gameID+"',"+scoreType+","+point+","+user.getUserID()+",FORMAT(Now(),'YYYY-MM-DD HH:MM:SS'));";
		boolean successfulQuery = db.executeQuery(sql);
		System.out.println("Class ScoreTracker Method recordScore: "+successfulQuery);// Debug
	}
	
	/**
	 * When the game is over, INSERT the final value of currentScore into finalscores table
	 */
	public void recordFinalScore(){
		
	}
	
	
	
}