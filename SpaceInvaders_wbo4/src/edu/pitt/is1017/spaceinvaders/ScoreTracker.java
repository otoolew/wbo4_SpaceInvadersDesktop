package edu.pitt.is1017.spaceinvaders;

import java.sql.ResultSet;
import java.util.UUID;

import javax.swing.JOptionPane;

/**
 * ScoreTracker UML -user:User -currentScore:int -highestScore:int
 * -gameID:String +ScoreTracker(user:User) +recordScore(point:int)
 * +recordFinalScore();
 * 
 * @author Jack
 */
public class ScoreTracker {
	private User user;
	private int currentScore;
	private int highestScore;
	private String gameID;

	/**
	 * Receives a user object (logged in user) as an argument and sets the
	 * corresponding class property Initializes currentScore to zero Initializes
	 * gameID to a UUID - universally unique identifier
	 * (https://docs.oracle.com/javase/7/docs/api/java/util/UUID.html) Retrieves
	 * the value of the highest score for any game that the user has ever played
	 * (QUERY)
	 * 
	 * @param player
	 */
	public ScoreTracker(User player) {
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
	 * Set currentScore property
	 * 
	 * @param currentScore
	 */
	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}

	/**
	 * @return highestScore
	 */
	public int getHighestScore() {
		return highestScore;
	}

	/**
	 * @param highestScore
	 */
	public void setHighestScore(int highestScore) {
		this.highestScore = highestScore;
	}

	/**
	 * You must call this method every time you fire at the alien ships. point
	 * parameter must be either -1 or 1. In other words, every time you fire, if
	 * you hit an alien ship, add one point to the score. If you miss, subtract
	 * one point.
	 * 
	 * Every time you call recordScore() must: Update currentScore property (add
	 * or subtract 1 point) INSERT currentScore into runningscores table
	 * 
	 * @param point
	 */
	public void recordScore(int point) {
		int scoreType;
		
		if (point == -1) {
			scoreType = 0;
			this.currentScore--;
		} else {
			scoreType = 1;
			this.currentScore++;
		}
		DbUtilities db = new DbUtilities();
		String sql = "INSERT INTO runningscores(`gameID`,`scoreType`,`scoreValue`,`fk_userID`,`dateTimeEntered`)";
		sql = sql + "VALUES('" + gameID + "'," + scoreType + "," + this.getCurrentScore() + "," + user.getUserID() + ",NOW());";
		System.out.println(sql);
		db.executeQuery(sql);
		db.closeConnection();		
		// INSERT INTO
		// alieninvasion.runningscores(`gameID`,`scoreType`,`scoreValue`,`fk_userID`,`dateTimeEntered`)
		// VALUES("252dff46-2197-48c4-a4dd-d371597c2645",1,34,"98",NOW());
	}

	/**
	 * When the game is over, INSERT the final value of currentScore into
	 * finalscores table
	 */
	public void recordFinalScore() {
		DbUtilities db = new DbUtilities();
		String sql = "INSERT INTO finalscores(`scoreID`,`gameID`,`scoreValue`,`fk_userID`,`dateTimeEntered`)";
		sql = sql + "VALUES('" + gameID + "'," + this.getCurrentScore() + "," + user.getUserID() + ",NOW());";
		System.out.println(sql);
		db.executeQuery(sql);
		db.closeConnection();		
	}
	public void displayScores(){
		DbUtilities db = new DbUtilities();
		String sql = "SELECT lastName, firstName, MAX(scoreValue) FROM finalscores JOIN users ON fk_userID = userID GROUP BY lastName, firstName ORDER BY `MAX(scoreValue)` DESC;";		
		ResultSet rs = db.getResultSet(sql);
		
		
		db.closeResultSet(rs);
		db.closeConnection();
		JOptionPane.showMessageDialog(null,sql);
	}

}