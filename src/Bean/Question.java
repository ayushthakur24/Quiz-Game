package Bean;
import java.util.List;

public class Question {
String text;
List< String > options;
String type;
String answer;
String imagePath;

/**
 * @param text
 * @param options
 * @param answers
 */
public Question(String text, List<String> options, String ans, String type, String imagePath ) {
	super();
	this.text = text;
	this.options = options;
	this.answer = ans;
	this.type = type;
	this.imagePath = imagePath;
}

@Override
public String toString() {
	return "Question [text=" + text + ", options=" + options + ", type=" + type + ", answer=" + answer + "]";
}

/**
 * 
 */
public Question() {
	super();
	// TODO Auto-generated constructor stub
}

public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
public List<String> getOptions() {
	return options;
}
public void setOptions(List<String> options) {
	this.options = options;
}

public String getAnswer() {
	return answer;
}

public void setAnswer(String answer) {
	this.answer = answer;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getImagePath() {
	return imagePath;
}

public void setImagePath(String imagePath) {
	this.imagePath = imagePath;
}


}
/*
{
"text":"Sample Question 1",
"options":["option1","option2", "option3", "option4"],
"answer":[ 0 ]
},
*/