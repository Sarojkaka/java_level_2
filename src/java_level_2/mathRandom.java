package java_level_2;

public class mathRandom {

	public static void main(String[] args) {

		//to print random number from 1 to 10
		//syntax > Math.random() * (max - min + 1) + min 
		int num = (int)(Math.random()*(10-1+1)+1);
		System.out.println(num);

	}

}
