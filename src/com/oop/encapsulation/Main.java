package com.oop.encapsulation;

import com.exceptions.enums.*;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.firstName = "Saroj";
		s1.lastName = "Khadka";
		s1.age = "20";
		s1.gender = "male";
		s1.setId("1");
		System.out.println(s1.getId());
		//		student1.id = "1";
		//		student1.password = "password";
		
		Student s2 = new Student();
		s2.firstName = "Ram";
		s2.lastName = "Doe";
		s2.age = "20";
		s2.gender = "female";
		//		student2.id = "2";
		//		student2.password = "password";
		
		s1.printName();
		s2.printName();
		
		for (Gender gen : Gender.values()) {
			System.out.println(gen);
			System.out.println(gen.getValue());
			System.out.println(gen.ordinal());
		}
	}
	
}