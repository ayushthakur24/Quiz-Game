package Bean;

import java.util.ArrayList;
import java.util.List;

/*
 * 	"scores" : 
		[
			{
			"UserName":""
			"Score": "",
			"Date" : "",
			"Difficulty" : ""
			}
		]
 */
public class UserResults {
List< Score > scores = new ArrayList< Score >();

public List<Score> getScores() {
	return scores;
}

public void setScores(List<Score> scores) {
	this.scores = scores;
}

/**
 * @param scores
 */
public UserResults(List<Score> scores) {
	super();
	this.scores = scores;
}

/**
 * 
 */
public UserResults() {
	super();
	// TODO Auto-generated constructor stub
}

}
