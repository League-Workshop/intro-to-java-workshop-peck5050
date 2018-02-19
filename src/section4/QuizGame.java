package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		// 1.  Create a variable to hold the user's score 
		int score=0;
		// 2.  Ask the user a question 
		String answer=JOptionPane.showInputDialog("How many people are there in the world?");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equals("7,000,000,000")){
		// 4.  if the user's answer is correct
		JOptionPane.showMessageDialog(null, "Good Job");
		}// -- add one to their score 
		else {JOptionPane.showMessageDialog(null,"You lose!");
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		answer=JOptionPane.showInputDialog("Where was the first town of the United States?");
		if(answer.equals("St.Augustine,Florida")) {
			JOptionPane.showMessageDialog(null, "Hot Shot");
		}
		else {
			JOptionPane.showMessageDialog(null, "learn your history");
		}
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
