package Bean;
/*
 * "UserName":""
			"Score": "",
			"Date" : "",
			"Difficulty" : ""
 */
public class Score {
String userName;
String score;
String date;
String difficulty;


/**
 * 
 */
public Score() {
	super();
	// TODO Auto-generated constructor stub
}
/**
 * @param userName
 * @param score
 * @param date
 * @param difficulty
 */
public Score(String userName, String score, String date, String difficulty) {
	super();
	this.userName = userName;
	this.score = score;
	this.date = date;
	this.difficulty = difficulty;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getScore() {
	return score;
}
public void setScore(String score) {
	this.score = score;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getDifficulty() {
	return difficulty;
}
public void setDifficulty(String difficulty) {
	this.difficulty = difficulty;
}
}
