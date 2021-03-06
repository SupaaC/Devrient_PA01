import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class CAI3 {

static Scanner scan = new Scanner(System.in);
	
	static float studentScore;
	static float finalScore;
	
	public static void main(String[] args) {
		
		quiz();
		
	
		}
	
	
	public static void askQuestion(int num1, int num2) {
		System.out.printf("What is %d times %d?\n", num1, num2);
	}
	
	public static int readAnswer() {

		int answer;
		
		System.out.println("Enter your answer:");
		
		answer = scan.nextInt();
	 
		return answer;
	}
	
	public static void displayCorrectResponses() {
		int selectorNumber;
		
		Random picker = new SecureRandom();
		
		selectorNumber = picker.nextInt(4);
		
		switch(selectorNumber) {
		case 0:{
			System.out.println("Very Good!");
			break;
		}
		case 1:{
			System.out.println("Excellent!");
			break;
		}
		case 2:{
			System.out.println("Nice work!");
			break;
		}
		case 3:{
			System.out.println("Keep it up!");
			break;
		}
		}
		
	
	}
	
	public static void finalMessage() {
		int extraProblems;
		
		finalScore = (studentScore/10) * 100;
	
		
		if (finalScore < 75) {
			System.out.printf("\nYour final score is: %2.0f%s \n", finalScore, '%');
			System.out.println("Please ask your teacher for help.");
			
		} else {
			System.out.printf("\nYour final score is: %2.0f%s \n", finalScore, '%');
			System.out.println("Congratulations, you are ready to go to the next level");
		}
		
		System.out.println("Would you like to complete another problem set? 1 for yes, or 0 for no");
		
		extraProblems = scan.nextInt();
		
		if (extraProblems == 1) {
			quiz();
		} else {
			System.out.println("System will exit");
			System.exit(0);
		}

	}
	
	public static void scoreCounter() {
		
		studentScore += 1;
		
	}
	
	public static void displayIncorrectResponses() {
		
		int selectorNumber;
		
		Random picker = new SecureRandom();
		
		selectorNumber = picker.nextInt(4);
		
		switch(selectorNumber) {
		case 0:{
			System.out.println("Try Again");
			break;
		}
		case 1:{
			System.out.println("Wrong. Once More");
			break;
		}
		case 2:{
			System.out.println("Dont give up.");
			break;
		}
		case 3:{
			System.out.println("No. Keep Trying.");
			break;
		}
		}

		
	}
	
	public static void isAnswerCorrect(int userGuess, int answer) {
		
		
		if (userGuess != answer) {
			displayIncorrectResponses();
		} else {
			displayCorrectResponses();
			scoreCounter();
		}
		
	}
	
	public static void quiz() {
		
		int correctAnsr, randomNumber1, randomNumber2, guessedAnswer, i;
		
		Random rando = new SecureRandom();
		
		studentScore = 0;
		
		for (i=0; i < 10; i++) {
			
			randomNumber1 = rando.nextInt(10);
			randomNumber2 = rando.nextInt(10);
			
			correctAnsr = randomNumber1 * randomNumber2;
		
			askQuestion(randomNumber1, randomNumber2);
			
			guessedAnswer = readAnswer();
			
			isAnswerCorrect(guessedAnswer, correctAnsr);
		
		}
		
		
		System.out.println("Completed 10 questions.");
		
		finalMessage();
	
	}

}
