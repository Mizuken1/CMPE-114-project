package ourproject;

import java.util.ArrayList;
import java.util.Scanner;

public class print {

	
	public static boolean printword(String answear, ArrayList<Character> guess) {
		int correctcount=0;
		int tries=0;
		for(int i=0;i<answear.length();i++) {
			
			if(guess.contains(answear.charAt(i))) {
				System.out.print(answear.charAt(i));
				correctcount++;
			}
			else {
				System.out.print("-");
				tries++;
			}
			}
		System.out.println();
			return (correctcount==answear.length());
		
	}

	static boolean getguess(Scanner in,String answear,ArrayList<Character> guess) {
		System.out.println("enter letter");

		String playerguess= in.nextLine();
		guess.add(playerguess.charAt(0));
		return answear.contains(playerguess);
	}	 
}
