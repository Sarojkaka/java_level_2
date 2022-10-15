package java_level_2;
import java.util.Arrays;

public class SumAlternnateElement {
	
	public static int sum,sum1 = 0;

	public static void main(String[] args) {
		
		int num[] = { 1, 2, 3, 4, 5, 6,7 };
		System.out.println("Elements of the array are : " + Arrays.toString(num));
		
		//using for loop
		for (int i = 0; i < num.length; i = i + 2) {
			sum = sum + num[i];
		}
		for (int j = 1; j < num.length; j = j + 2) {
			System.out.println("Alternative Element : " + j);
		}
		System.out.println("   Sum of the Elements:" + sum);

		{
			for (int x = 1; x < num.length; x = x + 2) {
				sum1 = sum1 + num[x];
			}
			for (int y = 2; y < num.length; y = y + 2) {
				System.out.println("Alternative Element : " + y);
			}
			System.out.println("   Sum of the Elements:" + sum1);
		}

	}

}
