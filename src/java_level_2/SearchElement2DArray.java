package java_level_2;

import java.util.Scanner;

public class SearchElement2DArray {

	public static void main(String[] args) {
		int num[][] = { { 2, 0, 3 }, { 2, 3, 1 }, { 1, 1, 1 } };
		System.out.println("Enter the element that you want to search : ");
		Scanner sc = new Scanner(System.in);
		int search = sc.nextInt();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (num[i][j] == search) {
					System.out.println("Number in the index(" + i + ", " + j + " ).");
				}else
				{
					System.out.println("Not in list");
				}
			}
		}
		sc.close();
	}

}

		