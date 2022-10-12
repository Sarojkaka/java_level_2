package java_level_2;

import java.util.Scanner;

public class StudentInformation {
	public static Scanner sc = new Scanner(System.in);
	static int choice = 1;

	public static void main(String[] args) {

		// creating object:>Syntax classname objectName = new Classname();
		Student s1 = new Student();
		while (choice == 1) {
			System.out.println("Enter ID : ");
			s1.id = sc.nextInt();
			System.out.println("Enter First Name : ");
			s1.firstName = sc.next();
			System.out.println("Enter Last Name : ");
			s1.lastName = sc.next();
			System.out.println("Enter Age : ");
			s1.age = sc.nextInt();
			System.out.println("Enter Gender : ");
			s1.gender = sc.next();
			System.out.println("Enter Grade : ");
			s1.grade = sc.next();
			System.out.println("---------------------------");
			System.out.println("    Student Information    ");
			System.out.println("---------------------------");
			s1.printStudentInfo();
			System.out.println("Do you wish to continue? Press 1 to continue");
			choice = sc.nextInt();

		}
	}
}

//creating class of student(blueprint)
class Student {
	// properties of student
	int id;
	String firstName;
	String lastName;
	int age;
	String gender;
	String grade;

	// making functions
	void printStudentInfo() {
		System.out.println("ID is : " + this.id);
		System.out.println("First Name is : " + this.firstName);
		System.out.println("Last Name is : " + this.lastName);
		System.out.println("Age is : " + this.age);
		System.out.println("Gender is : " + this.gender);
		System.out.println("Grade is : " + this.grade);

	}
}
