import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class CAI2 {

static Scanner scan = new Scanner(System.in);

	
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
		
		System.out.println("System Will Exit");
		System.exit(0);
	}
	
	public static void displayIncorrectResponses(int correctAnswer) {
		
		int newGuess;
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
		
		newGuess = scan.nextInt();
		isAnswerCorrect(newGuess, correctAnswer);
		
	}
	
	public static void isAnswerCorrect(int userGuess, int answer) {
		
		
		while (userGuess != answer) {
			displayIncorrectResponses(answer);
		}
		
		if (userGuess == answer) {
			displayCorrectResponses();
		}
	}
	public static void quiz() {
		
		int correctAnsr, randomNumber1, randomNumber2, guessedAnswer;
		
		Random rando = new SecureRandom();
		
		randomNumber1 = rando.nextInt(10);
		randomNumber2 = rando.nextInt(10);
		
		correctAnsr = randomNumber1 * randomNumber2;
		
		askQuestion(randomNumber1, randomNumber2);
		
		guessedAnswer = readAnswer();
		
		isAnswerCorrect(guessedAnswer, correctAnsr);
	
	
	}

}
