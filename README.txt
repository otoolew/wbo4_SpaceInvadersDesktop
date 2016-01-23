INFSCI 1017 – Database Systems – Spring 2016
Homework 3 – JDBC + Java GUI


Connect to an external database server with MySQL Workbench using the following settings and credentials:
1.	Connection name: ***********
2.	Hostname:  ***********
3.	Port: ****
4.	Username: *********
5.	Password: *********
Once you are connected, you should see one database under the “SCHEMAS” section of your MySQL Workbench – alieninvasion.  

Task 1 (5 points): Import SpaceInvaders game code into a new Eclipse project.  The source code is available at https://drive.google.com/file/d/0B1igopmj-Vh6SE8tV2RNTXY0d1U/view?usp=sharing
Rename your project to SpaceInvaders_<your Pitt User Name>.  For example, my Pitt user name is dmb72, so my project would be named SpaceInvaders_dmb72

Task 2 (5 points): Download MySqlConnector library and add it to your SpaceInvaders project.

Task 3 (15 points): Import DBUtilities class available here: https://drive.google.com/file/d/0B1igopmj-Vh6THhRWlRtUEtvalk/view?usp=sharing
	Modify the class so that it allows you to connect to the alieninvasion database.
	Add a new public method closeConnection() that closes connection to the database.
	Make sure that any time you are done using your database connection in your program, you call the closeConnection() method clean up.  Remember, you only need to close connections after select queries.

Task 4 (20 points):  Create a new class called LoginGUI.  This is going to be your login screen.  The screen should look like this: 
 
	Login button should validate login against data in the database and (for now) display either a confirmation or an error message using JOptionPane.showMessageDialog()
	Cancel button should close this screen and exit the game.
	Register button does not do anything (yet)
Note:  This class only handles GUI - you should not have any business logic associated with the event handlers in this class.

Task 5 (30 points): Create a new class User.  

User
-userID:int
-lastName:String
-firstName:String
-email:String
-password:String
-loggedIn:boolean = false;
+User(userID:int)
+User(email:String, password:String)
+User(lastName:String, firstName:String,email:String,password:String)
+saveUserInfo()

	User(userID:int) receives userID as an argument, retrieves data from the database (select from users) for that userID and sets appropriate class properties.  This constructor is only used to create an instance of a user that already exists in the database.
	User(email:String, password:String) receives userID and password as arguments and checks them against database (select from users)  
	If matching entry exists:
	sets appropriate class properties
	sets loggedIn property to true
	displays confirmation message using JOptionPane.showMessageDialog()
	If matching entry does not exist:
	sets loggedIn property to false
	displays error (invalid login credentials) message using JOptionPane.showMessageDialog()
	User(lastName:String, firstName:String,email:String,password:String) sets appropriate class properties and saves user entry to the database.  This constructor is only called when you are creating an instance of a new user - registering a new game player (insert into users).
	saveUserInfo() - updates users table with values currently stored in class properties (update users set …).
	Generate getters and setters for all properties except for userID - userID only needs a getter.

Task 6 (20 points): Create a new class called RegisterGUI.  This is going to be your login screen.  The screen should look like this: 

 
	Register button should save user’s information to the database (think about which constructor of the User class to call.
	Cancel button should close Registration screen.

Due on Friday, February 5 by midnight.

