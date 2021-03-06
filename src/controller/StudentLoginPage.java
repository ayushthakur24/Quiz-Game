package controller;
	import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import Bean.Question;
import Bean.Quiz;
import Bean.ReadFile;
import Bean.Score;
import Bean.UserResults;
import Bean.WriteJSONToFile;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayush
 */
public class StudentLoginPage extends javax.swing.JFrame {
	int questionCount = 0;
	String userName = "";
	int currentScore = 0;
	String difficulty = "";
	private static StudentLoginPage instance;
	Quiz quiz;
	private JSONArray convertScoresToResultSet;
    /**
     * Creates new form QuizPage
     */
    public StudentLoginPage() {
        initComponents();
        instance = this;
    }
    public static StudentLoginPage getInstance()
    {
    	return instance;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userNameValue = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ageGroupValue = new javax.swing.JComboBox<String>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 645));

       jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("quizPic.jpg"))); // NOI18N

        jLabel2.setText("Username");

        jLabel3.setText("Difficulty");

        jButton1.setText("Start");
        
        ageGroupValue.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "beginner", "intermediate", "expert"}));

        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(46, 46, 46)
                .addComponent(ageGroupValue, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageGroupValue, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentLoginPage().setVisible(true);
            }
        });
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	String userName = userNameValue.getText();
    	String ageGroup = (String)ageGroupValue.getSelectedItem();
    	difficulty = ageGroup;
    	if( userName != null && !userName.isEmpty())
    	{
    		if( ageGroup != null && !ageGroup.isEmpty() )
    		{
    			this.userName = userName;
    			String quizFile = getQuizByAgeGroup( ageGroup );
    			quiz = ReadFile.readQuizData( quizFile );
    			renderQuestionBasedOnType( );
    			//System.out.println( quizData.getQuestions() );
    			//this.setVisible(false);
    		}
    	}
    }                                        
    

	public void renderQuestionBasedOnType() {		
		QuestionMCQ questionMCQ = null;
		QuestionFTB questionFTB = null;
		QuestionImage questionImage = null;
		this.setVisible(false);
		System.out.println("questionCount " + questionCount );
		if( questionCount >= this.quiz.getQuestions().size() )
			{	
				showScore();
				return;
			}
		
		
	    Question question = this.quiz.getQuestions().get(questionCount);
		switch( question.getType() )
		{
		case "MCQ": if( questionMCQ == null )
					{
						questionMCQ = new QuestionMCQ( question );
						questionMCQ.setVisible(true);
					}
					else
						questionMCQ.loadComponents(question);
					break;
		case "FTB" :  if( questionFTB == null )
					{
						questionFTB = new QuestionFTB( question );
						questionFTB.setVisible(true);
					}
					else
						questionFTB.loadComponents(question);
					break;
		case "Image" :  if( questionImage == null )
						{
							questionImage = new QuestionImage( question );
							questionImage.setVisible(true);
						}
						else
							questionImage.loadComponents(question);
						break;
						}
	}

	private void showScore() {
		addScoreToUserResults(userName, this.currentScore);

		LastPage scorePage = new LastPage(userName, this.currentScore);
		scorePage.setVisible(true);
	}
	
	private void addScoreToUserResults(String userName, int currentScore) {
		List< Score > scores  = Arrays.asList(  ReadFile.readUserResults() );
		 
		Score newScore = addNewScore( userName, currentScore );
		JSONArray convertScoresToJSONArray = convertScoresToJSONArray( scores );
		convertScoresToJSONArray.add( convertScoreToJSONObject( newScore ) );
		
		WriteJSONToFile.writeJSON(convertScoresToJSONArray);
	}

	private JSONArray convertScoresToJSONArray(List<Score> scores) {
		JSONArray jsonArray = new  JSONArray();
		for (Iterator<Score> iterator = scores.iterator(); iterator.hasNext();) {
			jsonArray.add( convertScoreToJSONObject( iterator.next() ) );
		}
	return jsonArray;	
	}
	
	private JSONObject convertScoreToJSONObject(Score score) {		
	        JSONObject jsonScore = new JSONObject();
	        jsonScore.put( "userName", score.getUserName());
	        jsonScore.put( "score", score.getScore());
	        jsonScore.put( "difficulty", score.getDifficulty());
	        jsonScore.put( "date", score.getDate());
	return jsonScore;	
	}
	private Score addNewScore(String userName, int currentScore) {
		return new Score(userName, "" + currentScore, new Date().toString(), this.difficulty);
	}
	private String getQuizByAgeGroup(String ageGroup) {

    	switch( ageGroup )
    	{
    	case "beginner" 	: 	return "easy_quiz.json";
    	case "intermediate"	:	return "medium_quiz.json";
    	case "expert"		:	return "hard_quiz.json";
    	}
    return "invalid_quiz";
	}
	// Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField userNameValue;
    private javax.swing.JComboBox<String> ageGroupValue;
    // End of variables declaration                   
}
