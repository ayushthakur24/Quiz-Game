package Bean;

import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.io.IOException;
import java.util.List;
import java.util.Scanner; // Import the Scanner class to read text files

import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadFile {
	public static Quiz readQuizData(String quizName) {
		ObjectMapper mapper = new ObjectMapper();
		Quiz quiz = null;
		try {
			String filePath = ".\\Resources\\" + quizName;
			quiz = mapper.readValue(new File(filePath), Quiz.class);		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return quiz;
	}
	public static Users readUserData() {
		ObjectMapper mapper = new ObjectMapper();
		Users users = null;
		try {
			users = mapper.readValue(new File(".\\Resources\\user.json"), Users.class);		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println( users.getStudents().get(0).user);
		return users;
	}
	
	public static Score[] readUserResults() {
		ObjectMapper mapper = new ObjectMapper();
		//UserResults userResults = null;
		Score[] score = null;
		try {
			score = mapper.readValue(new File(".\\Resources\\userResults.json"), Score[].class);		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	System.out.println(  userResults.getScores().size() );
		return score;
	}
	
	public static void main(String[] args) {
//		Quiz readQuizData = readQuizData();
//		System.out.println( readQuizData );
		System.out.println(readUserData().getStudents());
		
	}
}
