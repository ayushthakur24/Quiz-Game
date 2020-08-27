package Bean;
import java.util.List;

public class Quiz {
String level;
List< Question > questions;
/**
 * @param level
 * @param questions
 */
public Quiz(String level, List<Question> questions) {
	super();
	this.level = level;
	this.questions = questions;
}
public String getLevel() {
	return level;
}
public void setLevel(String level) {
	this.level = level;
}
public List<Question> getQuestions() {
	return questions;
}
public void setQuestions(List<Question> questions) {
	this.questions = questions;
}
/**
 * 
 */
public Quiz() {
	super();
	// TODO Auto-generated constructor stub
}

}


/*

{
		"quiz" : "easy",
		"questions" : [
			{
			"text":"Sample Question 1",
			"options":["option1","option2", "option3", "option4"],
			"answer":[ 0 ]
			},
			{
			"text":"Sample Question 2",
			"options":["option1","option2", "option3", "option4"],
			"answer":[ 0,1 ]
			},
			{
			"text":"Sample Question 3",
			"options":["option1","option2", "option3", "option4"],
			"answer":[ 0,1 ]
			},
			
		]
}
*/