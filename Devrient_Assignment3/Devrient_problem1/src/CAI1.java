import java.util.Random;
import java.util.Scanner;
import java.security.SecureRandom;

/* 
 * we need to write a multiplication program
 * 
 * each number will be a SecureRandom integer
 * only two numbers are needed
 * once numbers are generated, prompt multiplication question with those numbers
 * check answer
 * if wrong
 * 		repeat question until it is correct
 */


public class CAI1 {
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
	
	public static void displayCorrectResponse() {
		System.out.println("Very Good!");
		System.out.println("System Will Exit");
		System.exit(0);
	}
	
	public static void displayIncorrectResponse(int correctAnswer) {
		
		int newGuess;
		
		System.out.println("No, Please try again.");
		newGuess = scan.nextInt();
		isAnswerCorrect(newGuess, correctAnswer);
		
	}
	
	public static void isAnswerCorrect(int userGuess, int answer) {
		
		
		while (userGuess != answer) {
			displayIncorrectResponse(answer);
		}
		
		if (userGuess == answer) {
			displayCorrectResponse();
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
	
	


