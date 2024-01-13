package ourproject;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Hangman {

	public static void main(String[] args) {
		System.out.println("Welcome to hangman!");
		System.out.println("guess the word:");
Scanner input= new Scanner(System.in);
	String [] arr= new String []{"naruto","beinggay","asda","vvvjhbhjb"};
	Random ran= new Random();
	String answear = arr[ran.nextInt(arr.length)];
	
	
	ArrayList<Character> guess= new ArrayList<>();
	System.out.println(answear);
	
	while (true) {
	getplayerguess(input, answear, guess);
	
	if(printwordstate(answear,guess)) {
		System.out.println("you win!");
		break;
		
	}}
}

	private static void getplayerguess(Scanner input, String answear, ArrayList<Character> guess) {
		System.out.println("enter the letter:");
		String playerguess= input.nextLine();
		guess.add(playerguess.charAt(0));
		
	}

	private static boolean printwordstate(String answear, ArrayList<Character> guess) {
		int correctcount=0;
		for (int i =0;i<answear.length();i++) {
			
			if(guess.contains(answear.charAt(i))) {
				System.out.print(answear.charAt(i));
				correctcount++;}
			else {
					System.out.print("-");}
	
		}System.out.println();
		return (correctcount==answear.length());
	}}