package java_level_2;

public class lengthOfLastWord {

	public static void main(String[] args) {
		String word = "Hello my name is Saroj";
		word.trim();
		int count = 0;
		for (int i = word.length() - 1; i >= 0; i--) {
			if (word.charAt(i) != ' ') {
				count++;
			}
			if (word.charAt(i) == ' ') {
				break;
			}
		}
		System.out.println("Length of last word is : " + count);
	}

}
