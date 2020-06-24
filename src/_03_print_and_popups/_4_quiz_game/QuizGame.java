package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score=0;
		// ASK A QUESTION AND CHECK THE ANSWER
		// 2.  Ask the user a question 
		String input=JOptionPane.showInputDialog("what type of iguana cannot swim?");
				// 3.  Use an if statement to check if their answer is correct
				if(input.equals("pink land iguana")){
				
				
				// 4.  if the user's answer was correct, add one to their score 
				score++;
	}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		input=JOptionPane.showInputDialog("in how many days does a leopard geckos tail fully grow back");
		if(input.equals("30")) {
			score++;
		}
		input=JOptionPane.showInputDialog("how many miles per hour does an aveage cheatah run");
		if(input.equals("58")) {
			score++;
		}
		// After all the questions have been asked, tell the user their final score 
		
	}
}
