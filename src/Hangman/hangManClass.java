package Hangman;

public class hangManClass {
	
	// word collection
	private static String[] words = { "java", "python", "computer", "ruby", "server", "windows", "linux", "mac","program","software" };

	// random word pop up while programming is running
	public static String word = words[(int) (Math.random() * words.length)];

	// user input of guessing word
	public static String guessword = new String(new char[word.length()]).replace("\0", "_");

	// user answer count
	public static int count = 0;

//function
	public static void hang(String guess) {
		String newguessword = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == guess.charAt(0)) {
				newguessword += guess.charAt(0);
			} else if (guessword.charAt(i) != '_') {
				newguessword += word.charAt(i);
			} else {
				newguessword += "_";
			}
		}
		//if user input is wrong
		if (guessword.equals(newguessword)) {
			count++;
			hangmanImage();
		} else {
			guessword = newguessword;
			System.out.println(guessword);
		}
		if (guessword.equals(word)) {

			System.out.println("Correct! You win! The word was " + word);
		}
	}

	
	
	
	//Hangman Image 
	public static void hangmanImage() {
		if (count == 1) {
			System.out.println("Wrong guess, try again");

			System.out.println("________");
			System.out.println("|/   |   ");
			System.out.println("|       ");
			System.out.println("|       ");
			System.out.println("|       ");
		}
		if (count == 2) {
			System.out.println("Wrong guess, try again");
			System.out.println("________");
			System.out.println("|/   |   ");
			System.out.println("|    o  ");
			System.out.println("|       ");
			System.out.println("|       ");
		}
		if (count == 3) {
			System.out.println("Wrong guess, try again");
			System.out.println("________");
			System.out.println("|/   |   ");
			System.out.println("|    o  ");
			System.out.println("|   /|\\   ");
			System.out.println("|       ");

		}
		if (count == 4) {
			System.out.println("Wrong guess, try again");
			System.out.println("________");
			System.out.println("|/   |   ");
			System.out.println("|    o  ");
			System.out.println("|   /|\\   ");
			System.out.println("|    |    ");
		}
		if (count == 5) {
			System.out.println("Wrong guess, try again");
			System.out.println("________");
			System.out.println("|/   |   ");
			System.out.println("|    o  ");
			System.out.println("|   /|\\   ");
			System.out.println("|    |    ");
			System.out.println("|   / \\   ");
			System.out.println("GAME OVER! The word was " + word);
		}
	}
}