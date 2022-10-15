package Hangman;

import java.util.Scanner;

public class HangManMain {

	public static void main(String[] args) {

		hangManClass hm = new hangManClass();
		
		System.out.println("\t\t\t\t    Welcome to Hangman Game    ");
		System.out.println("\t\t\t\t=================================");
		System.out.println("First letter of word :"+hm.word.charAt((int) Math.random()));
		
		//user input
		Scanner sc = new Scanner(System.in);
		while (hm.count < 5 && hm.guessword.contains("_")) {
			System.out.println("");
			String guess = sc.next();
			hm.hang(guess);
		}
		sc.close();
	}
}