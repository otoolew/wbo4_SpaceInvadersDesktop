Assignment #4

Task 1 (5 points): This task, should you chose to accept it is as follows - whenever player logs in, instead of displaying a message your program should launch the game.

Task 2 (10 points): If you received any feedback about issues with your program from the GSA, make sure you fix them before continuing.  If you did not receive any comments and your previous assignment was perfect, you get free 10 points (Figure 2)

Task 3 (30 points): Create a new class ScoreTracker.  
	-ScoreTracker(user:User) constructor:
		Receives a user object (logged in user) as an argument and sets the corresponding class property
		Initializes currentScore to zero 
		Initializes gameID to a UUID - universally unique identifier (https://docs.oracle.com/javase/7/docs/api/java/util/UUID.html)
		Retrieves the value of the highest score for any game that the user has ever played (QUERY)
		recordScore(point:int) - records running score
	-You must call this method every time you fire at the alien ships.
		point parameter must be either -1 or 1.  In other words, every time you fire, if you hit an alien ship, add one point to the score.  If you miss, subtract one point.
		Every time you call recordScore() must:
		Update currentScore property (add or subtract 1 point)
		INSERT currentScore into runningscores table
	-recordFinalScore()
		When the game is over, INSERT the final value of currentScore into finalscores table
		Generate getters for currentScore and highestScore properties
		finalscores table
	-Generate getters for currentScore and highestScore properties

Task 4 (35 points)
	-Identify places in existing code where projectiles are fired at the alien ships and the logic of the program identifies hits. The point of this part of the assignment is that you actually go through the provided code and understand how it works.  You can ask your classmates for help (if they are willing to help you), but you cannot ask the instructor or the GSA.
	-If there is a hit, call recordScore(1)
	-If a projectile was fired, but no hit was recorded, call recordScore(-1)
	-When the game is complete - either you won or got destroyed by the evil alien invaders (Figure 3) - you need to call recordFinalScore()
	-Hint #1: when you declare an instance of ScoreTracker, the object should be a global variable.  
	-Hint #2: you have to re-instantiate the ScoreTracker object every time you start a new game.

Task 5 (20 points)
	-When the player finishes a game, display a message that shows the following information:
	the highest scores for you.
	SELECT scoreValue FROM finalscores WHERE fk_userID = [Your User ID] AND gameID = '[Current Game ID]';
	the name and the highest scores for the leader (another player who has scores higher than you).
	SELECT lastName, firstName, MAX(scoreValue) FROM finalscores JOIN users ON fk_userID = userID GROUP BY lastName, firstName
	You can use JOptionPane.showMessageDialog()
