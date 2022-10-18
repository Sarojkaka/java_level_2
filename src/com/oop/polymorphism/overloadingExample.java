package com.oop.polymorphism;

public class overloadingExample {
	
	//overloaded constructor
	overloadingExample(int a) {
		System.out.println("int arg cons");
	}
	
	overloadingExample(int a, int b) {
		System.out.println("int,int arg cons");
	}
	overloadingExample(char c) {
	System.out.println("char arg cons");
	}
	
	
	public static void main(String[] args) {
		
		//printing overloading method by making new class
		overloading ol = new overloading();
		ol.method1(1);
		ol.method1(1, 2);
		ol.method1('a');
		
		//operator overloading
		System.out.println("============================");
		System.out.println(10);
		System.out.println("saroj");
		//using contraction to join two arguments
		System.out.println(10+" : saroj");
		System.out.println("============================");
		
		
		//printing overload constructor
		new overloadingExample(1);
		new overloadingExample(1, 2);
		new overloadingExample('a');
	}

}
class overloading{
	
	//overloading
		void method1(int a){
			System.out.println("this is method 1");	
		}
		void method1(int a, int b){
			System.out.println("this is method 2");	
		}
		void method1(char c){
			System.out.println("this is method 3");	
		}
	
}