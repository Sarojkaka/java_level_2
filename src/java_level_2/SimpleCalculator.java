package java_level_2;

import java.util.Scanner;

public class SimpleCalculator {
	int a, b ;
	Scanner sc = new Scanner(System.in);
	int addition() 
	{
		System.out.println("Enter  2 numbers for addition : ");
		a = sc.nextInt();
		b = sc.nextInt();
		return(a+b);
	}
	int subtraction() 
	{
		System.out.println("Enter  2 numbers for addition : ");
		a = sc.nextInt();
		b = sc.nextInt();
		return(a-b);
	}
	int multiplication() 
	{
		System.out.println("Enter  2 numbers for addition : ");
		a = sc.nextInt();
		b = sc.nextInt();
		return(a*b);
	}
	int division() 
	{
		System.out.println("Enter  2 numbers for addition : ");
		a = sc.nextInt();
		b = sc.nextInt();
		return(a/b);
	}
	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("\t\t\t   Welcome to simple Calculator");
		System.out.println("\t\t\t  ===============================");
		System.out.println("");
		System.out.println("Please Select the number for calculation you want to do: ");
		System.out.println("========================================================");
		System.out.println("");
		System.out.print("1.Addition ");
		System.out.print("2.Subtraction ");
		System.out.print("3.Multiplication ");
		System.out.println("4.Division ");
		System.out.println("========================================================");
		System.out.println("Enter the number : ");
		int choice = sc1.nextInt();
		SimpleCalculator objCal = new SimpleCalculator();
		int ans = 0;
		switch (choice) {
		case 1:
			ans = objCal.addition();
			break;
		case 2:
			ans = objCal.subtraction();
			break;
		case 3:
			ans = objCal.multiplication();
			break;
		case 4:
			ans = objCal.division();
			break;
		default:
			System.out.println("Wrong Selection");

		}
		System.out.println("Answer = "+ans);
	}

}
