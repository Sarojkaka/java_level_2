package java_level_2;
import java.util.Arrays;
import java.util.Scanner;

public class nPoweredNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int pnum = sc.nextInt();
		int[] number = { 256, 1, 2, 3, 4, 5, 6, 7, 512, 8, 9, 10, 16, 32, 64, 128 };
		for (int i = 0; i < number.length; i++) {
			for (int j = 1; j < number[i]/2+1; j++)
				
				if (number[i] == Math.pow(pnum, j)) {

					System.out.println(number[i]);
					break;
				}

		}
	}
}